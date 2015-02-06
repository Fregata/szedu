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
<style type="text/css">
  .side-nav li.heading{
    color: #008CBA;
    font-size:0.77778rem;
    font-weight: bold;
    text-transform: uppercase;
  }
  .side-nav .heading, .sidebar{
    padding: 6px 0px;
  }

  .side-nav li{
    margin: 0;
    padding: 0;
    font-size: 0.77778rem;
    font-weight: normal;
  }
  .side-nav {
  display: block;
  margin: 0;
  padding: 0 0;
  list-style-type: none;
  list-style-position: outside;
  font-family: "Helvetica Neue", "Helvetica", Helvetica, Arial, sans-serif;
  }
</style>
</head>
<body>
<%@ include file="../include/header.jsp"%>
<div class="row">
  <div class="large-12 columns">
    <div class="panel" style="height:100px;background-color:#008CBA;">
      <h1><font style="font-family:微软雅黑;font-size:36px;color:#FFFFFF;">管理员操作空间</font></h1>
    </div>
  </div>
</div>

<div class="row" style="height:400px;">
  <div class="large-3 columns ">
     <div class="panel">
        <div class="section-container vertical-nav" data-section data-options="deep_linking: false; one_up: true">
         <section class="section">
           <h5 class="title"><a href="#item21" id="item21">所有应用</a></h5>
         </section>
         <section class="section">
           <h5 class="title"><a href="#item22" id="item22">已购应用</a></h5>
         </section>
         <section class="section">
           <h5 class="title"><a href="#item11" id="item11">创建科目</a</h5>
         </section>
         <section class="section">
           <h5 class="title"><a href="#item12" id="item12">修改科目</a></h5>
         </section>
         <section class="section">
           <h5 class="title"><a href="#item31" id="item31">创建下级管理员</a></h5>
         </section>
         <section class="section">
           <h5 class="title"><a href="#item32" id="item32">创建同级教研员</a></h5>
         </section>
        </div>
    </div>
  </div>
   <div class="large-9 columns">
	  <div id="content" class="panel">
	  </div>
   </div>
</div>
<%@ include file="../include/footer.jsp"%>
<script>
$(document).ready(function(){
  $("#content").load("all-app.jsp");
  $("#item11").click(function(){
   	$("#content").load("create-subject.jsp");
  });
  $("#item12").click(function(){
     $("#content").load("update-subject.jsp");
  });

  $("#item21").click(function(){
     $("#content").load("all-app.jsp");
  });

  $("#item22").click(function(){
     $("#content").load("buy-app.jsp");
  });

  $("#item31").click(function(){
     $("#content").load("create-admin.jsp");
  });

  $("#item32").click(function(){
     $("#content").load("create-researcher.jsp");
  });
});
</script>
</body>
</html>