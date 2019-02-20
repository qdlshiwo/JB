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

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">
<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
<title>管理人员-管理</title>
<link rel="stylesheet" type="text/css" href="image/style_admin.css">

</head>

<body>
	<table cellspacing="1" cellpadding="4" width="100%" class="tableborder"
		id="table3">
		<form name="form1" action="showUserList.jsp" method="post">
			<tr>
				<td colspan="15" class="header">用户管理</td>
			</tr>
			<tr>
				<td align="center" class="altbg1"><b>用户名</b></td>
				<td align="center" class="altbg1"><b>身份代码</b></td>
				<td align="center" class="altbg1"><b><INPUT
						onClick="return window.confirm('确认要删除选中的信息')" type="submit"
						value="删除"> </b></td>
			</tr>

			<tr>
				<td rowspan="2" align="center" class="altbg2">accp</td>
				<td class="altbg2" rowspan="2" align="center">1</td>
				<td class="altbg2" rowspan="2" align="center"><a
					href="showUserList.jsp?action=delete&userID=1">删除</a></td>
			</tr>
			<tr>

			</tr>

			<tr>
				<td rowspan="2" align="center" class="altbg2">zzg</td>
				<td class="altbg2" rowspan="2" align="center">0</td>
				<td class="altbg2" rowspan="2" align="center"><a
					href="showUserList.jsp?action=delete&userID=3">删除</a></td>
			</tr>
			<tr>

			</tr>

			<tr>
				<td rowspan="2" align="center" class="altbg2">bobo</td>
				<td class="altbg2" rowspan="2" align="center">0</td>
				<td class="altbg2" rowspan="2" align="center"><a
					href="showUserList.jsp?action=delete&userID=4">删除</a></td>
			</tr>
			<tr>

			</tr>

			<tr>
				<td rowspan="2" align="center" class="altbg2">balr</td>
				<td class="altbg2" rowspan="2" align="center">0</td>
				<td class="altbg2" rowspan="2" align="center"><a
					href="showUserList.jsp?action=delete&userID=5">删除</a></td>
			</tr>
			<tr>

			</tr>

			<tr>
				<td rowspan="2" align="center" class="altbg2">wh</td>
				<td class="altbg2" rowspan="2" align="center">0</td>
				<td class="altbg2" rowspan="2" align="center"><a
					href="showUserList.jsp?action=delete&userID=6">删除</a></td>
			</tr>
			<tr>

			</tr>
	</table>
</body>
</jsp>
