<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html PUBLIC "-//W3C//dtD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/dtD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page language="java" pageEncoding="UTF-8"%>
<title>恕之教育应用平台</title>
<link rel="shortcut icon" href="../img/sz.ico">
<link rel="stylesheet" href="../css/foundation.css" />
<link rel="stylesheet" href="../css/szedu.css" />
<script src="../js/vendor/modernizr.js"></script>
<script src="../js/vendor/jquery.js"></script>
<script src="../js/foundation.min.js"></script>

</head>
<body>
<div class="container">
<header>
<div class="row">
	<div class="small-12 large-12 columns">
		<div class="contain-to-grid sticky">
			<nav class="top-bar" data-topbar data-options="sticky_on:large">
				<section class="top-bar-section">
					<ul class="left">
						<li class="divider"></li>
						<li id="item-news" class="active">
							<a href="#"><div style="font-size: 0.875rem; font-family: 微软雅黑;">教育资讯管理</div>
							</a>
						</li><li class="divider"></li>
						<li id="item-apps">
							<a href="#"><div style="font-size: 0.875rem; font-family: 微软雅黑;">应用系统管理</div>
							</a>
						</li>
						<li class="divider"></li>
						<li id="item-users">
							<a href="#"><div style="font-size: 0.875rem; font-family: 微软雅黑;">用户管理</div>
							</a>
						</li>
				</section>
			</nav>
		</div>
	</div>
</div>
</header>
</div>
<div class="row">
  <div class="large-12 columns">
    <div class="panel" style="height:100px;background-color:#008CBA;">
      <h1><font style="font-family:微软雅黑;font-size:36px;color:#FFFFFF;">系统管理员空间</font></h1>
    </div>
  </div>
</div>
<div id="main" class="row" style="height:400px;">
	<div class="large-2 columns">&nbsp&nbsp</div>
	<div class="large-8 columns">
		<form>
		  <fieldset>
		    <legend>系统管理员登录</legend>
		      <div class="row">
		      <div class="large-6 columns">
		        <label>登录名</label>
		        <input type="text" placeholder="ad0001">
		      </div>
		      <div class="large-6 columns">
		        <label>登录密码</label>
		        <input type="text" placeholder="ad0001">
		      </div>
		    </div>
		    <div class="row">
		      <div class="large-4 columns">&nbsp&nbsp</div>
		      <div class="large-4 columns">
		        <a href="#" class="button tiny">重置</a>
		        <a href="#" class="button tiny">登录</a>
		      </div>
		      <div class="large-4 columns">&nbsp&nbsp</div>
		    </div>
		  </fieldset>
		</form>
	</div>
	<div class="large-2 columns">&nbsp&nbsp</div>
</div>
<br/>
<%@ include file="../include/footer.jsp"%>
<script>
$(document).ready(function(){
	
  $("#item-news").addClass("active");
  $("#main").load("${pageContext.request.contextPath}/system/sys-news.jsp");
  
  $("#item-news").click(function(){
	clearStyle();
    $("#item-news").addClass("active");
   	$("#main").load("${pageContext.request.contextPath}/system/sys-news.jsp");
  });
  
  $("#item-apps").click(function(){
	  clearStyle();
	  $("#item-apps").addClass("active");
      $("#main").load("${pageContext.request.contextPath}/system/sys-apps.jsp");
  });

  $("#item-users").click(function(){
	  clearStyle();
	  $("#item-users").addClass("active");
      $("#main").load("${pageContext.request.contextPath}/system/sys-users.jsp");
  });
});

function clearStyle(){
	 $("#item-news").removeClass("active");
	 $("#item-apps").removeClass("active");
	 $("#item-users").removeClass("active");
};
</script>
</body>
</html>