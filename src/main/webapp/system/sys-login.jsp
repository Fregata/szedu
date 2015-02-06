<!DOCTYPE html PUBLIC "-//W3C//dtD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/dtD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page language="java" pageEncoding="UTF-8"%>
<title>恕之教育系统管理</title>
<link rel="shortcut icon" href="${pageContext.request.contextPath}/img/sz.ico">
<link rel="stylesheet" href="${pageContext.request.contextPath}/css/sys.css" />
</head>
<body>
	<section class="about">
	    <p>
	      <img src="${pageContext.request.contextPath}/img/sys.jpg">
	    </p>
	    <p>
	      <font style="font-size:1 rem;font-family:微软雅黑;">系统管理员登录</font>
	    </p>
  </section>
  <form method="post" action="${pageContext.request.contextPath}/sys/login.html" class="login">
    <p>
      <label for="login"><font style="font-size:1 rem;font-family:微软雅黑;">登录名:</font></label>
      <input type="text" name="username" id="username" value="sysadmin">
    </p>

    <p>
      <label for="password"><font style="font-size:1 rem;font-family:微软雅黑;">登录密码:</font></label>
      <input type="password" name="password" id="password" value="sysadmin">
    </p>

    <p class="login-submit">
      <button type="submit" class="login-button">Login</button>
    </p>

    <p class="forgot-password"><a href="index.html">忘记密码?</a></p>
  </form>
</body>
</html>