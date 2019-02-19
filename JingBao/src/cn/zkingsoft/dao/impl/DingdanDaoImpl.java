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
				+ "(did,uid,pid,dnum,dno,address,discount) "
				+ "values(?,?,?,?,?,?,?,?,?)";
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
	public boolean deleteDingdan(Dingdan dingdan, Connection conn) throws Exception {
		boolean flag = false;
		String sql = "delete from web_dingdan where did=?";
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		ps.setString(1, dingdan.getDid());
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
		String sql = "select * from web_dingdan where did = ?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		ps = conn.prepareStatement(sql);
		rs = ps.executeQuery();
		while (rs.next()) {
			Dingdan dingdan = new Dingdan();
			ps = conn.prepareStatement(sql);
			ps.setString(1, dingdan.getDid());
			ps.setString(2, dingdan.getUid());
			ps.setString(3, dingdan.getPid());
			ps.setInt(4, dingdan.getDnum());
			ps.setInt(5, dingdan.getDno());
			ps.setString(6, dingdan.getAddress());
			ps.setDouble(7, dingdan.getDiscount());
			list.add(dingdan);
		}
		rs.close();
		ps.close();
		return list;
	}

}
