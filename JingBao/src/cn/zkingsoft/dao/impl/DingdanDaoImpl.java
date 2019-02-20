package cn.zkingsoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.eclipse.jdt.internal.compiler.batch.Main;

import cn.zkingsoft.dao.DingdanDao;
import cn.zkingsoft.db.DBHelper;
import cn.zkingsoft.pojo.Dingdan;
import cn.zkingsoft.util.Helper;

public class DingdanDaoImpl implements DingdanDao{

	@Override
	public boolean addDingdan(Dingdan dingdan, Connection conn) throws Exception {
		boolean flag = false;
		String sql = "insert into web_dingdan values(?,?,?,?,?,?,?)";
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, dingdan.getDid());
		ps.setString(2, dingdan.getUid());
		ps.setString(3, dingdan.getPid());
		ps.setInt(4, dingdan.getDnum());
		ps.setInt(5, dingdan.getDno());
		ps.setString(6, dingdan.getAddress());
		ps.setDouble(7, dingdan.getDiscount());
		int n = ps.executeUpdate();
		if (n > 0) {
			flag = true;
		}
		ps.close();
		System.out.println("增加订单");
		return flag;
	}

	@Override
	public boolean deleteDingdan(String did, Connection conn) throws Exception {
		boolean flag = false;
		String sql = "delete from web_dingdan where did=?";
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, did);
		int n = ps.executeUpdate();
		if (n > 0) {
			flag = true;
		}
		ps.close();
		System.out.println("删除订单");
		return flag;
	}

	@Override
	public boolean updateDingdan(Dingdan dingdan, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Dingdan> selectAllDingdanByCondition(String did, Connection conn) throws Exception {
		List<Dingdan> list = new ArrayList<Dingdan>();
		String sql = "select * from web_dingdan where uid = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, did);
		rs = ps.executeQuery();
		while (rs.next()) {
			Dingdan dingdan = new Dingdan();
			dingdan.setDid(rs.getString("did"));
			dingdan.setUid(rs.getString("uid"));
			dingdan.setPid(rs.getString("pid"));
			dingdan.setDnum(rs.getInt("dnum"));
			dingdan.setDno(rs.getInt("dno"));
			dingdan.setAddress(rs.getString("address"));
			dingdan.setDiscount(rs.getDouble("discount"));
			list.add(dingdan);
		}
		rs.close();
		ps.close();
		return list;
	}

	@Override
	public List<Dingdan> selectAllDingdanByCondition(Connection conn) throws Exception {
//		System.out.println("selectdao");
		List<Dingdan> list = new ArrayList<Dingdan>();
		String sql = "select * from web_dingdan";
		PreparedStatement ps = null;
		ResultSet rs = null;
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Dingdan dingdan = new Dingdan();
			dingdan.setDid(rs.getString("did"));
			dingdan.setUid(rs.getString("uid"));
			dingdan.setPid(rs.getString("pid"));
			dingdan.setDnum(rs.getInt("dnum"));
			dingdan.setDno(rs.getInt("dno"));
			dingdan.setAddress(rs.getString("address"));
			dingdan.setDiscount(rs.getDouble("discount"));
			list.add(dingdan);
		}
		rs.close();
		ps.close();
		return list;
	}
	
}
