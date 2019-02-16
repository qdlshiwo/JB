package cn.zkingsoft.service;

import java.util.List;
import java.util.Map;

import cn.zkingsoft.pojo.Sptab;

public interface SptabService {
	public boolean addSptabs(Sptab Sptabs) throws Exception;
	public boolean updateSptabs(Sptab Sptabs) throws Exception;
	public boolean removeSptabs(String id) throws Exception;
	public Sptab selectSptabsById(String uid) throws Exception;
	public List<Sptab> selectSptabsByCondition() throws Exception;
	public List<Sptab> selectSptabsByCondition(Map<String, String> condition) throws Exception;
}
