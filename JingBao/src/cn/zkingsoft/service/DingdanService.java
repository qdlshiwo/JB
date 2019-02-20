package cn.zkingsoft.service;

import java.sql.Connection;
import java.util.List;

import cn.zkingsoft.pojo.Dingdan;

public interface DingdanService {
	public boolean addDingdan(Dingdan dingdan);
	public boolean deleteDingdan(String did);
	public boolean updateDingdan(Dingdan dingdan);
	public List<Dingdan> selectAllDingdanByCondition();
	//根据用户id查找该用户所有未付款的订单信息
	public List<Dingdan> selectAllDingdanByCondition(String uid);
}
