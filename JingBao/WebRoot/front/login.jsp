<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<HTML>
<HEAD>
<base href="<%=basePath%>">
<META http-equiv=Content-Type content="text/html; charset=gb2312">
<META content="MSHTML 6.00.2900.5726" name=GENERATOR>
<meta charset="UTF-8">
		<title>理想生活上天猫</title>
		<link rel="stylesheet" type="text/css" href="front/css/login.css" />
		<script src="front/js/jquery.min.js"></script>
		<script>
			$(document).ready(function(){
				$("#login2").hide();
				$("#btn2").hide();
				$("#btn1").click(function(){
					$("#login1").hide();
					$("#login2").show();
					$("#btn1").hide();
					$("#btn2").show();
				});
				$("#btn2").click(function(){
					$("#login2").hide();
					$("#login1").show();
					$("#btn2").hide();
					$("#btn1").show();
				});
			});
		</script>
</HEAD>
<body>
		<div id="tt">
			<div class="headtop">
				<a href="" title="天猫" target="_top">
					<img src="front/img/top.png"  height="26px"/>
				</a>
			</div>
			<div class="login">
				<form action="loginAction.jsp" method="post" style="border: 1px solid white;">
					<div id="login1">
						<button id="btn1" ></button>
						<h4>密码登录</h4>
						<input type="text" name="user" placeholder="用户名：" required="required" />
						<input type="password" name="password" placeholder="密码：" required="required" />
						<button type="submit"><font color="antiquewhite" size="3">登录</font></button><br />
						<div class="form-font">
							<a href="">忘记密码</a>&emsp;<a href="">忘记会员名</a>&emsp;<a href=""> 免费注册</a>
						</div>
					</div>
					<div id="login2">
						<button id="btn2"></button>
						<h4>扫码登录</h4>
						
					</div>
				</form>
			</div>
			<div class="buttom1">
			           关于天猫 帮助中心 开放平台 诚聘英才 联系我们 网站合作 法律声明 隐私权政策 知识产权 廉正举报<br /><br />
				阿里巴巴集团| 淘宝网 | 天猫 | 聚划算 | 全球速卖通 | 阿里巴巴国际交易市场| 1688 | 阿里妈妈 | 飞猪 | 阿里云计算 | 
				AliOS | 阿里通信 | 万网 | 高德 | UC | 友盟 | 虾米 | 钉钉 | 支付宝<br /><br />
				<font color="#696969">增值电信业务经营许可证： 浙B2-20110446 市场名称登记证：工商网市字3301004119号 出版物网络交易平台服务经营备案证： 新出发浙备字第001号</font> <br /><br />
			</div>
			<div class="buttom2">
				<font color="#696969">互联网违法和不良信息举报电话：0571-81683755 blxxjb@alibaba-inc.com 互联网药品信息服务资质证书编号：浙-（经营性）-2017-0005   浙公网安备 33010002000120号<br /> 
				医疗器械网络交易服务第三方平台备案：（浙）网械平台备字[2018]第00002号 互联网药品交易服务资格证书：国A20150001 <br />
				浙江省网络食品销售第三方平台提供者备案：浙网食A33010002 12318举报<br />
				© 2003-2018 TMALL.COM 版权所有</font><br />
			</div>
				
			
		</div>
		
	</body>
</HTML>