<%@ page language="java" pageEncoding="UTF-8"%>
<div class="container">
   <header>
<div class="row">
	<div class="small-12 large-12 columns">
		<div class="greenborder"></div>
		<div class="blackborder"></div>
		<div class="redborder"></div>
	</div>
</div>
<div class="row">
	<div class="row">
		<div class="small-4 large-4 columns">
			<img width="400" height="60" alt="logo" src="${pageContext.request.contextPath}/img/logo.png">
		</div>
		<div class="small-4 large-4 columns">
			<img width="220" height="40" alt="logo1" src="${pageContext.request.contextPath}/img/logo1.png">
		</div>
		<div class="small-4 large-4 columns">
			<nav class="top-bar-hih">
				<section class="top-bar-hih-section">
					<ul class="right">
						<li><a href="#">你好!</a></li>
						<li class="divider-hih"></li>
						<li><a href="#">个人空间</a></li>
						<li class="divider-hih"></li>
						<li><a href="#">登录</a></li>
						<li class="divider-hih"></li>
						<li><a href="${pageContext.request.contextPath}/common/register.jsp">注册</a></li>
						<li class="divider-hih"></li>
						<li><a href="${pageContext.request.contextPath}/common/help.jsp">帮助</a></li>
					</ul>
				</section>
			</nav>
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
							<a href="${pageContext.request.contextPath}/index.jsp"><div style="font-size: 0.875rem; font-family: 微软雅黑;">首页</div>
							</a>
						</li><li class="divider"></li>
						<li id="itemclass2">
							<a href="${pageContext.request.contextPath}/common/edu-news.jsp"><div style="font-size: 0.875rem; font-family: 微软雅黑;">教育资讯</div>
							</a>
						</li>
						<li class="divider"></li>
						<li id="itemclass3">
							<a href="${pageContext.request.contextPath}/common/app-summary.jsp"><div style="font-size: 0.875rem; font-family: 微软雅黑;">应用系统</div>
							</a>
						</li>
						<li class="divider"></li>
						<li id="itemclass4">
							<a href="${pageContext.request.contextPath}/common/success-demo.jsp"><div style="font-size: 0.875rem; font-family: 微软雅黑;">成功案例</div>
							</a>
						</li>
						<li class="divider"></li>
						<li id="itemclass5">
							<a href="${pageContext.request.contextPath}/admin/manage.jsp"><div style="font-size: 0.875rem; font-family: 微软雅黑;">管理员空间</div>
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
