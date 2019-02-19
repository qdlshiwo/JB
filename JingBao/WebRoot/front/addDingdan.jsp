<%@page import="cn.zkingsoft.util.Helper"%>
<%@page import="cn.zkingsoft.pojo.Dingdan"%>
<%@page import="cn.zkingsoft.service.impl.DingdanServiceImpl"%>
<%@page import="cn.zkingsoft.service.DingdanService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	DingdanService ding=new DingdanServiceImpl();
	String did=Helper.PrimaryKeyComplete();
	String pid=request.getParameter("pid");
	String uid="222";
	int dnum=1;
	int dno=0;
	String address="ChangSha";
	double discount=20;
	Dingdan d=new Dingdan(did,uid,pid,dnum,dno,address,discount);
	d.toString();
	boolean f = ding.addDingdan(d);
	System.out.println(f);
	response.sendRedirect("order_info.jsp?pid="+pid);
%>