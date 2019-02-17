package cn.zkingsoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.zkingsoft.dao.SptabDao;
import cn.zkingsoft.pojo.Sptab;

public class SptabDaoImpl implements SptabDao{
	/**
	 * 增加商品
	 */
	@Override
	public boolean addSptab(Sptab sptab, Connection conn) throws Exception {
		boolean flag = false;
		String sql = "insert into web_sptab"
				+ "(pid,pname,price,category,pnum,imgurl,description,color,cpu,gpu,neicun,yingpan,kucun,pstate,pinglun) "
				+ "values(?,?,?,?,?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, sptab.getPid());
		ps.setString(2, sptab.getPname());
		ps.setDouble(3, sptab.getPrice());
		ps.setString(4, sptab.getCategory());
		ps.setString(5, sptab.getPnum());
		ps.setString(6, sptab.getImgurl());
		ps.setString(7, sptab.getDescription());
		ps.setString(8, sptab.getColor());
		ps.setString(9, sptab.getCpu());
		ps.setString(10, sptab.getGpu());
		ps.setString(11, sptab.getNeicun());
		ps.setString(12, sptab.getYingpan());
		ps.setInt(13, sptab.getKucun());
		ps.setInt(14, sptab.getPstate());
		ps.setString(15, sptab.getPinglun());
		int n = ps.executeUpdate();
		if (n > 0) {
			flag = true;
		}
		ps.close();
		System.out.println(flag);
		return flag;
	}
	/**
	 * 删除商品
	 */
	@Override
	public boolean deleteSptab(Sptab sptab, Connection conn) throws Exception {
		boolean flag = false;
		String sql = "delete from web_sptab where pid=?";
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, sptab.getPid());
		int n = ps.executeUpdate();
		if (n > 0) {
			flag = true;
		}
		ps.close();
		System.out.println(flag);
		return flag;
	}
	/**
	 * 修改商品信息
	 */
	@Override
	public boolean updateSptab(Sptab sptab, Connection conn) throws Exception {
		boolean flag = false;
		String sql = "";
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, sptab.getPid());
		int n = ps.executeUpdate();
		if (n > 0) {
			flag = true;
		}
		ps.close();
		System.out.println(flag);
		return flag;
	}
	/**
	 * 根据主键查单个
	 */
	@Override
	public Sptab selectSptabById(String pid, Connection conn) throws Exception {
		Sptab sp = null;
		String sql = "select * from web_sptab where pid = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, pid);
		rs = ps.executeQuery();
		if (rs.next()) {
			sp = new Sptab();
			sp.setPid(rs.getString("pid"));
			sp.setPname(rs.getString("pname"));
			sp.setPrice(rs.getDouble("price"));
			sp.setCategory(rs.getString("category"));
			sp.setPnum(rs.getString("pnum"));
			sp.setImgurl(rs.getString("imgurl"));
			sp.setDescription(rs.getString("description"));
			sp.setColor(rs.getString("color"));
			sp.setCpu(rs.getString("cpu"));
			sp.setGpu(rs.getString("gpu"));
			sp.setNeicun(rs.getString("neicun"));
			sp.setYingpan(rs.getString("yingpan"));
			sp.setKucun(rs.getInt("kucun"));
			sp.setPstate(rs.getInt("pstate"));
			sp.setPinglun(rs.getString("pinglun"));
		}
		rs.close();
		ps.close();

		return sp;
	}
	/**
	 * 查所有
	 */
	@Override
	public List<Sptab> selectAllSptabByCondition(Connection conn) throws Exception {
		List<Sptab> list = new ArrayList<Sptab>();
		String sql = "select * from web_sptab";
		PreparedStatement ps = null;
		ResultSet rs = null;

		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Sptab sp = new Sptab();
			sp.setPid(rs.getString("pid"));
			sp.setPname(rs.getString("pname"));
			sp.setPrice(rs.getDouble("price"));
			sp.setCategory(rs.getString("category"));
			sp.setPnum(rs.getString("pnum"));
			sp.setImgurl(rs.getString("imgurl"));
			sp.setDescription(rs.getString("description"));
			sp.setColor(rs.getString("color"));
			sp.setCpu(rs.getString("cpu"));
			sp.setGpu(rs.getString("gpu"));
			sp.setNeicun(rs.getString("neicun"));
			sp.setYingpan(rs.getString("yingpan"));
			sp.setKucun(rs.getInt("kucun"));
			sp.setPstate(rs.getInt("pstate"));
			sp.setPinglun(rs.getString("pinglun"));
			list.add(sp);
		}
		rs.close();
		ps.close();
		return list;
	}
	/**
	 * 按条件查询
	 */
	@Override
	public List<Sptab> selectAllSptabByCondition(Connection conn, Map<String, String> condition) throws Exception {
		List<Sptab> list = new ArrayList<Sptab>();
		String sql = "select * from web_sptab where 1=1";
		Set<Map.Entry<String, String>> me = condition.entrySet();
		Map<String, Integer> m=new HashMap<String, Integer>();
		Set<Map.Entry<String, Integer>> mm = m.entrySet();
		int index = 0;
		//-----需要修改具体的比较条件
		for (Map.Entry<String, String> entry : me) {
			String k = entry.getKey();
			if("pname".equals(k)){
				sql += " and pname like ?";
				m.put("pname",++index);
			}
			if("min".equals(k)){
				sql += " and price>=?";
				m.put("min",++index);
			}
			if("max".equals(k)){
				sql += " and price<=?";
				m.put("max",++index);
			}
		}
		//------
		System.out.println("sql完成");
		System.out.println(sql);
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		for (Map.Entry<String, Integer> entry : mm) {
			String k = entry.getKey();
			System.out.println(k+"--------------------->"+"键");
			System.out.println(entry.getValue()+"--------------------->"+"值");
			System.out.println(condition.get(entry.getKey())+"--------------------->"+"数据");
			if("pname".equals(k)){
				ps.setString(entry.getValue(), "%"+condition.get(entry.getKey())+"%");
			}
			if("min".equals(k)){
				ps.setDouble(entry.getValue(), Double.parseDouble(condition.get(entry.getKey())));
			}
			if("max".equals(k)){
				ps.setDouble(entry.getValue(), Double.parseDouble(condition.get(entry.getKey())));
			}
		}
		ResultSet rs = null;

		
		rs = ps.executeQuery();
		while (rs.next()) {
			Sptab sp = new Sptab();
			sp.setPid(rs.getString("pid"));
			sp.setPname(rs.getString("pname"));
			sp.setPrice(rs.getDouble("price"));
			sp.setCategory(rs.getString("category"));
			sp.setPnum(rs.getString("pnum"));
			sp.setImgurl(rs.getString("imgurl"));
			sp.setDescription(rs.getString("description"));
			sp.setColor(rs.getString("color"));
			sp.setCpu(rs.getString("cpu"));
			sp.setGpu(rs.getString("gpu"));
			sp.setNeicun(rs.getString("neicun"));
			sp.setYingpan(rs.getString("yingpan"));
			sp.setKucun(rs.getInt("kucun"));
			sp.setPstate(rs.getInt("pstate"));
			sp.setPinglun(rs.getString("pinglun"));
			list.add(sp);
		}
		rs.close();
		ps.close();
		return list;
	}
	/**
	 * 根据商品名查找商品
	 */
	@Override
	public Sptab selectSptabByPname(String pname, Connection conn) throws Exception {
		Sptab sp = null;
		String sql = "select * from web_sptab where pname = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, pname);
		rs = ps.executeQuery();
		if (rs.next()) {
			sp = new Sptab();
			sp.setPid(rs.getString("pid"));
			sp.setPname(rs.getString("pname"));
			sp.setPrice(rs.getDouble("price"));
			sp.setCategory(rs.getString("category"));
			sp.setPnum(rs.getString("pnum"));
			sp.setImgurl(rs.getString("imgurl"));
			sp.setDescription(rs.getString("description"));
			sp.setColor(rs.getString("color"));
			sp.setCpu(rs.getString("cpu"));
			sp.setGpu(rs.getString("gpu"));
			sp.setNeicun(rs.getString("neicun"));
			sp.setYingpan(rs.getString("yingpan"));
			sp.setKucun(rs.getInt("kucun"));
			sp.setPstate(rs.getInt("pstate"));
			sp.setPinglun(rs.getString("pinglun"));
		}
		rs.close();
		ps.close();
		return sp;
	}

}
