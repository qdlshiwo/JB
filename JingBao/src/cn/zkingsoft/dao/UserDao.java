package cn.zkingsoft.dao;

import cn.zkingsoft.pojo.User;

import java.sql.Connection;
import java.util.List;
import java.util.Map;

/**
 * 这是一个注释
 * 
 * @author lenovo
 *
 */
public interface UserDao {
	boolean addUser(User user, Connection conn) throws Exception;

	boolean deleteUser(User user, Connection conn) throws Exception;

	boolean updateUser(User user, Connection conn) throws Exception;

	User selectUserById(String id, Connection conn) throws Exception;

	User selectUserByUsername(String username, Connection conn) throws Exception;

	public List<User> selectAllUserByCondition(Connection conn) throws Exception;

	public List<User> selectAllUserByCondition(Connection conn, Map<String, String> condition) throws Exception;

	public List<User> selectAllUsers(Connection conn) throws Exception;
}
