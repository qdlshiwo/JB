package cn.zkingsoft.dao.impl;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import cn.zkingsoft.dao.SptabDao;
import cn.zkingsoft.pojo.Sptab;

public class SptabDaoImpl implements SptabDao{

	@Override
	public boolean addSptab(Sptab Sptab, Connection conn) throws Exception {
		return false;
	}

	@Override
	public boolean deleteSptab(Sptab Sptab, Connection conn) throws Exception {
		return false;
	}

	@Override
	public boolean updateSptab(Sptab Sptab, Connection conn) throws Exception {
		return false;
	}

	@Override
	public Sptab selectSptabById(String id, Connection conn) throws Exception {
		return null;
	}

	@Override
	public List<Sptab> selectAllSptabByCondition(Connection conn) throws Exception {
		return null;
	}

	@Override
	public List<Sptab> selectAllSptabByCondition(Connection conn, Map<String, String> condition) throws Exception {
		return null;
	}

}
