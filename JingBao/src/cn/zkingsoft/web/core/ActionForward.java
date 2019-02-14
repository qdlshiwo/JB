package cn.zkingsoft.web.core;

import java.io.IOException;
import java.util.Properties;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionForward {
	private boolean isRedirect = false;
	private String path = null;
	public ActionForward(String path) {
		this(false,path);
	}
	public ActionForward(boolean isRedirect,String path) {
		this.isRedirect=isRedirect;
		this.path=path;
	}
	public void forward(HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException  {
		//拿到应用程序中的配置文件信息
		Properties config = (Properties)req.getSession().getServletContext().getAttribute("config");
		if(isRedirect){
			resp.sendRedirect(config.getProperty(path));
		}else{
			req.getRequestDispatcher(config.getProperty(path)).forward(req, resp);
		}
	}
}
