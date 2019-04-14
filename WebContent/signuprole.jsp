<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="zxx" class="no-js">

<head>
	<!-- Mobile Specific Meta -->
	<meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
	<!-- Favicon-->
	<link rel="shortcut icon" href="img/fav.png">
	<!-- Author Meta -->
	<meta name="author" content="codepixer">
	<!-- Meta Description -->
	<meta name="description" content="">
	<!-- Meta Keyword -->
	<meta name="keywords" content="">
	<!-- meta character set -->
	<meta charset="UTF-8">
	<!-- Site Title -->
	<title>Educature Education</title>

	<!--
			Google Font
			============================================= -->
	<link href="https://fonts.googleapis.com/css?family=Montserrat:300,500,600" rel="stylesheet">
	<link href="https://fonts.googleapis.com/css?family=Roboto:300,400,500i" rel="stylesheet">

	<!--
			CSS
			============================================= -->
	<link rel="stylesheet" href="https://cdn.jsdelivr.net/themify-icons/0.1.2/css/themify-icons.css">
	<link rel="stylesheet" href="css/linearicons.css">
	<link rel="stylesheet" href="css/font-awesome.min.css">
	<link rel="stylesheet" href="css/bootstrap.css">
	<link rel="stylesheet" href="css/magnific-popup.css">
	<link rel="stylesheet" href="css/nice-select.css">
	<link rel="stylesheet" href="css/animate.min.css">
	<link rel="stylesheet" href="css/owl.carousel.css">
	<link rel="stylesheet" href="css/main.css">
	<style>
		.h1role
		{
			margin-top: 140px; 
			margin-left: 50px;
		}
	</style>
</head>

<body>

	<!-- Start Header Area -->
		<jsp:include page="header.jsp"></jsp:include>
	<!-- End Header Area -->
	
	<!-- Start Banner Area -->
	<section class="banner-area relative">
		<div class="container">
			<div class="row d-flex align-items-center justify-content-center">
				<div class="about-content col-lg-12">
					<h1 class="text-white">
							Signup
					</h1>
					<p>In the history of modern astronomy, there is probably no one greater leap forward than the building and launch of
						the space telescope.</p>
					<div class="link-nav">
						<span class="box">
							<a href="index.jsp">Home </a>
							<i class="lnr lnr-arrow-right"></i>
							<a href="signup.html">Signup</a>
						</span>
					</div>
				</div>
			</div>
		</div>
		<div class="rocket-img">
			<img src="img/rocket.png" alt="">
		</div>
	</section>
	<!-- End Banner Area -->
	<!-- Start login Area -->
	<h1 class="h1role">Select Your Role :</h1>
	<div class="col-lg-8" style="margin-top: 50px;">
					<div class="form-area contact-form text-right" id="myForm" action="mail.php" method="post">
						<div class="row">
							<div class="col-lg-6" style="margin-left: 380px;">
								<a class="primary-btn" href="studentsignup.jsp">Student</a>
								<a class="primary-btn" style="margin-left: 20px;" href="facultysignup.jsp">Faculty</a>
							</div>
						</div>
					</div>
	</div>
	<!-- End Login Area -->

	<!-- Start Footer Area -->
		<jsp:include page="footer.jsp"></jsp:include>
	<!-- End Footer Area -->
</body>
</html>