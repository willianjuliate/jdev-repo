<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">

<head>
<title>Sign-in</title>
<meta charset="utf-8">
<meta name="viewport"
	content="width=device-width, initial-scale=1.0, user-scalable=0, minimal-ui">
<meta http-equiv="X-UA-Compatible" content="IE=edge" />
<meta name="description"
	content="Mega Able Bootstrap admin template made using Bootstrap 4 and it has huge amount of ready made feature, UI components, pages which completely fulfills any dashboard needs." />
<meta name="keywords"
	content="bootstrap, bootstrap admin template, admin theme, admin dashboard, dashboard template, admin template, responsive" />
<meta name="author" content="codedthemes" />
<!-- Favicon icon -->

<link rel="icon" href="<%= request.getContextPath() %>/assets/images/favicon.ico" type="image/x-icon">
<!-- Google font-->
<link href="https://fonts.googleapis.com/css?family=Roboto:400,500"
	rel="stylesheet">
<!-- Required Fremwork -->
<link rel="stylesheet" type="text/css"
	href="<%= request.getContextPath() %>/assets/css/bootstrap/css/bootstrap.min.css">
<!-- waves.css -->
<link rel="stylesheet" href="<%= request.getContextPath() %>/assets/pages/waves/css/waves.min.css"
	type="text/css" media="all">
<!-- themify-icons line icon -->
<link rel="stylesheet" type="text/css"
	href="<%= request.getContextPath() %>/assets/icon/themify-icons/themify-icons.css">
<!-- ico font -->
<link rel="stylesheet" type="text/css"
	href="<%= request.getContextPath() %>/assets/icon/icofont/css/icofont.css">
<!-- Font Awesome -->
<link rel="stylesheet" type="text/css"
	href="<%= request.getContextPath() %>/assets/icon/font-awesome/css/font-awesome.min.css">
<!-- Style.css -->
<link rel="stylesheet" type="text/css" href="<%= request.getContextPath() %>/assets/css/style.css">
</head>

<body themebg-pattern="theme1">
	<!-- Pre-loader start -->
	<div class="theme-loader">
		<div class="loader-track">
			<div class="preloader-wrapper">
				<div class="spinner-layer spinner-blue">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="gap-patch">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>
				<div class="spinner-layer spinner-red">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="gap-patch">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>

				<div class="spinner-layer spinner-yellow">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="gap-patch">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>

				<div class="spinner-layer spinner-green">
					<div class="circle-clipper left">
						<div class="circle"></div>
					</div>
					<div class="gap-patch">
						<div class="circle"></div>
					</div>
					<div class="circle-clipper right">
						<div class="circle"></div>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- Pre-loader end -->

	<section class="login-block">
		<!-- Container-fluid starts -->
		<div class="container">
			<div class="row">
				<div class="col-sm-12">
					<!-- Authentication card start -->

					<form class="md-float-material form-material" action="<%=request.getContextPath() %>/dashboard" method="POST">			
					<input type="hidden" value="<%= request.getParameter("url") %>" name="url">		
						<div class="text-center">
							<img src="<%= request.getContextPath() %>/assets/images/logo.png" alt="logo.png">
						</div>
						<div class="auth-box card">
							<div class="card-block">
								<div class="row m-b-20">
									<div class="col-md-12">
										<h3 class="text-center">Sign In</h3>
									</div>
								</div>
								<div class="form-group form-primary">
									<input type="text" name="user" class="form-control"
										required> <span class="form-bar"></span> <label
										class="float-label">Usu�rio</label>
								</div>
								<div class="form-group form-primary">
									<input type="password" name="passwd" class="form-control"
										required> <span class="form-bar"></span> <label
										class="float-label">Senha</label>
								</div>
								<div class="row m-t-25 text-left">
									<div class="col-12">
										<div class="checkbox-fade fade-in-primary d-">
											<label> <input type="checkbox" value=""> <span
												class="cr"><i
													class="cr-icon icofont icofont-ui-check txt-primary"></i></span> <span
												class="text-inverse">Lembre-me</span>
											</label>
										</div>
										<div class="forgot-phone text-right f-right">
											<a href="#" class="text-right f-w-600"> Esqueceu a senha?</a>
										</div>
									</div>
								</div>
								
								<div class="row m-t-30">
									<div class="col-md-12">
										<button type="submit"
											class="btn btn-primary btn-md btn-block waves-effect waves-light text-center m-b-20">Entrar</button>
									</div>
								</div>
								<hr />
								<div class="row">
									<div class="col-md-10">
										<p class="text-inverse text-left m-b-0">Thank you.</p>
										<p class="text-inverse text-left">
											<a href="index.html"><b>Back to website</b></a>
										</p>
									</div>
									<div class="col-md-2">
										<img src="<%= request.getContextPath() %>/assets/images/auth/Logo-small-bottom.png"
											alt="small-logo.png">
									</div>
								</div>
							</div>
						</div>
					</form>
					<!-- end of form -->
				</div>
				<!-- end of col-sm-12 -->
			</div>
			<!-- end of row -->
		</div>
		<!-- end of container-fluid -->
	</section>
	<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/jquery/jquery.min.js"></script>
	<script type="text/javascript"
		src="<%= request.getContextPath() %>/assets/js/jquery-ui/jquery-ui.min.js "></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/popper.js/popper.min.js"></script>
	<script type="text/javascript"
		src="<%= request.getContextPath() %>/assets/js/bootstrap/js/bootstrap.min.js "></script>
	<!-- waves js -->
	<script src="<%= request.getContextPath() %>/assets/pages/waves/js/waves.min.js"></script>
	<!-- jquery slimscroll js -->
	<script type="text/javascript"
		src="<%= request.getContextPath() %>/assets/js/jquery-slimscroll/jquery.slimscroll.js "></script>
	<!-- modernizr js -->
	<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/SmoothScroll.js"></script>
	<script src="<%= request.getContextPath() %>/assets/js/jquery.mCustomScrollbar.concat.min.js "></script>
	<!-- i18next.min.js -->
	<script type="text/javascript"
		src="bower_components/i18next/js/i18next.min.js"></script>
	<script type="text/javascript"
		src="bower_components/i18next-xhr-backend/js/i18nextXHRBackend.min.js"></script>
	<script type="text/javascript"
		src="bower_components/i18next-browser-languagedetector/js/i18nextBrowserLanguageDetector.min.js"></script>
	<script type="text/javascript"
		src="bower_components/jquery-i18next/js/jquery-i18next.min.js"></script>
	<script type="text/javascript" src="<%= request.getContextPath() %>/assets/js/common-pages.js"></script>
</body>
</html>
