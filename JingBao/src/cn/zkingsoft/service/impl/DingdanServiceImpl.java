package cn.zkingsoft.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;

import cn.zkingsoft.dao.DingdanDao;
import cn.zkingsoft.dao.impl.DingdanDaoImpl;
import cn.zkingsoft.db.DBHelper;
import cn.zkingsoft.pojo.Dingdan;
import cn.zkingsoft.pojo.Sptab;
import cn.zkingsoft.service.DingdanService;

public class DingdanServiceImpl implements DingdanService{
	
	private DingdanDao ding=new DingdanDaoImpl();
	
	@Override
	public boolean addDingdan(Dingdan dingdan) {
		System.out.println("234");
		Connection conn = DBHelper.getConnection();
		boolean flag = false;
		try {
			conn.setAutoCommit(false);
			flag = ding.addDingdan(dingdan, conn);
			conn.commit();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			DBHelper.closeConnection(conn);
		}
		return flag;
	}

	@Override
	public boolean deleteDingdan(Dingdan dingdan) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateDingdan(Dingdan dingdan) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List<Dingdan> selectAllDingdanByCondition(String did) {
		Connection conn = DBHelper.getConnection();
		List<Dingdan> list = null;
		try {
			conn.setAutoCommit(false);
			list = ding.selectAllDingdanByCondition(did, conn);
			conn.commit();
		} catch (Exception e) {
			try {
				conn.rollback();
			} catch (SQLException e1) {
				e1.printStackTrace();
			}
		}finally{
			DBHelper.closeConnection(conn);
		}
		return list;
	}

}
