package cn.zkingsoft.service;

import java.sql.Connection;
import java.util.List;

import cn.zkingsoft.pojo.Dingdan;

public interface DingdanService {
	public boolean addDingdan(Dingdan dingdan);
	public boolean deleteDingdan(Dingdan dingdan);
	public boolean updateDingdan(Dingdan dingdan);
	//�����û�id���Ҹ��û�����δ����Ķ�����Ϣ
	public List<Dingdan> selectAllDingdanByCondition(String uid);
}
