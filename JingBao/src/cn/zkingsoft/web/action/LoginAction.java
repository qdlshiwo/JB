package cn.zkingsoft.web.action;

import java.io.IOException;

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

/**
 * 这是登录
 * 
 * @author Lxp
 *
 */
public class LoginAction extends DispatcherAction {

	public ActionForward denglu(HttpServletRequest req, HttpServletResponse resp, ActionForm form)
			throws ServletException, IOException {
		System.out.println("登录");
		LoginForm uf = (LoginForm) form;
		UserService us = new UserServiceImpl();
		try {
			System.out.println(uf.getUsername());
			User user = us.selectUserByUsername(uf.getUsername());
			if (user != null) {
				if (user.getPassword().equals(uf.getPassword())) {
					System.out.println("登录成功！");
					req.getSession().setAttribute("loginmsg", "登录成功！");
					req.getSession().setAttribute("user", user);//存用户登录的信息，可以在主页上显示用户名
					return new ActionForward(true, "show");
				} else {
					System.out.println("密码错误！");
					req.getSession().setAttribute("loginmsg", "密码错误！");
					return new ActionForward(true, "loginandregisterhtml");
				}
			} else {
				System.out.println("用户名错误！");
				req.getSession().setAttribute("loginmsg", "用户名错误！");
				return new ActionForward(true, "loginandregisterhtml");
			}
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		// if("lxp".equals(uf.getUname())&&"123".equals(uf.getUpass())){
		// //----------------
		// //这里留着查询service层的数据
		// //----------------
		// req.getSession().setAttribute("user", uf);
		// return new ActionForward(true,"show");
		// }else{
		// return new ActionForward(true,"loginandregisterhtml");
		// }
	}
}
