package cn.zkingsoft.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.zkingsoft.dao.UserDao;
import cn.zkingsoft.pojo.User;

public class UserDaoImpl implements UserDao{

	@Override
	public boolean addUser(User user, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		String sql="insert into user values(?,?,?,?,?,?,?,?,?,?,?)";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, user.getId());
		ps.setString(2, user.getUsername());
		ps.setString(3, user.getPassword());
		ps.setString(4, user.getGender());
		ps.setString(5, user.getEmail());
		ps.setString(6, user.getTelephone());
		ps.setString(7, user.getIntroduce());
		ps.setString(8, user.getActiveCode());
		ps.setInt(9, user.getState());
		ps.setString(10, user.getRole());
		ps.setString(11, user.getRegisTime());
		int n = ps.executeUpdate();
		ps.close();
		if(n>0){
			return true;
		}
		return false;
	}

	@Override
	public boolean deleteUser(User user, Connection conn) throws Exception {
		// TODO Auto-generated method stub
		String id=user.getId();
		String sql="delect from user where id=?";
		PreparedStatement ps = conn.prepareStatement(sql);
		ps.setString(1, id);
		int n = ps.executeUpdate();
		if(n>0){
			return true;
		}
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
		User user=null;
		String sql="select * from user where id=?";
		PreparedStatement ps = null;
		ResultSet rs = null;
		
			ps=conn.prepareStatement(sql);
			ps.setString(1, id);
			rs=ps.executeQuery();
			if(rs.next()){
				user=new User();
				user.setId(rs.getString("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				user.setGender(rs.getString("gender"));
				user.setEmail(rs.getString("email"));
				user.setTelephone(rs.getString("telephone"));
				user.setIntroduce(rs.getString("introduce"));
				user.setActiveCode(rs.getString("activeCode"));
				user.setState(rs.getInt("state"));
				user.setRole(rs.getString("role"));
				user.setRegisTime(rs.getString("regisTime"));
				
			}
			rs.close();
			ps.close();
		return user;
	}

	@Override
	public List<User> selectAllUserByCondition(Connection conn) throws Exception {
		// TODO Auto-generated method stub
		List<User> list =new ArrayList<User>();
		
 		return null;
	}

	@Override
	public List<User> selectAllUserByCondition(Connection conn, Map<String, String> condition) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
