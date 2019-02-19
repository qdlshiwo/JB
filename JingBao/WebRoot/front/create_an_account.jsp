<%@ page language="java" import="java.util.*" pageEncoding="ISO-8859-1"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <!-- Meta Tags -->
		<meta charset="utf-8">
		<meta name="viewport" content="width=device-width, initial-scale=1">

		<!-- Title -->
		<title>HomeShop - HTML Template</title>

		<!-- Stylesheets -->
		<link rel="stylesheet" href="css/bootstrap.min.css">
		<link rel="stylesheet" href="css/perfect-scrollbar.css">
		<link rel="stylesheet" href="css/style.css">
		<link rel="stylesheet" href="css/flexslider.css" type="text/css" media="screen" />
		<link rel="stylesheet" href="css/fontello.css">
		<link rel="stylesheet" href="css/animation.css">
		<link rel="stylesheet" href="css/chosen.css">

		<!--[if lt IE 9]>
            <script src="js/html5shiv.js"></script>
			<link rel="stylesheet" href="css/ie.css">
        <![endif]-->
		<!--[if IE 7]>
			<link rel="stylesheet" href="css/fontello-ie7.css">
		<![endif]-->

  </head>
  
  <body>
    <!-- Container -->
		<div class="container">

			<!-- Header -->
			<header class="row">

				<div class="col-lg-12 col-md-12 col-sm-12">

					<!-- Top Header -->
					<div id="top-header">

						<div class="row">

							<nav id="top-navigation" class="col-lg-7 col-md-7 col-sm-7">
								<ul class="pull-left">
									<li>
										<a href="create_an_account.html">My Account</a>
									</li>
									<li>
										<a href="orders_list.html">List Order</a>
									</li>
									<li>
										<a href="order_info.html">Checkout</a>
									</li>
									<li>
										<a href="text_page.html">About Us</a>
									</li>
									<li>
										<a href="contact.html">Contact</a>
									</li>
								</ul>
							</nav>

							<nav class="col-lg-5 col-md-5 col-sm-5">
								<ul class="pull-right">
									<li class="purple">
										<a href="#"><i class="icons icon-user-3"></i> Login</a>
										<ul id="login-dropdown" class="box-dropdown">
											<li>
												<div class="box-wrapper">
													<h4>LOGIN</h4>
													<div class="iconic-input">
														<input type="text" placeholder="Username">
														<i class="icons icon-user-3"></i>
													</div>
													<div class="iconic-input">
														<input type="text" placeholder="Password">
														<i class="icons icon-lock"></i>
													</div>
													<input type="checkbox" id="loginremember"> <label for="loginremember">Remember me</label>
													<br>
													<br>
													<div class="pull-left">
														<input type="submit" class="orange" value="Login">
													</div>
													<div class="pull-right">
														<a href="#">Forgot your password?</a>
														<br>
														<a href="#">Forgot your username?</a>
														<br>
													</div>
													<br class="clearfix">
												</div>
												<div class="footer">
													<h4 class="pull-left">NEW CUSTOMER?</h4>
													<a class="button pull-right" href="create_an_account.html">Create an account</a>
												</div>
											</li>
										</ul>
									</li>
									<li>
										<a href="#"><i class="icons icon-lock"></i> Create an Account</a>
									</li>
								</ul>
							</nav>

						</div>

					</div>
					<!-- /Top Header -->

					<!-- Main Header -->
					<div id="main-header">

						<div class="row">

							<div id="logo" class="col-lg-4 col-md-4 col-sm-4">
								<a href="home_v1.html"><img src="img/logo.png" alt="Logo"></a>
							</div>

							<nav id="middle-navigation" class="col-lg-8 col-md-8 col-sm-8">
								<ul class="pull-right">
									<li class="blue">
										<a href="compare_products.html"><i class="icons icon-docs"></i>0 Items</a>
									</li>
									<li class="red">
										<a href="wishlist.html"><i class="icons icon-heart-empty"></i>2 Items</a>
									</li>
									<li class="orange">
										<a href="order_info.html"><i class="icons icon-basket-2"></i>17 Items</a>
										<ul id="cart-dropdown" class="box-dropdown parent-arrow">
											<li>
												<div class="box-wrapper parent-border">
													<p>Recently added item(s)</p>

													<table class="cart-table">
														<tr>
															<td><img src="img/products/sample1.jpg" alt="product"></td>
															<td>
																<h6>Lorem ipsum dolor</h6>
																<p>Product code PSBJ3</p>
															</td>
															<td>
																<span class="quantity"><span class="light">1 x</span> $79.00</span>
																<a href="#" class="parent-color">Remove</a>
															</td>
														</tr>
														<tr>
															<td><img src="img/products/sample1.jpg" alt="product"></td>
															<td>
																<h6>Lorem ipsum dolor</h6>
																<p>Product code PSBJ3</p>
															</td>
															<td>
																<span class="quantity"><span class="light">1 x</span> $79.00</span>
																<a href="#" class="parent-color">Remove</a>
															</td>
														</tr>
														<tr>
															<td><img src="img/products/sample1.jpg" alt="product"></td>
															<td>
																<h6>Lorem ipsum dolor</h6>
																<p>Product code PSBJ3</p>
															</td>
															<td>
																<span class="quantity"><span class="light">1 x</span> $79.00</span>
																<a href="#" class="parent-color">Remove</a>
															</td>
														</tr>
													</table>

													<br class="clearfix">
												</div>

												<div class="footer">
													<table class="checkout-table pull-right">
														<tr>
															<td class="align-right">Tax:</td>
															<td>$0.00</td>
														</tr>
														<tr>
															<td class="align-right">Discount:</td>
															<td>$37.00</td>
														</tr>
														<tr>
															<td class="align-right"><strong>Total:</strong></td>
															<td><strong class="parent-color">$999.00</strong></td>
														</tr>
													</table>
												</div>

												<div class="box-wrapper no-border">
													<a class="button pull-right parent-background" href="#">Checkout</a>
													<a class="button pull-right" href="order_info.html">View Cart</a>
												</div>
											</li>
										</ul>
									</li>
									<li>
										<a class="flag" href="#"><span class="english-flag"></span>English</a>
										<ul class="box-dropdown parent-arrow">
											<li>
												<div class="box-wrapper no-padding parent-border">
													<table class="language-table">
														<tr>
															<td class="flag"><span class="english-flag"></span></td>
															<td class="country">
																<a href="#">English</a>
															</td>
														</tr>
														<tr>
															<td class="flag"><span class="german-flag"></span></td>
															<td class="country">
																<a href="#">German</a>
															</td>
														</tr>
														<tr>
															<td class="flag"><span class="french-flag"></span></td>
															<td class="country">
																<a href="#">French</a>
															</td>
														</tr>
														<tr>
															<td class="flag"><span class="italian-flag"></span></td>
															<td class="country">
																<a href="#">Italian</a>
															</td>
														</tr>
														<tr>
															<td class="flag"><span class="spanish-flag"></span></td>
															<td class="country">
																<a href="#">Spanish</a>
															</td>
														</tr>
													</table>
												</div>
											</li>
										</ul>

									</li>
									<li>
										<a href="#"><i class="icons icon-dollar"></i>US Dollar</a>
										<ul class="box-dropdown parent-arrow">
											<li>
												<div class="box-wrapper no-padding parent-border">
													<table class="currency-table">
														<tr>
															<td>
																<a href="#">$ US Dollar</a>
															</td>
														</tr>
														<tr>
															<td>
																<a href="#">€ Euro</a>
															</td>
														</tr>
														<tr>
															<td>
																<a href="#">£ Pound</a>
															</td>
														</tr>
													</table>
												</div>
											</li>
										</ul>
									</li>
								</ul>
							</nav>

						</div>

					</div>
					<!-- /Main Header -->

					<!-- Main Navigation -->
					<nav id="main-navigation" class="style1">
						<ul>

							<li class="home-green">
								<a href="home_v1.html">
									<i class="icons icon-shop-1"></i>
									<span class="nav-caption">Home</span>
									<span class="nav-description">Variety of Layouts</span>
								</a>

								<ul class="normal-dropdown normalAnimation">
									<li>
										<a href="#">Layouts <i class="icons icon-right-dir"></i></a>
										<ul class="normalAnimation">
											<li>
												<a href="home_v1.html">Layout 1</a>
											</li>
											<li>
												<a href="home_v2.html">Layout 2</a>
											</li>
											<li>
												<a href="home_v3.html">Layout 3</a>
											</li>
										</ul>
									</li>
									<li>
										<a href="#">Headers <i class="icons icon-right-dir"></i></a>
										<ul class="normalAnimation">
											<li>
												<a href="home_v1.html">Header 1</a>
											</li>
											<li>
												<a href="home_v2.html">Header 2</a>
											</li>
											<li>
												<a href="home_v3.html">Header 3</a>
											</li>
											<li>
												<a href="category_v1.html">Header 4</a>
											</li>
											<li>
												<a href="category_v2.html">Header 5</a>
											</li>
											<li>
												<a href="products_page_v1.html">Header 6</a>
											</li>
										</ul>
									</li>
									<li>
										<a href="#">Footers <i class="icons icon-right-dir"></i></a>
										<ul class="normalAnimation">
											<li>
												<a href="home_v1.html#footer">Footer 1</a>
											</li>
											<li>
												<a href="home_v2.html#footer">Footer 2</a>
											</li>
											<li>
												<a href="home_v3.html#footer">Footer 3</a>
											</li>
											<li>
												<a href="category_v1.html#footer">Footer 4</a>
											</li>
											<li>
												<a href="category_v2.htm#footer">Footer 5</a>
											</li>
											<li>
												<a href="products_page_v1.html#footer">Footer 6</a>
											</li>
										</ul>
									</li>
									<li>
										<a href="#">Sliders <i class="icons icon-right-dir"></i></a>
										<ul class="normalAnimation">
											<li>
												<a href="home_v1.html">Revolution Slider</a>
											</li>
											<li>
												<a href="home_v2.html">IOS Slider</a>
											</li>
											<li>
												<a href="home_v3.html">Flex Slider</a>
											</li>
										</ul>
									</li>
								</ul>
							</li>

							<li class="red">
								<a href="#">
									<i class="icons icon-camera-7"></i>
									<span class="nav-caption">Cameras</span>
									<span class="nav-description">Photo & Video</span>
								</a>

								<ul class="wide-dropdown normalAniamtion">
									<li>
										<ul>
											<li><span class="nav-caption">Digital Cameras</span></li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Digital SLR</a>
											</li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Point &amp; Shoot</a>
											</li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Spy, Miniature</a>
											</li>
										</ul>
									</li>
									<li>
										<ul>
											<li><span class="nav-caption">Digital Cameras</span></li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Background Material</a>
											</li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Continuous Lighting</a>
											</li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Flash Lighting</a>
											</li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Light Meters</a>
											</li>
										</ul>
									</li>
									<li>
										<ul>
											<li><span class="nav-caption">Digital Cameras</span></li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Batteries</a>
											</li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Cables &amp; Adapters</a>
											</li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Camcorder Tapes &amp; Discs</a>
											</li>
											<li>
												<a href="#"><i class="icons icon-right-dir"></i> Cases, Bags &amp; Covers</a>
											</li>
										</ul>
									</li>
								</ul>

							</li>

							<li class="blue">
								<a href="category_v2.html">
									<i class="icons icon-desktop-3"></i>
									<span class="nav-caption">Computers</span>
									<span class="nav-description">Laptops & Tablets</span>
								</a>
							</li>

							<li class="orange">
								<a href="category_v1.html">
									<i class="icons icon-mobile-6"></i>
									<span class="nav-caption">Cell phones</span>
									<span class="nav-description">Phones & Accessories</span>
								</a>
							</li>

							<li class="green">
								<a href="blog.html">
									<i class="icons icon-pencil-7"></i>
									<span class="nav-caption">Blog</span>
									<span class="nav-description">News & Reviews</span>
								</a>
							</li>

							<li class="purple">
								<a href="contact.html">
									<i class="icons icon-location-7"></i>
									<span class="nav-caption">Contact</span>
									<span class="nav-description">Store Locations</span>
								</a>
							</li>

							<li class="nav-search">
								<i class="icons icon-search-1"></i>
							</li>

						</ul>

						<div id="search-bar">

							<div class="col-lg-12 col-md-12 col-sm-12">
								<table id="search-bar-table">
									<tr>
										<td class="search-column-1">
											<p><span class="grey">Popular Searches:</span>
												<a href="#">accessories</a>,
												<a href="#">audio</a>,
												<a href="#">camera</a>,
												<a href="#">phone</a>,
												<a href="#">storage</a>,
												<a href="#">more</a>
											</p>
											<input type="text" placeholder="Enter your keyword">
										</td>
										<td class="search-column-2">
											<p class="align-right">
												<a href="#">Advanced Search</a>
											</p>
											<select class="chosen-select-search">
												<option>All Categories</option>
												<option>All Categories</option>
												<option>All Categories</option>
												<option>All Categories</option>
												<option>All Categories</option>
											</select>
										</td>
									</tr>
								</table>
							</div>
							<div id="search-button">
								<input type="submit" value="">
								<i class="icons icon-search-1"></i>
							</div>
						</div>

					</nav>
					<!-- /Main Navigation -->

				</div>

			</header>
			<!-- /Header -->

			<!-- Content -->
			<div class="row content">

				<div class="col-lg-12 col-md-12 col-sm-12">
					<div class="breadcrumbs">
						<p>
							<a href="#">Home</a> <i class="icons icon-right-dir"></i> Create an account</p>
					</div>
				</div>

				<!-- Main Content -->
				
				<section class="main-content col-lg-9 col-md-9 col-sm-9">

                  <from id="loginform">
					<div class="row">

						<div class="col-lg-12 col-md-12 col-sm-12">

							<div class="carousel-heading no-margin">
								<h4>Your account details</h4>
							</div>

							<div class="page-content">
								<p>If you are already registered please login directly here</p>
								<div class="row">
									<div class="col-lg-6 col-md-6 col-sm-6">
										<div class="iconic-input">
											<input type="text" placeholder="username">
											<i class="icons icon-user-3"></i>
										</div>
									</div>

									<div class="col-lg-6 col-md-6 col-sm-6">
										<div class="iconic-input">
											<input type="text" placeholder="password">
											<i class="icons icon-lock"></i>
										</div>
									</div>
								</div>

								<input type="checkbox" id="login-remember-2"> <label for="login-remember-2">Remember me</label>
								<br/><br/>
								<div class="row">
									<div class="col-lg-6 col-md-6 col-sm-6 align-left">
										<input type="button" class="orange" value="Login" onclick="loginjump('denglu')">
									</div>
									<div class="col-lg-6 col-md-6 col-sm-6 align-right">
										<small>
											<a class="align-right" href="#">Forgot your password?</a>
											<br>
											<a class="align-right" href="#">Forgot your username?</a>
											<br>
										</small>
									</div>
								</div>
							</div>

						</div>

					</div>
				</from>

                    <form id="regform">
					<div class="row">

						<div class="col-lg-12 col-md-12 col-sm-12 register-account">

							<div class="carousel-heading no-margin">
								<h4>Register</h4>
							</div>

							<div class="page-content">
								<div class="row">

									<div class="col-lg-12 col-md-12 col-sm-12">
										<p><strong>Shopper information</strong></p>
									</div>

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>E-Mail*</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text" name="email">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Telephone</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text" name="telephone">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Username*</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text" name="username">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Sex</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<select class="chosen-select" name="sex">
											<option value="male">male</option>
											<option value="female">female</option>
										</select>
									</div>
								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Password</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="password" name="password">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Confirm Password</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="password" name="confirmpassword">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Introduce</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<textarea name="introduce" placeholder="please input your introduce"></textarea>
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>I agree to the terms of service</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="checkbox" id="i-agree-to-terms"><label for="i-agree-to-terms"></label>
									</div>

								</div>

								<div class="row">

									<div class="col-lg-12 col-md-12 col-sm-12">
										<p><strong>Bill to</strong></p>
									</div>
									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Company Name</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Title</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<select class="chosen-select">
											<option>Mr</option>
											<option>Mrs</option>
										</select>
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>First name</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Middle Name</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Last Name</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Address 1</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Address 2</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>ZIP / Postal Code</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>City</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Country</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>State / Province / Region</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Phone</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>Mobile Phone</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

								</div>

								<div class="row">

									<div class="col-lg-4 col-md-4 col-sm-4">
										<p>FAX</p>
									</div>
									<div class="col-lg-8 col-md-8 col-sm-8">
										<input type="text">
									</div>

									<div class="col-lg-12 col-md-12 col-sm-12">
										<input class="big" type="button" value="Register" onclick="regjump('zhuce')">
										<input class="big" type="reset" value="Cancel">
									</div>

								</div>
							</div>

						</div>

					</div>
                   </form>
				</section>
				
				<!-- /Main Content -->

				<!-- Sidebar -->
				<aside class="sidebar col-lg-3 col-md-3 col-sm-3 right-sidebar">

					<!-- Categories -->
					<div class="row sidebar-box purple">

						<div class="col-lg-12 col-md-12 col-sm-12">

							<div class="sidebar-box-heading">
								<i class="icons icon-folder-open-empty"></i>
								<h4>Categories</h4>
							</div>

							<div class="sidebar-box-content">
								<ul>
									<li>
										<a href="#">Cameras &amp; Photography <i class="icons icon-right-dir"></i></a>
									</li>
									<li>
										<a href="#">Computers &amp; Tablets <i class="icons icon-right-dir"></i></a>
									</li>
									<li>
										<a href="#">Cell Phones &amp; Accessories <i class="icons icon-right-dir"></i></a>
										<ul class="sidebar-dropdown">
											<li>
												<ul>
													<li>
														<a href="#">Cell phones &amp; Smartphone</a>
													</li>
													<li>
														<a href="#">Cell Phone Accessories</a>
													</li>
													<li>
														<a href="#">Headsets</a>
													</li>
													<li>
														<a href="#">Cases, Covers & Skins</a>
													</li>
													<li>
														<a href="#">Screen Protectors</a>
													</li>
												</ul>
											</li>
											<li>
												<ul>
													<li>
														<a href="#">Chargers & Cradles</a>
													</li>
													<li>
														<a href="#">Batteries</a>
													</li>
													<li>
														<a href="#">Cables & Adapters</a>
													</li>
													<li>
														<a href="#">All About Smartphones</a>
													</li>
												</ul>
											</li>
										</ul>
									</li>
									<li>
										<a href="#">TV, Audio &amp; Surveillance <i class="icons icon-right-dir"></i></a>
									</li>
									<li>
										<a href="#">Video Games &amp; Consoles <i class="icons icon-right-dir"></i></a>
									</li>
									<li>
										<a href="#">Car Audio, Video &amp; GPS <i class="icons icon-right-dir"></i></a>
									</li>
									<li>
										<a href="#">Best Sellers <i class="icons icon-right-dir"></i></a>
									</li>
									<li>
										<a href="#">Shop by Brands <i class="icons icon-right-dir"></i></a>
									</li>
									<li>
										<a class="purple" href="#">All Categories</a>
									</li>
								</ul>
							</div>

						</div>

					</div>
					<!-- /Categories -->

					<!-- Compare Products -->
					<div class="row sidebar-box blue">

						<div class="col-lg-12 col-md-12 col-sm-12">

							<div class="sidebar-box-heading">
								<i class="icons icon-docs"></i>
								<h4>Compare Products</h4>
							</div>
							<div class="sidebar-box-content">
								<table class="compare-table">

									<tr>
										<td class="product-thumbnail"><img src="img/products/sample1.jpg" alt="Product1"></td>
										<td class="product-info">
											<p>
												<a href="#">Lorem ipsum dolor sit amet</a>
											</p>
											<a class="remove">Remove</a>
										</td>
									</tr>

								</table>
								<div class="padding-box">
									<a class="button grey">Go to compare</a>
								</div>
							</div>
						</div>

					</div>
					<!-- /Compare Products -->

					<!-- Carousel -->
					<div class="row sidebar-box">

						<div class="col-lg-12 col-md-12 col-sm-12 sidebar-carousel">

							<!-- Slider -->
							<section class="sidebar-slider">
								<div class="sidebar-flexslider">
									<ul class="slides">
										<li>
											<a href="#"><img src="img/sidebar-slide1.jpg" alt="Slide1"></a>
										</li>
										<li>
											<a href="#"><img src="img/sidebar-slide2.jpg" alt="Slide1"></a>
										</li>
										<li>
											<a href="#"><img src="img/sidebar-slide3.jpg" alt="Slide1"></a>
										</li>
									</ul>
								</div>
								<div class="slider-nav"></div>
							</section>
							<!-- /Slider -->

						</div>

					</div>
					<!-- /Carousel -->

					<!-- Bestsellers -->
					<div class="row sidebar-box red">

						<div class="col-lg-12 col-md-12 col-sm-12">

							<div class="sidebar-box-heading">
								<i class="icons icon-award-2"></i>
								<h4>Bestsellers</h4>
							</div>

							<div class="sidebar-box-content">
								<table class="bestsellers-table">

									<tr>
										<td class="product-thumbnail">
											<a href="#"><img src="img/products/sample1.jpg" alt="Product1"></a>
										</td>
										<td class="product-info">
											<p>
												<a href="#">Lorem ipsum dolor sit amet</a>
											</p>
											<span class="price">$550.00</span>
										</td>
									</tr>

									<tr>
										<td class="product-thumbnail">
											<a href="#"><img src="img/products/sample2.jpg" alt="Product1"></a>
										</td>
										<td class="product-info">
											<p>
												<a href="#">Lorem ipsum dolor sit amet</a>
											</p>
											<span class="price">$550.00</span>
										</td>
									</tr>

									<tr>
										<td class="product-thumbnail">
											<a href="#"><img src="img/products/sample3.jpg" alt="Product1"></a>
										</td>
										<td class="product-info">
											<p>
												<a href="#">Lorem ipsum dolor sit amet</a>
											</p>
											<div class="rating readonly-rating" data-score="4"></div>
											<span class="price"><del>$650.00</del> $550.00</span>
										</td>
									</tr>

								</table>
							</div>

						</div>

					</div>
					<!-- /Bestsellers -->

				</aside>
				<!-- /Sidebar -->

			</div>
			<!-- /Content -->

			<!-- Banner -->
			<section class="banner">

				<div class="left-side-banner banner-item icon-on-right gray">
					<h4>8(802)234-5678</h4>
					<p>Monday - Saturday: 8am - 5pm PST</p>
					<i class="icons icon-phone-outline"></i>
				</div>

				<a href="#">
					<div class="middle-banner banner-item icon-on-left light-blue">
						<h4>Free shipping</h4>
						<p>on all orders over $99</p>
						<span class="button">Learn more</span>
						<i class="icons icon-truck-1"></i>
					</div>
				</a>

				<a href="#">
					<div class="right-side-banner banner-item orange">
						<h4>Crazy sale!</h4>
						<p>on selected items</p>
						<span class="button">Shop now</span>
					</div>
				</a>

			</section>
			<!-- /Banner -->

			<!-- Footer -->
			<footer id="footer" class="row">

				<!-- Upper Footer -->
				<div class="col-lg-12 col-md-12 col-sm-12">

					<div id="upper-footer">

						<div class="row">

							<!-- Newsletter -->
							<div class="col-lg-7 col-md-7 col-sm-7">
								<form id="newsletter" action="php/newsletter.php">
									<h4>Newsletter Sign Up</h4>
									<input type="text" name="newsletter-email" placeholder="Enter your email address">
									<input type="submit" name="newsletter-submit" value="Submit">
								</form>
							</div>
							<!-- /Newsletter -->

							<!-- Social Media -->
							<div class="col-lg-5 col-md-5 col-sm-5 social-media">
								<h4>Stay Connected</h4>
								<ul>
									<li class="social-googleplus tooltip-hover" data-toggle="tooltip" data-placement="top" title="Google+">
										<a href="#"></a>
									</li>
									<li class="social-facebook tooltip-hover" data-toggle="tooltip" data-placement="top" title="Facebook">
										<a href="#"></a>
									</li>
									<li class="social-pinterest tooltip-hover" data-toggle="tooltip" data-placement="top" title="Pinterest">
										<a href="#"></a>
									</li>
									<li class="social-twitter tooltip-hover" data-toggle="tooltip" data-placement="top" title="Twitter">
										<a href="#"></a>
									</li>
									<li class="social-youtube tooltip-hover" data-toggle="tooltip" data-placement="top" title="Youtube">
										<a href="#"></a>
									</li>
								</ul>
							</div>
							<!-- /Social Media -->

						</div>

					</div>

				</div>
				<!-- /Upper Footer -->

				<!-- Main Footer -->
				<div class="col-lg-12 col-md-12 col-sm-12">

					<div id="main-footer">

						<div class="row">

							<!-- Like us on Twitter -->
							<div class="col-lg-3 col-md-3 col-sm-6 twitter-widget">
								<h4>From Twitter</h4>
								<div id="twitter-widget">

								</div>
								<a href="#" class="button blue small">Follow us</a>
							</div>
							<!-- /Like us on Twitter -->

							<!-- Like us on Facebook -->
							<div class="col-lg-3 col-md-3 col-sm-6 facebook-iframe">
								<h4>Like us on Facebook</h4>
								<iframe src="/www.facebook.com/plugins/likebox.php?href=http%3A%2F%2Fwww.facebook.com%2FFacebookDevelopers&amp;width=270&amp;height=250&amp;colorscheme=light&amp;header=false&amp;show_faces=true&amp;stream=false&amp;show_border=false" style="border:none; overflow:hidden; width:100%; height:290px;"></iframe>
							</div>
							<!-- /Like us on Facebook -->

							<!-- Information -->
							<div class="col-lg-3 col-md-3 col-sm-6">
								<h4>Information</h4>
								<ul>
									<li>
										<a href="#"><i class="icons icon-right-dir"></i> About Us</a>
									</li>
									<li>
										<a href="#"><i class="icons icon-right-dir"></i> New Collection</a>
									</li>
									<li>
										<a href="#"><i class="icons icon-right-dir"></i> Bestsellers</a>
									</li>
									<li>
										<a href="#"><i class="icons icon-right-dir"></i> Manufacturers</a>
									</li>
									<li>
										<a href="#"><i class="icons icon-right-dir"></i> Privacy Policy</a>
									</li>
									<li>
										<a href="#"><i class="icons icon-right-dir"></i> Terms &amp; Conditions</a>
									</li>
								</ul>
							</div>
							<!-- /Information -->

							<!-- Contact Us -->
							<div class="col-lg-3 col-md-3 col-sm-6 contact-footer-info">
								<h4>Contact Us</h4>
								<ul>
									<li><i class="icons icon-location"></i> 8901 Marmora Road,<br>Glasgow, D04 89GR.</li>
									<li><i class="icons icon-phone"></i> +1 800 603 6035</li>
									<li><i class="icons icon-mail-alt"></i>
										<a href="mailto:mail@company.com"> mail@companyname.com</a>
									</li>
									<li><i class="icons icon-skype"></i> homeshop</li>
								</ul>
							</div>
							<!-- /Contact Us -->

						</div>

					</div>

				</div>
				<!-- /Main Footer -->

				<!-- Lower Footer -->
				<div class="col-lg-12 col-md-12 col-sm-12">

					<div id="lower-footer">

						<div class="row">

							<div class="col-lg-6 col-md-6 col-sm-6">
								<p class="copyright">Copyright 2014
									<a href="#">HomeShop</a>. All Rights Reserved.
									<a href="http://www.mycodes.net/" target="_blank">源码之家</a>
								</p>
							</div>

							<div class="col-lg-6 col-md-6 col-sm-6">
								<ul class="payment-list">
									<li class="payment1"></li>
									<li class="payment2"></li>
									<li class="payment3"></li>
									<li class="payment4"></li>
									<li class="payment5"></li>
								</ul>
							</div>

						</div>

					</div>

				</div>
				<!-- /Lower Footer -->

			</footer>
			<!-- Footer -->

			<div id="back-to-top">
				<i class="icon-up-dir"></i>
			</div>

		</div>
		<!-- Container -->

		<!-- JavaScript -->
		<script type="text/javascript">
			function loginjump(val){
				var form = document.getElementById("loginform");
				form.action="login.do?param="+val;
			    form.method="post";
			    form.submit();
			}
			function regjump(val){
				var form = document.getElementById("regform");
				form.action="register.do?param="+val;
			    form.method="post";
			    form.submit();
			}
		</script>
		<script src="js/modernizr.min.js"></script>
		<script src="js/jquery-1.11.0.min.js"></script>
		<script type="text/javascript" src="js/jquery-ui.min.js"></script>
		<script type="text/javascript" src="js/jquery.raty.min.js"></script>

		<!-- Scroll Bar -->
		<script src="js/perfect-scrollbar.min.js"></script>

		<!-- Cloud Zoom -->
		<script src="js/zoomsl-3.0.min.js"></script>

		<!-- FancyBox -->
		<script src="js/jquery.fancybox.pack.js"></script>

		<!-- jQuery REVOLUTION Slider  -->
		<script type="text/javascript" src="js/jquery.themepunch.plugins.min.js"></script>
		<script type="text/javascript" src="js/jquery.themepunch.revolution.min.js"></script>

		<!-- FlexSlider -->
		<script defer src="js/flexslider.min.js"></script>

		<!-- IOS Slider -->
		<script src="js/jquery.iosslider.min.js"></script>

		<!-- noUi Slider -->
		<script src="js/jquery.nouislider.min.js"></script>

		<!-- Owl Carousel -->
		<script src="js/owl.carousel.min.js"></script>

		<!-- Cloud Zoom -->
		<script src="js/zoomsl-3.0.min.js"></script>

		<!-- SelectJS -->
		<script src="js/chosen.jquery.min.js" type="text/javascript"></script>

		<!-- Main JS -->
		<script defer src="js/bootstrap.min.js"></script>
		<script src="js/main-script.js"></script>
  </body>
</html>
