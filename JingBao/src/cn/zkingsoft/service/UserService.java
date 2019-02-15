package cn.zkingsoft.service;
import cn.zkingsoft.pojo.User;

import java.util.List;
import java.util.Map;

public interface UserService {
	public boolean addUsers(User users) throws Exception;
	public boolean updateUsers(User users) throws Exception;
	public boolean removeUsers(String id) throws Exception;
	public User selectUsersById(String uid) throws Exception;
	public List<User> selectUsersByCondition() throws Exception;
	public List<User> selectUsersByCondition(Map<String, String> condition) throws Exception;
}
