<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<TITLE>管理首页</TITLE>
<META http-equiv=Content-Type content="text/html; charset=gb2312"><LINK 
href="image/style_admin.css" type=text/css rel=stylesheet>
<SCRIPT>
function mfk()
{
   if(shang.style.display=='none')
    {
     shang.style.display='';
    }
   else
   {
     shang.style.display='none';
   }
}
</SCRIPT>

  </head>
  
  <body leftMargin=0 topMargin=0 scroll=no>
    This is my JSP page. <br>
    <TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%" align=center 
border=0>
  <TBODY>
  <TR>
    <TD id=shang width=162 height="100%"><IFRAME id=left name=left 
      src="image/left.htm" frameBorder=0 width=162 height="100%" 
      target="main">
					</IFRAME></TD>
    <TD class=unnamed1 onclick=mfk(); align=middle height="100%">
      <TABLE height="100%" cellSpacing=0 cellPadding=0 width="100%" border=0>
        <TBODY>
        <TR>
          <TD bgColor=#3a5f94><FONT color=#ffffff>点此切换</FONT> 
      </TD></TR></TBODY></TABLE></TD>
    <TD width="100%" height="100%"><IFRAME id=main name=main 
      src="image/right.htm" frameBorder=0 width="100%" scrolling=yes 
      height="100%"></IFRAME></TD></TR></TBODY></TABLE>
  </body>
</html>
