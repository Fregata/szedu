<!DOCTYPE html PUBLIC "-//W3C//dtD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/dtD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<%@ page language="java" pageEncoding="UTF-8"%>
    <title>恕之教育应用平台</title>
	<link rel="shortcut icon" href="img/sz.ico">
    <link rel="stylesheet" href="css/foundation.css" />
	<link rel="stylesheet" href="css/szedu.css" />
    <script src="js/vendor/modernizr.js"></script>
  </head>
  <body>
<div class="container">
<header>
<div class="row">
	<div class="small-12 large-12 columns">
		<div class="blackborder"></div>
		<div class="blackborder"></div>
		<div class="blackborder"></div>
	</div>
</div>

<div class="row">
  <div class="small-12 large-12 columns">
    <div style="height:60px; background-image:url('img/top_bar.png');">
    	<div class="small-4 large-4 columns">&nbsp;&nbsp;</div>
    	<div class="small-4 large-4 columns">&nbsp;&nbsp;</div>
      <div class="small-4 large-4 columns" style="text-align: left;">
      	<ul class="button-group radius">
			  <li><a href="#"  id="login" data-reveal-id="loginModal" class="tiny button">登录</a></li>
				<div id="loginModal" class="reveal-modal" data-reveal>
				  <h2>This is a modal.</h2>
				  <p>Reveal makes these very easy to summon and dismiss. The close button is simply an anchor with a unicode character icon and a class of <code>close-reveal-modal</code>. Clicking anywhere outside the modal will also dismiss it.</p>
				  <p>Finally, if your modal summons another Reveal modal, the plugin will handle that for you gracefully.</p>
				  <a class="close-reveal-modal">×</a>
				</div>
			  <li><a href="#" class="tiny button">注册</a></li>
			  <li><a href="#" class="tiny button">帮助</a></li>
		</ul>
      </div>
    </div>
  </div>
</div>
<div class="row">
	<div class="small-12 large-12 columns">
		<div class="contain-to-grid sticky">
			<nav class="top-bar" data-topbar data-options="sticky_on:large">
				<section class="top-bar-section">
					<ul class="left">
						<li class="divider"></li>
						<li id="itemclass1" class="active">
							<a href="#"><div style="font-size: 0.875rem; font-family: 微软雅黑;">首页</div>
							</a>
						</li><li class="divider"></li>
						<li id="itemclass2">
							<a href="#"><div style="font-size: 0.875rem; font-family: 微软雅黑;">教育资讯</div>
							</a>
						</li>
						<li class="divider"></li>
						<li id="itemclass3">
							<a href="#"><div style="font-size: 0.875rem; font-family: 微软雅黑;">应用系统</div>
							</a>
						</li>
						<li class="divider"></li>
						<li id="itemclass4">
							<a href="#"><div style="font-size: 0.875rem; font-family: 微软雅黑;">成功案例</div>
							</a>
						</li>
						<li class="divider"></li>
						<li id="itemclass5">
							<a href="#"><div style="font-size: 0.875rem; font-family: 微软雅黑;">管理员空间</div>
							</a>
						</li>
						<li id="itemclass100" style="margin-left:140px;">&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;</li>
					</ul>
					<ul>
						<li class="has-form">
							<input type="hidden" name="searchPage" value="1" />
							<div class="row collapse">
								<div class="large-10 small-10 columns">
									<input type="text" placeholder="搜索:应用、案例、资讯" style="width:240px;" value="" name="searchContent"/>
								</div>
								<div class="large-2 small-2 columns"><a href="#" class="alert button expand">搜索</a></div>
							</div>
						</li>
					</ul>
				</section>
			</nav>
		</div>
	</div>
</div>
</header>
</div>
<div id="content">

</div>
<%@ include file="include/footer.jsp"%>
<script src="js/vendor/jquery.js"></script>
<script src="js/foundation.min.js"></script>
<script>
$(document).ready(function(){
	clearStyle();
	$("#itemclass1").addClass("active");
	$("#content").load("${pageContext.request.contextPath}/common/home.jsp");  
  $("#itemclass1").click(function(){
	  clearStyle();
	  $("#itemclass1").addClass("active");
	  $("#content").load("${pageContext.request.contextPath}/common/home.jsp"); 
  });
  $("#itemclass2").click(function(){
	  clearStyle();
	  $("#itemclass2").addClass("active");
	  $("#content").load("${pageContext.request.contextPath}/common/edu-news.jsp"); 
  });

  $("#itemclass3").click(function(){
	  clearStyle();
	  $("#itemclass3").addClass("active");
	  $("#content").load("${pageContext.request.contextPath}/common/app-summary.jsp"); 
  });

  $("#itemclass4").click(function(){
	  clearStyle();
	  $("#itemclass4").addClass("active");
	  $("#content").load("${pageContext.request.contextPath}/common/success-demo.jsp"); 
  });

  $("#itemclass5").click(function(){
	  clearStyle();
	  $("#itemclass5").addClass("active");
	  $("#content").load("${pageContext.request.contextPath}/admin/manage.jsp"); 
  });

	$('#login').click(function() {
	  $('#loginModal').foundation('reveal','open');
	});
	
	$('a.close-reveal-modal').click(function() {
	  $('#loginModal').foundation('reveal', 'close');
	});
});
function clearStyle(){
	$("#itemclass1").removeClass("active");
	$("#itemclass2").removeClass("active");
	$("#itemclass3").removeClass("active");
	$("#itemclass4").removeClass("active");
	$("#itemclass5").removeClass("active");
};
</script>
</body>
</html>