<%@ page language="java" pageEncoding="UTF-8"%>
<div id="appContent">
<div class="row">
  <div class="large-12 columns">
    <div class="panel" style="height:100px;background-color:#008CBA;">
      <h1><font style="font-family:微软雅黑;font-size:36px;color:#FFFFFF;">优秀应用系统介绍</font></h1>
    </div>
  </div>
</div>


<div class="row">
  <div class="large-12 columns">
   
    <div class="row">
    
      <div class="large-4 small-12 columns">
        <a href="#" onclick="loadDetail('app01')"><img src="img/green1.png"></a>
        <div class="hide-for-small panel">
          <h3>绿色指标</h3>
          <h8 class="subheader">JeeSite基于Apache 2开源协议，是一个轻量级的，简单易学的开源企业信息管理系统基础框架。主要定位于“企业信息管理”领域，可用作企业信息管理类系统、网站后台管理类系统等.
          </h8>
        </div>

        <a href="#">
        <div class="panel callout radius">
          <h6>免费试用</h6>
        </div>
        </a>
      </div>
      
      <div class="large-4 small-12 columns">
        <a href="#" onclick="loadDetail('app02')"><img src="img/green1.png"></a>
        <div class="hide-for-small panel">
          <h3>体质检测</h3>
          <h8 class="subheader">JeeSite基于Apache 2开源协议，是一个轻量级的，简单易学的开源企业信息管理系统基础框架。主要定位于“企业信息管理”领域，可用作企业信息管理类系统、网站后台管理类系统等.
          </h8>
        </div>

        <a href="#">
        <div class="panel callout radius">
          <h6>免费试用</h6>
        </div>
        </a>
      </div>
      
      <div class="large-4 small-12 columns">
        <a href="#" onclick="loadDetail('app03')"><img src="img/green1.png"></a>
        <div class="hide-for-small panel">
          <h3>作业系统</h3>
          <h8 class="subheader">JeeSite基于Apache 2开源协议，是一个轻量级的，简单易学的开源企业信息管理系统基础框架。主要定位于“企业信息管理”领域，可用作企业信息管理类系统、网站后台管理类系统等.
          </h8>
        </div>

        <a href="#">
        <div class="panel callout radius">
          <h6>免费试用</h6>
        </div>
        </a>
      </div>
      
    </div>
  </div>
</div>
</div>
<script>
function loadDetail(item){
	var url = "${pageContext.request.contextPath}/common/"+item+"-detail.jsp";
	$("#appContent").html="";
	$("#appContent").load(url);
}
</script>