package cn.zkingsoft.service;

import cn.zkingsoft.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
	public boolean addUsers(User users);

	public boolean updateUsers(User users);

	public boolean removeUsers(String id);

	public User selectUsersById(String uid);

	User selectUserByUsername(String username);

	public List<User> selectAllUsers();

	public List<User> selectUsersByCondition();

	public List<User> selectUsersByCondition(Map<String, String> condition);

	public boolean existName(String name);

	public boolean Login(String name, String password);
}
