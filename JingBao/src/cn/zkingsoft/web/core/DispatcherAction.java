package cn.zkingsoft.web.core;

import java.io.IOException;
import java.lang.reflect.Method;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
/**
 * @author lenovo
  */
public class DispatcherAction implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse resp, ActionForm form)
			throws ServletException, IOException {
		System.out.println("DispatcherAction");
		String methodName = form.getParam();
		Class c = this.getClass();
		ActionForward af = null;
		if (methodName == null) {
			methodName = "undefined";
		}
		try {
			Method m = c.getMethod(methodName, new Class[] {
					HttpServletRequest.class, HttpServletResponse.class,
					ActionForm.class });
			af = (ActionForward) m.invoke(this, new Object[] { req,
					resp, form });
		} catch (Exception e) {
			e.printStackTrace();
		}
		return af;
	}
	public ActionForward undefined(HttpServletRequest request,
			HttpServletResponse reponse, ActionForm form)
			throws ServletException, IOException {
		return new ActionForward(true,"error");
	}
}
