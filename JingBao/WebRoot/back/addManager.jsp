<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE jsp PUBLIC "-//W3C//DTD jsp 4.01 Transitional//EN">
<jsp>
<head>
<base href="<%=basePath%>">

<title>My JSP 'addManager.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>管理员-添加</title>
<link rel="stylesheet" type="text/css" href="image/style_admin.css">
</head>

<body>
	

	<form id="regform">
		<table cellspacing="1" cellpadding="4" width="100%"
			class="tableborder" id="table3">

			<input type="hidden" name="action" value="save" />
			<tr>
				<td colspan="12" class="header">管理员-添加</td>
			</tr>
			<tr>
				<td class="altbg1">管理员名称：</td>
				<td class="altbg2" colspan="11"><input type="text"
					name="username" size="34"></td>
			</tr>
			<tr>
				<td class="altbg1">密&nbsp; 码：</td>
				<td class="altbg2" colspan="11"><input type="password"
					name="password" size="34"></td>
			</tr>
			<tr>
				<td class="altbg1">确认密码：</td>
				<td class="altbg2" colspan="11"><input name="confirmpassword"
					size="34" type="password"></td>
			</tr>


			<tr>
				<td class="altbg1"></td>
				<td class="altbg2" colspan="11"><input type="button" value="提交"
					name="B1" onClick="regjump('zhuce')"> &nbsp; <input
					type="reset" value="重置" name="B2"></td>
			</tr>

		</table>
	</form>
	
	<script type="text/javascript">
			function regjump(val){
				var form = document.getElementById("regform");
				form.action="register.do?param="+val;
			    form.method="post";
			    form.submit();
			}
	</script>
</body>
</jsp>
