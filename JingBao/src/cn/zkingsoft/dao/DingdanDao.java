package cn.zkingsoft.dao;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import cn.zkingsoft.pojo.Dingdan;
import cn.zkingsoft.pojo.User;

public interface DingdanDao {
	boolean addDingdan(Dingdan dingdan,Connection conn) throws Exception;
	boolean deleteDingdan(Dingdan dingdan,Connection conn) throws Exception;
	boolean updateDingdan(Dingdan dingdan,Connection conn) throws Exception;
	//根据用户id查找该用户所有未付款的订单信息
	public List<Dingdan> selectAllDingdanByCondition(String uid,Connection conn) throws Exception;
}
