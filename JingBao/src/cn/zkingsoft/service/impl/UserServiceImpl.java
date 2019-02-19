package cn.zkingsoft.service.impl;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import cn.zkingsoft.dao.UserDao;
import cn.zkingsoft.dao.impl.UserDaoImpl;
import cn.zkingsoft.db.DBHelper;
import cn.zkingsoft.pojo.User;
import cn.zkingsoft.service.UserService;


public class UserServiceImpl implements UserService {
	private UserDao udi = new UserDaoImpl();

	@Override
	public boolean addUsers(User users) {
		System.out.println("service");
		boolean f = false;
		Connection conn = DBHelper.getConnection();
		try {
			conn.setAutoCommit(false);
			f = udi.addUser(users, conn);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return f;
	}

	@Override
	public boolean updateUsers(User users) {
		// TODO Auto-generated method stub
		boolean f = false;
		Connection conn = DBHelper.getConnection();
		try {
			conn.setAutoCommit(false);
			f = udi.updateUser(users, conn);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return f;
	}

	@Override
	public boolean removeUsers(String id) {
		boolean f = false;
		Connection conn = DBHelper.getConnection();
		try {
			conn.setAutoCommit(false);
			User user = udi.selectUserById(id, conn);
			f = udi.deleteUser(user, conn);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}

		return f;
	}

	@Override
	public User selectUsersById(String uid) {
		// TODO Auto-generated method stub
		User u = new User();
		Connection conn = DBHelper.getConnection();
		try {
			conn.setAutoCommit(false);
			u = udi.selectUserById(uid, conn);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return u;
	}

	@Override
	public List<User> selectUsersByCondition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<User> selectUsersByCondition(Map<String, String> condition) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User selectUserByUsername(String username) {
		// TODO Auto-generated method stub
		User user = new User();
		Connection conn = DBHelper.getConnection();
		try {
			conn.setAutoCommit(false);
			user = udi.selectUserByUsername(username, conn);
			conn.commit();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			try {
				conn.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		return user;
	}

	/**
	 * 判断用户名是否存在
	 * 
	 * @param jcb_name
	 * @return
	 */
	public boolean existName(String name) {
		boolean flag = false;
		List<User> list = new ArrayList<User>();
		List<String> str = new ArrayList<String>();
		Connection conn = DBHelper.getConnection();
		try {
			list = udi.selectAllUsers(conn);
			for (User user : list) {
				String username = user.getUsername();
				str.add(username);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if (str.contains(name)) {
			flag = true;
		} else {
			flag = false;
		}
		return flag;

	}

	public boolean Login(String name, String password) {
		boolean flag = false;
		Connection conn = DBHelper.getConnection();
		List<User> list = null;
		try {
			list = udi.selectAllUsers(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for (int i = 0; i < list.size(); i++) {
			if ((list.get(i).getUsername().equals(name)) && (list.get(i).getPassword().equals(password))) {
				flag = true;
				break;
			}
		}
		return flag;
	}

	@Override
	public List<User> selectAllUsers() {
		List<User> list = new ArrayList<User>();
		Connection conn = DBHelper.getConnection();
		try {
			list = udi.selectAllUsers(conn);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return list;
	}
}
