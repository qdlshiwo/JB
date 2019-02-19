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
		//�������ļ���Ӧ�ó�����ȡ��
		Properties config=(Properties)this.getServletContext().getAttribute("config");
		//��actionʵ�����ó���   ��������Ϊ������Ӧ��ʵ����Ϊֵ    
		Properties actionpool=(Properties)this.getServletContext().getAttribute("actionpool");
		//�õ�ҳ���ύ��·��
		String uri=req.getRequestURI();
		System.out.println(uri);//======/zking_java_web_20/calc.do
		//������һ��б�˺͵���н�ȡ
		int a=uri.lastIndexOf("/");
		int b=uri.lastIndexOf(".");
		if(b>a&&a>0){
			uri=uri.substring(a+1,b);
		}
		
		String formkey=uri+"Form";//calcForm
		String formClassName=config.getProperty(formkey);//==homework.web.form.CalcForm
		ActionForm form = null;
		try {
			//ʵ����form
			Class c=Class.forName(formClassName);
			form = (ActionForm)Class.forName(formClassName).newInstance();
			//�õ�ҳ�����е��������
			Map<String,String[]> map =req.getParameterMap();
			Set<Map.Entry<String, String[]>> sme = map.entrySet();
			Iterator<Map.Entry<String, String[]>> it = sme.iterator();
			while(it.hasNext()){
				Map.Entry<String, String[]> me = it.next();
				//System.out.println(me.getKey()+"====>"+me.getValue());
				String mekey = me.getKey();
				String[] mevalues = me.getValue();
				String methodName = "set"+mekey.substring(0,1).toUpperCase()+mekey.substring(1);
				System.out.println(methodName);
				Method m=c.getMethod(methodName, new Class[]{String.class});
				m.invoke(form, mevalues[0]);
			}
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		
		
		
		//System.out.println(uri);//===calc
		//����ȡ��uri��Ϊkey�����������ҵ�Ҫ�������
		String className=config.getProperty(uri);
		//System.out.println(className);//==homework.web.action.CalcAction
		Action action=null;
		try {
			action=(Action)actionpool.get(className);
			if(action==null){
				//��ʾ��һ�η��ʸ�action
				action=(Action) Class.forName(className).newInstance();
				actionpool.put(className, action);
			}
			//��ʾ���ǵ�һ�Σ��Ͳ���newʵ��ֱ�ӵ�����
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
		//Ӧ�ó�ʼ���Ͷ�ȡ����·��
		path+=this.getInitParameter("configLocation");
		//===D:\StudyAndWork\apache-tomcat-7.0.52-windows-x64\apache-tomcat-7.0.52\webapps\zking_java_web_20\/WEB-INF/config.properties
		System.out.println(path);
		//����
		Properties config=new Properties();
		//���action��ʵ���ĳ�
		Properties actionpool=new Properties();
		try {
			config.load(new FileInputStream(path));
		} catch (Exception e) {
			e.printStackTrace();
		}
		//�������ļ��浽Ӧ�ó�����
		this.getServletContext().setAttribute("config", config);
		this.getServletContext().setAttribute("actionpool", actionpool);
	}
}
