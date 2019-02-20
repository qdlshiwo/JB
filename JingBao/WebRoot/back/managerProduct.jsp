<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<jsp>
	<head>
		<meta http-equiv="Content-Language" content="zh-cn">
		<meta http-equiv="Content-Type" content="text/jsp; charset=gb2312">
		<title>管理人员-管理</title>
		<link rel="stylesheet" type="text/css" href="image/style_admin.css">
</head>
<body>
		<table cellspacing="1" cellpadding="4" width="100%"
			class="tableborder" id="table3">
			<form name="form1" action="showUserList.jsp" method="post">
			<tr>
				<td colspan="15" class="header">
					商品管理
				</td>
			</tr>
			<tr>
				<td align="center" class="altbg1">
					<b>商品编号</b>
				</td>
				<td align="center" class="altbg1">
					<b>商品名称</b>
				</td>
				<td align="center" class="altbg1">
					<b>商品商标</b>
				</td>
				<td align="center" class="altbg1">
					<b>商品型号</b>
				</td>
				<td align="center" class="altbg1">
					<b>商品价格</b>
				</td>				
				<td align="center" class="altbg1">
					<b>修改</b>
				</td>
				<td align="center" class="altbg1">
					<b>删除</b>
				</td>
			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					z01
				</td>
				<td class="altbg2" rowspan="2" align="center">
					笔记本
				</td>
				<td class="altbg2" rowspan="2" align="center">
					IBM
				</td>
				<td class="altbg2" rowspan="2" align="center">
					g123
				</td>
				<td class="altbg2" rowspan="2" align="center">
					8000.0
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="updateProduct.jsp?productID=1">修改</a>
				</td>				
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageProduct.jsp?action=delete&productID=1">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					s05
				</td>
				<td class="altbg2" rowspan="2" align="center">
					摄像机
				</td>
				<td class="altbg2" rowspan="2" align="center">
					三星
				</td>
				<td class="altbg2" rowspan="2" align="center">
					05
				</td>
				<td class="altbg2" rowspan="2" align="center">
					8000.0
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="updateProduct.jsp?productID=2">修改</a>
				</td>				
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageProduct.jsp?action=delete&productID=2">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					a08
				</td>
				<td class="altbg2" rowspan="2" align="center">
					数码相机
				</td>
				<td class="altbg2" rowspan="2" align="center">
					爱国者
				</td>
				<td class="altbg2" rowspan="2" align="center">
					08
				</td>
				<td class="altbg2" rowspan="2" align="center">
					8000.0
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="updateProduct.jsp?productID=3">修改</a>
				</td>				
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageProduct.jsp?action=delete&productID=3">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					v60
				</td>
				<td class="altbg2" rowspan="2" align="center">
					手机
				</td>
				<td class="altbg2" rowspan="2" align="center">
					摩托罗拉
				</td>
				<td class="altbg2" rowspan="2" align="center">
					60
				</td>
				<td class="altbg2" rowspan="2" align="center">
					8000.0
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="updateProduct.jsp?productID=4">修改</a>
				</td>				
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageProduct.jsp?action=delete&productID=4">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					e80
				</td>
				<td class="altbg2" rowspan="2" align="center">
					笔记本
				</td>
				<td class="altbg2" rowspan="2" align="center">
					IBM
				</td>
				<td class="altbg2" rowspan="2" align="center">
					80
				</td>
				<td class="altbg2" rowspan="2" align="center">
					8000.0
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="updateProduct.jsp?productID=5">修改</a>
				</td>				
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageProduct.jsp?action=delete&productID=5">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					sx100
				</td>
				<td class="altbg2" rowspan="2" align="center">
					摄像机
				</td>
				<td class="altbg2" rowspan="2" align="center">
					松下
				</td>
				<td class="altbg2" rowspan="2" align="center">
					100
				</td>
				<td class="altbg2" rowspan="2" align="center">
					8000.0
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="updateProduct.jsp?productID=6">修改</a>
				</td>				
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageProduct.jsp?action=delete&productID=6">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					k200
				</td>
				<td class="altbg2" rowspan="2" align="center">
					数码相机
				</td>
				<td class="altbg2" rowspan="2" align="center">
					柯达
				</td>
				<td class="altbg2" rowspan="2" align="center">
					200
				</td>
				<td class="altbg2" rowspan="2" align="center">
					8000.0
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="updateProduct.jsp?productID=7">修改</a>
				</td>				
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageProduct.jsp?action=delete&productID=7">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					sa1980
				</td>
				<td class="altbg2" rowspan="2" align="center">
					索爱手机
				</td>
				<td class="altbg2" rowspan="2" align="center">
					索爱
				</td>
				<td class="altbg2" rowspan="2" align="center">
					1980
				</td>
				<td class="altbg2" rowspan="2" align="center">
					5000.0
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="updateProduct.jsp?productID=10">修改</a>
				</td>				
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageProduct.jsp?action=delete&productID=10">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			</table>
</body>
</jsp>