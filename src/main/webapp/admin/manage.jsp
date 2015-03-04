<%@ page language="java" pageEncoding="UTF-8"%>
<div class="row">
  <div class="large-12 columns">
    <div class="panel" style="height:100px;background-color:#008CBA;">
      <h1><font style="font-family:微软雅黑;font-size:36px;color:#FFFFFF;">管理员操作空间</font></h1>
    </div>
  </div>
</div>

<div class="row" style="height:400px;">
  <div class="large-3 columns">
     <div class="panel" style="background-color:#F5F5F5;">
      <ul class="accordion" data-accordion="">
        <li class="accordion-navigation">
          <a id="panel1a">应用管理</a>
          <div id="panel1b" class="content">
            <h8 class="title"><a href="#item21" id="item21">所有应用</a></h8>
            <br>
            <h8 class="title"><a href="#item22" id="item22">已购应用</a></h8>
          </div>
        </li>
        <li class="accordion-navigation">
          <a id="panel2a">科目管理</a>
          <div id="panel2b" class="content">
             <h8 class="title"><a href="#item11" id="item11">创建科目</a></h8>
             <br>
             <h8 class="title"><a href="#item12" id="item12">修改科目</a></h8>
          </div>
        </li>
        <li class="accordion-navigation">
          <a id="panel3a">用户管理</a>
          <div id="panel3b" class="content">
            <h8 class="title"><a href="#item31" id="item31">创建下级管理员</a></h8>
            <br>
            <h8 class="title"><a href="#item32" id="item32">创建同级教研员</a></h8>
          </div>
        </li>
      </ul>
    </div>
  </div>
 <div class="large-9 columns">
	  <div id="admcontent" class="panel">
	  </div>
 </div>
</div>
<script>
$(document).ready(function(){
  $("#panel1b").addClass("active");
  $("#admcontent").load("admin/all-app.jsp");

  $("#panel1a").click(function(){
    clearItemStyle();
    $("#panel1b").addClass("active");
  });
  $("#panel2a").click(function(){
    clearItemStyle();
    $("#panel2b").addClass("active");
  });
  $("#panel3a").click(function(){
    clearItemStyle();
    $("#panel3b").addClass("active");
  });

  $("#item11").click(function(){
   	$("#admcontent").load("admin/create-subject.jsp");
  });
  $("#item12").click(function(){
     $("#admcontent").load("admin/update-subject.jsp");
  });

  $("#item21").click(function(){
     $("#admcontent").load("admin/all-app.jsp");
     $.post("${pageContext.request.contextPath}/sys/app/list", callBack);
  });
  $("#item22").click(function(){
     $("#admcontent").load("admin/buy-app.jsp");
  });

  $("#item31").click(function(){
     $("#admcontent").load("admin/create-admin.jsp");
  });
  $("#item32").click(function(){
     $("#admcontent").load("admin/create-researcher.jsp");
  });
});

function callBack(data,status){
	 $("#app-tbl").find("tbody").html("");
	 $.each(data, function(index,item){
	    	var row = "<tr><td>"+item.appid
	    	+"</td><td>"+item.appname
	    	+"</td><td>"+item.appdes
	    	+"</td><td><a onclick=\"buyApp('"+item.appid+"');\""+" style=\"font-family:Arial;font-size:0.3rem;\">购买</a></td></tr>";
	    	$("#app-tbl").find("tbody").append(row);
	 });
};

function clearItemStyle(){
  $("#panel1b").removeClass("active");
  $("#panel2b").removeClass("active");
  $("#panel3b").removeClass("active");
};
</script>
