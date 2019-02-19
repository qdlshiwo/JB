package cn.zkingsoft.web.action;

import java.io.IOException;
import java.util.Calendar;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zkingsoft.pojo.User;
import cn.zkingsoft.service.UserService;
import cn.zkingsoft.service.impl.UserServiceImpl;
import cn.zkingsoft.util.Helper;
import cn.zkingsoft.web.core.ActionForm;
import cn.zkingsoft.web.core.ActionForward;
import cn.zkingsoft.web.core.DispatcherAction;
import cn.zkingsoft.web.form.LoginForm;
import cn.zkingsoft.web.form.RegisterForm;

/**
 * ÕâÊÇ×¢²á
 * @author Lxp
   */
public class RegisterAction extends DispatcherAction {

	public ActionForward zhuce(HttpServletRequest req, HttpServletResponse resp, ActionForm form)
			throws ServletException, IOException {
		RegisterForm rf = (RegisterForm) form;
		UserService us = new UserServiceImpl();
		User user = new User();
		user.setId(Helper.PrimaryKeyComplete());
		user.setUsername(rf.getUsername());
		user.setPassword(rf.getPassword());
		System.out.println(rf.getSex());
		user.setGender(rf.getSex());
		user.setEmail(rf.getEmail());
		user.setTelephone(rf.getTelephone());
		user.setIntroduce(rf.getIntroduce());
		user.setActivecode("123");
		user.setState(0);
		user.setRole("0");
		user.setRegistime("2019/2/20");
//		System.out.println(rf.getParam());
//		System.out.println(user.toString());
		boolean flag = us.addUsers(user);
//		System.out.println(flag);
		if(flag){
			//req.getSession().setAttribute("user", uf);
			return new ActionForward(true, "loginandregisterhtml");
		}else{
			System.out.println("×¢²áÊ§°Ü£¡");
			return new ActionForward(true, "error");
		}
	}
}
