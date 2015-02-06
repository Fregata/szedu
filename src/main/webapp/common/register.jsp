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
<%@ include file="../include/header.jsp"%>
	<div class="row" id="doc-forms">
        <div class="large-12 columns"style="height:500px;">
          	<form class="custom" id="formID_regesiter" method="post" name="formID_regesiter" action="/hih/register.html">
              <fieldset>
                <legend>用户基本信息</legend>
                <div class="row">
                  <div class="small-6 columns large-6 columns">
                    <label>登陆用户名<font color="red">*</font></label>
                    <input type="text" class="validate[required,minSize[4],maxSize[20],ajax[ajaxNameCall]] text-input" placeholder="登录唯一账号" name="register_name" id="register_name">
  					     </div>
                  <div class="small-6 columns large-6 columns">
                    <label>昵称<font color="red">*</font></label>
                    <input type="text" name="nickname" class="validate[required] text-input" placeholder="昵称" id="nickname">
                  </div>
                </div>

                <div class="row">
                  <div class="small-6 columns large-6 columns">
                    <label>登录密码<font color="red">*</font></label>
                    <input type="password" class="validate[required,minSize[8],maxSize[20]]" placeholder="安全密码" id="passwd" name="passwd">
                  </div>
                  <div class="small-6 columns large-6 columns">
                      <label>确认密码<font color="red">*</font></label>
                      <input type="password" name="passwdqr" class="validate[required,minSize[8],maxSize[20],equals[passwd]]" placeholder="安全匹配密码" id="passwdqr">
                  </div>
                  </div>
                    <div class="row">
                  <div class="small-6 columns large-6 columns">
                    <label>学校<font color="red">*</font></label>
                    <select id="school" name="school">
                      <option value="8a108de94393bafb014393bb68f4004f">闵行一中</option> 
                      <option value="8a108de94393bafb014393bb68f4004f">闵行二中</option> 
                      <option value="8a108de94393bafb014393bb68f4004f">闵行三中</option> 
                      <option value="8a108de94393bafb014393bb68f4004f">闵行四中</option> 
                    </select>
                </div>
    					<div class="small-4 columns large-4 columns">
    						<label>验证码<font color="red">*</font></label> 
    						<input type="text" class="validate[required,minSize[4],ajax[ajaxIdentifyCall]] text-input" id="yzm" name="yzm">
    					</div>
    					<div class="small-2 columns large-2 columns">
                <img style="margin-left:2px;margin-top:20px;" alt="验证码" onclick="ReRandomCode(this);" src="/hih/randomCode.html">
              </div>
            </div>
             <div class="row">
              <div class="small-12 columns large-12 columns">
                 <label>个人简介</label>
                <textarea placeholder="兴趣爱好" id="remark" name="remark"></textarea>
              </div>
            </div>
            <div class="row">
              <div class="large-2 columns">&nbsp&nbsp</div>
              <div class="large-2 columns">&nbsp&nbsp</div>
              <div class="large-2 columns">
                <a href="#" class="button tiny">重置</a>
              </div>
              <div class="large-2 columns">
                <a href="#" class="button tiny">注册</a>
              </div>
              <div class="large-2 columns">&nbsp&nbsp</div>
              <div class="large-2 columns">&nbsp&nbsp</div>
            </div>
           </fieldset>
          </form>
        </div>
      </div>
<%@ include file="../include/footer.jsp"%>
</body>
</html>