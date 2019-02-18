package cn.zkingsoft.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zkingsoft.web.core.ActionForm;
import cn.zkingsoft.web.core.ActionForward;
import cn.zkingsoft.web.core.DispatcherAction;
import cn.zkingsoft.web.form.LoginForm;

/**
 * 这是注册
 * @author Lxp
 *
 */
public class RegisterAction extends DispatcherAction{
	
	public ActionForward zhuce(HttpServletRequest req, HttpServletResponse resp, ActionForm form)
			throws ServletException, IOException {
		LoginForm uf = (LoginForm)form;
		if("lxp".equals(uf.getUname())&&"123".equals(uf.getUpass())){
			//----------------
			//这里留着查询service层的数据
			//----------------
			req.getSession().setAttribute("user", uf);
			return new ActionForward(true,"main");
		}else{
			return new ActionForward(true,"login");
		}
	}
}
