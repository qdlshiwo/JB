package cn.zkingsoft.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import cn.zkingsoft.pojo.Sptab;


public interface SptabDao {
	boolean addSptab(Sptab Sptab,Connection conn) throws Exception;
	boolean deleteSptab(Sptab Sptab,Connection conn) throws Exception;
	boolean updateSptab(Sptab Sptab,Connection conn) throws Exception;
	Sptab selectSptabById(String id,Connection conn) throws Exception;
	public List<Sptab> selectAllSptabByCondition(Connection conn) throws Exception;
	public List<Sptab> selectAllSptabByCondition(Connection conn,Map<String, String> condition) throws Exception;
}
