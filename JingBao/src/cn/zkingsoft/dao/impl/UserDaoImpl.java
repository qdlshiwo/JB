package cn.zkingsoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import cn.zkingsoft.dao.UserDao;
import cn.zkingsoft.pojo.User;

//
public class UserDaoImpl implements UserDao {

	@Override
	public boolean addUser(User user, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		String sql = "insert into web_user values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user.getId());
		ps.setString(2, user.getUsername());
		ps.setString(3, user.getPassword());
		ps.setString(4, user.getGender());
		ps.setString(5, user.getEmail());
		ps.setString(6, user.getTelephone());
		ps.setString(7, user.getIntroduce());
		ps.setString(8, user.getActivecode());
		ps.setInt(9, user.getState());
		ps.setString(10, user.getRole());
		ps.setString(11, user.getRegistime());
		int n = ps.executeUpdate();
		System.out.println(n);
		if (n > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean deleteUser(User user, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		String id = user.getId();
		String sql = "delect from web_user where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, id);
		int n = ps.executeUpdate();
		if (n > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public boolean updateUser(User user, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		String str = user.getId();
		String sql = "update web_user set username=?,password=?,gender=?,email=?,telephone=?,introduce=?,activecode=?,state=?,role=?,registtime=?where id="
				+ str;
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user.getUsername());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getGender());
		ps.setString(4, user.getEmail());
		ps.setString(5, user.getTelephone());
		ps.setString(6, user.getIntroduce());
		ps.setString(7, user.getActivecode());
		ps.setInt(8, user.getState());
		ps.setString(9, user.getRole());
		ps.setString(10, user.getRegistime());
		int n = ps.executeUpdate();
		if (n > 0) {
			return true;
		} else {
			return false;
		}
	}

	@Override
	public User selectUserById(String id, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		User user = null;
		String sql = "select * from web_user where id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;

		ps = conn.prepareStatement(sql);
		ps.setString(1, id);
		rs = ps.executeQuery();
		if (rs.next()) {
			user = new User();
			user.setId(rs.getString("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setGender(rs.getString("gender"));
			user.setEmail(rs.getString("email"));
			user.setTelephone(rs.getString("telephone"));
			user.setIntroduce(rs.getString("introduce"));
			user.setActivecode(rs.getString("activeCode"));
			user.setState(rs.getInt("state"));
			user.setRole(rs.getString("role"));
			user.setRegistime(rs.getString("regisTime"));

		}
		rs.close();
		ps.close();
		return user;
	}

	@Override
	public List<User> selectAllUserByCondition(Connection conn) throws Exception {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		String sql = "select * from web_user";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			User user = new User();
			user.setId(rs.getString("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setGender(rs.getString("gender"));
			user.setEmail(rs.getString("email"));
			user.setTelephone(rs.getString("telephone"));
			user.setIntroduce(rs.getString("introduce"));
			user.setActivecode(rs.getString("activeCode"));
			user.setState(rs.getInt("state"));
			user.setRole(rs.getString("role"));
			user.setRegistime(rs.getString("regisTime"));
			list.add(user);
		}
		rs.close();
		ps.close();
		return list;
	}

	public List<User> selectAllUsers(Connection conn) throws Exception {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		String sql = "select * from web_user";
		PreparedStatement ps = conn.prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		while (rs.next()) {
			User user = new User();
			user.setId(rs.getString("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setGender(rs.getString("gender"));
			user.setEmail(rs.getString("email"));
			user.setTelephone(rs.getString("telephone"));
			user.setIntroduce(rs.getString("introduce"));
			user.setActivecode(rs.getString("activeCode"));
			user.setState(rs.getInt("state"));
			user.setRole(rs.getString("role"));
			user.setRegistime(rs.getString("regisTime"));
			list.add(user);
		}
		rs.close();
		ps.close();
		return list;
	}

	@Override
	public List<User> selectAllUserByCondition(Connection conn, Map<String, String> condition) throws Exception {
		// TODO Auto-generated method stub
		List<User> list = new ArrayList<User>();
		String sql = "select * from web_sptab where 1=1";
		Set<Map.Entry<String, String>> me = condition.entrySet();
		Map<String, Integer> m = new HashMap<String, Integer>();
		Set<Map.Entry<String, Integer>> mm = m.entrySet();
		int index = 0;
		// -----需要修改具体的比较条件
		for (Map.Entry<String, String> entry : me) {
			String k = entry.getKey();
			if ("uname".equals(k)) {
				sql += " and pname like ?";
				m.put("pname", ++index);
			}
			if ("min".equals(k)) {
				sql += " and price>=?";
				m.put("min", ++index);
			}
			if ("max".equals(k)) {
				sql += " and price<=?";
				m.put("max", ++index);
			}
		}
		// ------
		System.out.println("sql完成");
		System.out.println(sql);
		PreparedStatement ps = null;
		ps = conn.prepareStatement(sql);
		for (Map.Entry<String, Integer> entry : mm) {
			String k = entry.getKey();
			System.out.println(k + "--------------------->" + "键");
			System.out.println(entry.getValue() + "--------------------->" + "值");
			System.out.println(condition.get(entry.getKey()) + "--------------------->" + "数据");
			if ("uname".equals(k)) {
				ps.setString(entry.getValue(), "%" + condition.get(entry.getKey()) + "%");
			}
			if ("min".equals(k)) {
				ps.setDouble(entry.getValue(), Double.parseDouble(condition.get(entry.getKey())));
			}
			if ("max".equals(k)) {
				ps.setDouble(entry.getValue(), Double.parseDouble(condition.get(entry.getKey())));
			}
		}
		ResultSet rs = null;
		rs = ps.executeQuery();
		while (rs.next()) {
			User user = new User();
			user.setId(rs.getString("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setGender(rs.getString("gender"));
			user.setEmail(rs.getString("email"));
			user.setTelephone(rs.getString("telephone"));
			user.setIntroduce(rs.getString("introduce"));
			user.setActivecode(rs.getString("activeCode"));
			user.setState(rs.getInt("state"));
			user.setRole(rs.getString("role"));
			user.setRegistime(rs.getString("regisTime"));
			list.add(user);
		}
		rs.close();
		ps.close();
		return list;
	}

	@Override
	public User selectUserByUsername(String username, Connection conn) throws Exception {
		User user = null;
		String sql = "select * from web_user where username=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, username);
		ResultSet rs = ps.executeQuery();
		if (rs.next()) {
			user = new User();
			user.setId(rs.getString("id"));
			user.setUsername(rs.getString("username"));
			user.setPassword(rs.getString("password"));
			user.setGender(rs.getString("gender"));
			user.setEmail(rs.getString("email"));
			user.setTelephone(rs.getString("telephone"));
			user.setIntroduce(rs.getString("introduce"));
			user.setActivecode(rs.getString("activeCode"));
			user.setState(rs.getInt("state"));
			user.setRole(rs.getString("role"));
			user.setRegistime(rs.getString("regisTime"));
		}
		rs.close();
		ps.close();
		return user;
	}

}
