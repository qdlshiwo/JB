package cn.zkingsoft.service.impl;

import java.sql.Connection;
import java.sql.SQLException;
import java.util.List;
import java.util.Map;

import cn.zkingsoft.dao.SptabDao;
import cn.zkingsoft.dao.impl.SptabDaoImpl;
import cn.zkingsoft.pojo.Sptab;
import cn.zkingsoft.service.SptabService;
import cn.zkingsoft.db.DBHelper;

public class SptabServiceImpl implements SptabService{
	
	private SptabDao spd = new SptabDaoImpl();
	
	@Override
	public boolean addSptabs(Sptab sptab){
		Connection conn = DBHelper.getConnection();
		boolean flag = false;
		try {
			conn.setAutoCommit(false);
			flag = spd.addSptab(sptab, conn);
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
	public boolean updateSptabs(Sptab sptab){
		Connection conn = DBHelper.getConnection();
		boolean flag = false;
		try {
			conn.setAutoCommit(false);
			flag = spd.updateSptab(sptab, conn);
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
	public boolean removeSptabs(Sptab sptab) {
		Connection conn = DBHelper.getConnection();
		boolean flag = false;
		try {
			conn.setAutoCommit(false);
			flag = spd.deleteSptab(sptab, conn);
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
	public Sptab selectSptabsById(String pid) {
		System.out.print("==========sptservice");
		Connection conn = DBHelper.getConnection();
		Sptab sp = null;
		try {
			conn.setAutoCommit(false);
			sp = spd.selectSptabById(pid, conn);
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
		return sp;
	}

	@Override
	public List<Sptab> selectSptabsByCondition() {
		Connection conn = DBHelper.getConnection();
		List<Sptab> list = null;
		try {
			conn.setAutoCommit(false);
			list = spd.selectAllSptabByCondition(conn);
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

	@Override
	public List<Sptab> selectSptabsByCondition(Map<String, String> condition){
		Connection conn = DBHelper.getConnection();
		List<Sptab> list = null;
		try {
			conn.setAutoCommit(false);
			list = spd.selectAllSptabByCondition(conn, condition);
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

	@Override
	public List<Sptab> selectSptabsSplit(int pageSize, int pageNo) {
		Connection conn = DBHelper.getConnection();
		List<Sptab> list = null;
		try {
			conn.setAutoCommit(false);
			list = spd.splitQuery(pageSize, pageNo, conn);
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

	@Override
	public int getMaxPageNo(int pageSize) {
		Connection conn = DBHelper.getConnection();
		int count = 0;
		try {
			conn.setAutoCommit(false);
			count = spd.getMaxPageNo(pageSize, conn);
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
		return count;
	}
	
}
