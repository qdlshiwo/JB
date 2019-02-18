package cn.zkingsoft.web.action;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zkingsoft.web.core.ActionForm;
import cn.zkingsoft.web.core.ActionForward;
import cn.zkingsoft.web.core.DispatcherAction;
import cn.zkingsoft.web.form.RegisterForm;

/**
 * ÕâÊÇ×¢²á
 * @author Lxp
 *
 */
public class RegisterAction extends DispatcherAction{
	
	public ActionForward zhuce(HttpServletRequest req, HttpServletResponse resp, ActionForm form)
			throws ServletException, IOException {
			return new ActionForward(true,"loginandregisterhtml");
	}
}
