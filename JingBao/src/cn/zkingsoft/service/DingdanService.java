package cn.zkingsoft.service;

import java.sql.Connection;
import java.util.List;

import cn.zkingsoft.pojo.Dingdan;

public interface DingdanService {
	public boolean addDingdan(Dingdan dingdan);
	public boolean deleteDingdan(String did);
	public boolean updateDingdan(Dingdan dingdan);
	public List<Dingdan> selectAllDingdanByCondition();
	//�����û�id���Ҹ��û�����δ����Ķ�����Ϣ
	public List<Dingdan> selectAllDingdanByCondition(String uid);
}
