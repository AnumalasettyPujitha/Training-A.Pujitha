<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style>
body, html {
	height: 100%;
	margin: 0;
}

.bg {
	/* The image used */
	background-image: url("background.jpg");
	/* Full height */
	height: 100%;
	/* Center and scale the image nicely */
	background-position: center;
	background-size: cover;
	background-attachment: fixed;
}
</style>
<link rel="stylesheet"
	href="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/css/bootstrap.min.css">
<script
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.16.0/umd/popper.min.js"></script>
<script
	src="https://maxcdn.bootstrapcdn.com/bootstrap/4.5.2/js/bootstrap.min.js"></script>
</head>
<body class="bg">

	<nav class="navbar navbar-expand-sm bg-secondary navbar-dark fixed-top">

		<a class="" href="college_home.jsp"><img src="logo.jpg" alt="logo"
			style="width: 50px; height: 50px;"></a>
		<ul class="navbar-nav ml-auto">
			<li class="nav-item"><a class="nav-link" href="college_home.jsp">Home</a></li>
			<li class="nav-item"><a class="nav-link" href="registered_alumni.jsp">Registered Alumni</a></li>
			<li class="nav-item"><a class="nav-link" href="track_alumni.jsp">Track Alumnis</a></li>
			<li class="nav-item"><a class="nav-link" href="college_events.jsp">View Events</a></li>
			<li class="nav-item dropdown"><a
				class="nav-link dropdown-toggle" href="#" id="navbardrop"
				data-toggle="dropdown"> Emails Info </a>
				<div class="dropdown-menu">
					<a class="dropdown-item" href="compose_email.jsp?page=college">Compose a
						Mail</a> <a class="dropdown-item" href="view_email.jsp?page=college">View Email</a>
				</div></li>
			<li class="nav-item"><a class="nav-link" href="index.jsp">Logout</a></li>
		</ul>

	</nav>
	<br><br><br>
</body>
</html>