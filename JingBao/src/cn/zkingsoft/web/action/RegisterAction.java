package cn.zkingsoft.web.action;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zkingsoft.pojo.User;
import cn.zkingsoft.service.UserService;
import cn.zkingsoft.service.impl.UserServiceImpl;
import cn.zkingsoft.web.core.ActionForm;
import cn.zkingsoft.web.core.ActionForward;
import cn.zkingsoft.web.core.DispatcherAction;
import cn.zkingsoft.web.form.LoginForm;
import cn.zkingsoft.web.form.RegisterForm;

/**
 * 这是注册
 * 
 * @author Lxp
 *
 */
public class RegisterAction extends DispatcherAction {

	public ActionForward zhuce(HttpServletRequest req, HttpServletResponse resp, ActionForm form)
			throws ServletException, IOException {
		RegisterForm rf = (RegisterForm) form;
		UserService us = new UserServiceImpl();
		User user = new User();
		user.setId("主键id1");
		user.setUsername(rf.getUname());
		user.setPassword(rf.getUpass());
		user.setGender(rf.getSex());
		user.setEmail(rf.getEmail());
		user.setTelephone(rf.getTelphone());
		user.setIntroduce(rf.getInfo());
		user.setActivecode(null);
		user.setState(0);
		user.setRole("权限1");
		user.setRegistime("当前时间1");
		boolean flag = us.addUsers(user);
		if(flag){
			//req.getSession().setAttribute("user", uf);
			return new ActionForward(true, "loginandregisterhtml");
		}else{
			System.out.println("注册失败！");
			return new ActionForward(true, "loginandregisterhtml");
		}
	}
}
