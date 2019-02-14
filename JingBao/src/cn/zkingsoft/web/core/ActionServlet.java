package cn.zkingsoft.web.core;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ActionServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		this.doPost(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//将配置文件从应用程序中取出
		Properties config=(Properties)this.getServletContext().getAttribute("config");
		//将action实例池拿出来   用类名作为键，对应的实例作为值
		Properties actionpool=(Properties)this.getServletContext().getAttribute("actionpool");
		//得到页面提交的路径
		String uri=req.getRequestURI();
		//System.out.println(uri);//======/zking_java_web_20/calc.do
		//获得最后一个斜杆和点进行截取
		int a=uri.lastIndexOf("/");
		int b=uri.lastIndexOf(".");
		if(b>a&&a>0){
			uri=uri.substring(a+1,b);
		}
		
		String formkey=uri+"Form";//calcForm
		String formClassName=config.getProperty(formkey);//==homework.web.form.CalcForm
		ActionForm form = null;
		try {
			//实例化form
			Class c=Class.forName(formClassName);
			form = (ActionForm)Class.forName(formClassName).newInstance();
			//拿到页面所有的请求参数
			Map<String,String[]> map =req.getParameterMap();
			Set<Map.Entry<String, String[]>> sme = map.entrySet();
			Iterator<Map.Entry<String, String[]>> it = sme.iterator();
			while(it.hasNext()){
				Map.Entry<String, String[]> me = it.next();
				//System.out.println(me.getKey()+"====>"+me.getValue());
				String mekey = me.getKey();
				String[] mevalues = me.getValue();
				String methodName = "set"+mekey.substring(0,1).toUpperCase()+mekey.substring(1);
				Method m=c.getMethod(methodName, new Class[]{String.class});
				m.invoke(form, mevalues[0]);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		
		//System.out.println(uri);//===calc
		//将截取的uri作为key，在配置中找到要处理的类
		String className=config.getProperty(uri);
		//System.out.println(className);//==homework.web.action.CalcAction
		Action action=null;
		try {
			action=(Action)actionpool.get(className);
			if(action==null){
				//表示第一次访问该action
				action=(Action) Class.forName(className).newInstance();
				actionpool.put(className, action);
			}
			//表示不是第一次，就不用new实例直接调方法
			ActionForward af = action.execute(req,resp,form);
			if(af!=null){				
				af.forward(req, resp);
			}
		} catch (Exception e) {
			e.printStackTrace();
		} 
	}
	@Override
	public void init() throws ServletException {
		String path=this.getServletContext().getRealPath("/");
		//===D:\StudyAndWork\apache-tomcat-7.0.52-windows-x64\apache-tomcat-7.0.52\webapps\zking_java_web_20\
		System.out.println(path);
		//应该初始化就读取参数路径
		path+=this.getInitParameter("configLocation");
		//===D:\StudyAndWork\apache-tomcat-7.0.52-windows-x64\apache-tomcat-7.0.52\webapps\zking_java_web_20\/WEB-INF/config.properties
		System.out.println(path);
		//加载
		Properties config=new Properties();
		//存放action的实例的池
		Properties actionpool=new Properties();
		try {
			config.load(new FileInputStream(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//将配置文件存到应用程序中
		this.getServletContext().setAttribute("config", config);
		this.getServletContext().setAttribute("actionpool", actionpool);
	}
}
