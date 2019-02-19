package cn.zkingsoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import cn.zkingsoft.dao.DingdanDao;
import cn.zkingsoft.pojo.Dingdan;

public class DingdanDaoImpl implements DingdanDao{

	@Override
	public boolean addDingdan(Dingdan dingdan, Connection conn) throws Exception {
		boolean flag = false;
		String sql = "insert into web_dingdan"
				+ "(uid,pid,pname,category,color,kucun,dnum,dprice,dno) "
				+ "values(?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, dingdan.getUid());
		ps.setString(2, dingdan.getPid());
		ps.setString(3, dingdan.getPname());
		ps.setString(4, dingdan.getCategory());
		ps.setString(5, dingdan.getColor());
		ps.setDouble(6, dingdan.getKucun());
		ps.setInt(7, dingdan.getDnum());
		ps.setDouble(8, dingdan.getDprice());
		ps.setInt(9, dingdan.getDno());
		int n = ps.executeUpdate();
		if (n > 0) {
			flag = true;
		}
		ps.close();
		System.out.println(flag);
		return flag;
	}

	@Override
	public boolean deleteDingdan(Dingdan dingdan, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDingdan(Dingdan dingdan, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Dingdan> selectAllDingdanByCondition(String uid, Connection conn) throws Exception {
		List<Dingdan> list = new ArrayList<Dingdan>();
		String sql = "select * from web_dingdan where uid = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Dingdan dingdan = new Dingdan();
			dingdan.setUid(rs.getString("uid"));
			dingdan.setPid(rs.getString("pid"));
			dingdan.setPname(rs.getString("pname"));
			dingdan.setCategory(rs.getString("category"));
			dingdan.setColor(rs.getString("color"));
			dingdan.setKucun(rs.getDouble("kucun"));
			dingdan.setDnum(rs.getInt("dnum"));
			dingdan.setDprice(rs.getDouble("dprice"));
			dingdan.setDno(rs.getInt("dno"));
			list.add(dingdan);
		}
		rs.close();
		ps.close();
		return list;
	}

}
