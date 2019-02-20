package cn.zkingsoft.web.action;

import java.io.IOException;

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
import cn.zkingsoft.web.form.AdminRegisterForm;

public class AdminRegisterAction extends DispatcherAction{
	public ActionForward zhuce(HttpServletRequest req, HttpServletResponse resp, ActionForm form)
			throws ServletException, IOException {
		AdminRegisterForm rf = (AdminRegisterForm) form;
		UserService us = new UserServiceImpl();
		User user = new User();
		user.setId(Helper.PrimaryKeyComplete());
		user.setUsername(rf.getUsername());
		System.out.println(user.getUsername()+"1111111111111111111111111111111");
		user.setPassword(rf.getPassword());
		user.setGender("1");
		user.setEmail("1");
		user.setTelephone("1");
		user.setIntroduce("1");
		user.setActivecode("1");
		user.setState(0);
		user.setRole("1");
		user.setRegistime("2019/2/20");
//		System.out.println(rf.getParam());
//		System.out.println(user.toString());
		boolean flag = us.addUsers(user);
//		System.out.println(flag);
		if(flag){
			//req.getSession().setAttribute("user", uf);
			return new ActionForward(true, "backin");
		}else{
			System.out.println("×¢²áÊ§°Ü£¡");
			return new ActionForward(true, "add");
		}
	}
}
