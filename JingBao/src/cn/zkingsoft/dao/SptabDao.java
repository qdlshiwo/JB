package cn.zkingsoft.dao;

import cn.zkingsoft.pojo.Sptab;
import java.sql.Connection;
import java.util.List;
import java.util.Map;


public interface SptabDao {
	boolean addSptab(Sptab sptab, Connection conn) throws Exception;

	boolean deleteSptab(Sptab sptab, Connection conn) throws Exception;

	boolean updateSptab(Sptab sptab, Connection conn) throws Exception;

	public Sptab selectSptabById(String pid, Connection conn) throws Exception;

	public List<Sptab> selectAllSptabByCondition(Connection conn) throws Exception;

	public List<Sptab> selectAllSptabByCondition(Connection conn, Map<String, String> condition) throws Exception;
	
	public Sptab selectSptabByPname(String pname, Connection conn) throws Exception;
}
