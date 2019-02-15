package cn.zkingsoft.dao.impl;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

import cn.zkingsoft.dao.UserDao;
import cn.zkingsoft.pojo.User;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean addUser(User user, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteUser(User user, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUser(User user, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public User selectUserById(String id, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectAllUserByCondition(Connection conn) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectAllUserByCondition(Connection conn, Map<String, String> condition) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
