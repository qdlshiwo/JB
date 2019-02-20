<%@page import="java.net.URLDecoder"%>
<%@page import="cn.zkingsoft.service.impl.DingdanServiceImpl"%>
<%@page import="cn.zkingsoft.service.DingdanService"%>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String did = request.getParameter("did");
	did = URLDecoder.decode(did,"UTF-8");
	DingdanService ding=new DingdanServiceImpl();
	boolean f=ding.deleteDingdan(did);
 %>
