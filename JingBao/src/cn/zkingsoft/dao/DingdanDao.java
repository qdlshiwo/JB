package cn.zkingsoft.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import cn.zkingsoft.pojo.Dingdan;
import cn.zkingsoft.pojo.User;

public interface DingdanDao {
	public boolean addDingdan(Dingdan dingdan,Connection conn) throws Exception;
	public boolean deleteDingdan(Dingdan dingdan,Connection conn) throws Exception;
	public boolean updateDingdan(Dingdan dingdan,Connection conn) throws Exception;
	public List<Dingdan> selectAllDingdanByCondition(Connection conn) throws Exception;
	//根据用户id查找该用户所有未付款的订单信息
	public List<Dingdan> selectAllDingdanByCondition(String did,Connection conn) throws Exception;
}
