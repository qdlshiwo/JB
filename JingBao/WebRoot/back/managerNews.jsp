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
					新闻管理
				</td>
			</tr>
			<tr>
				<td align="center" class="altbg1">
					<b>新闻标题</b>
				</td>
				<td align="center" class="altbg1">
					<b>新闻发布时间</b>
				</td>
				<td align="center" class="altbg1">
					<b>删除</b>
				</td>
			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					索尼W55降价送卡
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-10-07
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=11">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					理光R5不到二千
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-10-06
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=10">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					MP4关注度排行TOP10
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-10-05
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=9">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					单反与镜头组合
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-10-05
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=8">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					国庆各品牌最好卖的相机
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-10-04
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=7">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					国庆期间降价最猛八款数码相机
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-10-03
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=6">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					三星女性翻盖E428行货仅1180
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-10-02
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=5">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					时尚浪漫情侣手机配对推荐
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-10-01
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=4">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					黄金周最热销手机汇总导购
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-10-01
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=3">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					爱国者数码相机今日七折优惠
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-09-30
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=2">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			<tr>
				<td rowspan="2" align="center" class="altbg2">
					庆十一商品促销
				</td>
				<td class="altbg2" rowspan="2" align="center">
					2007-09-30
				</td>
				<td class="altbg2" rowspan="2" align="center">
					<a href="manageNews.jsp?action=delete&newsID=1">删除</a>
				</td>
			</tr>
			<tr>

			</tr>
			
			</table>
</body>
</jsp>