<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/11/20 0020
  Time: 13:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <link href="css/style.css" rel="stylesheet" type="text/css" media="all"/>
    <!-- Custom Theme files -->
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
    <meta name="keywords" content="Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyErricsson, Motorola web design" />
    <!--Google Fonts-->
    <link href='http://fonts.useso.com/css?family=Roboto:500,900italic,900,400italic,100,700italic,300,700,500italic,100italic,300italic,400' rel='stylesheet' type='text/css'>
    <link href='http://fonts.useso.com/css?family=Droid+Serif:400,700,400italic,700italic' rel='stylesheet' type='text/css'>
    <!--Google Fonts-->
</head>
<body>
<div class="login">
    <h2>Acced Form</h2>
    <div class="login-top">
        <h1>LOGIN FORM</h1>
        <form action="${pageContext.request.contextPath }/user/finduser.do" method="get">
            <input type="text" name="username" value="User Id" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'User Id';}">
            <input type="password" name="password" value="password" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'password';}">
        <div class="forgot">
            <a href="#">forgot Password</a>
            <input type="submit" value="Login" >
        </div>
        </form>
    </div>
    <div class="login-bottom">
        <h3>New User &nbsp;<a href="${pageContext.request.contextPath }/router_reg">Register</a>&nbsp Here</h3>
    </div>
</div>
</body>
</html>
