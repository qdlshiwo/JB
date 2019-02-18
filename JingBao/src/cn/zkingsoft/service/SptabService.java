package cn.zkingsoft.service;

import java.util.List;
import java.util.Map;

import cn.zkingsoft.pojo.Sptab;

public interface SptabService {
	public boolean addSptabs(Sptab sptab);

	public boolean updateSptabs(Sptab sptab);

	public boolean removeSptabs(Sptab sptab);

	public Sptab selectSptabsById(String pid);

	public List<Sptab> selectSptabsByCondition();

	public List<Sptab> selectSptabsByCondition(Map<String, String> condition);

	public List<Sptab> selectSptabsSplit(int pageSize, int pageNo);

	public int getMaxPageNo(int pageSize) ;
}
