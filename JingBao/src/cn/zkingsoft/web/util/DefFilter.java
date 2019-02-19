package cn.zkingsoft.web.util;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import cn.zkingsoft.pojo.User;

public class DefFilter implements Filter{

	@Override
	public void destroy() {
		
	}

	@Override
	public void doFilter(ServletRequest arg0, ServletResponse arg1, FilterChain arg2)
			throws IOException, ServletException {
		HttpServletRequest request = (HttpServletRequest)arg0;
		HttpServletResponse response = (HttpServletResponse)arg1;
		Object obj = request.getSession().getAttribute("user");
		System.out.println("def---doFilter");
		if(obj!=null){
			//·ÅÐÐ
			request.getSession().setAttribute("loginstate",1);
			User user =(User)request.getSession().getAttribute("user");
			request.getSession().setAttribute("loginmsg","Welcome£¬"+user.getUsername());
		}else{
			request.getSession().setAttribute("loginmsg","Login");
			request.getSession().setAttribute("loginstate",0);
			System.out.println(request.getContextPath());
//			response.sendRedirect("/"+request.getContextPath()+"/index.jsp");
		}
		arg2.doFilter(request, response);
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		
	}

}
