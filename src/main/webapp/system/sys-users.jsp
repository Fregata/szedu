<div class="row" ng-app='sysuser'>
  <div class="large-12 columns">
	<dl class="tabs vertical" data-tab="">
	  <dd class="active" id="adm-show"><a href="#">所有管理员</a></dd>
	  <dd id="adm-add"><a href="#">添加管理员</a></dd>
	  <dd id="adm-update"><a href="#">修改管理员</a></dd>
	</dl>
	<div class="tabs-content vertical">
	  <div class="content" id="adm-panel-show" ng-view></div>
	  <div class="content" id="adm-panel-add" ng-view></div>
	  <div class="content" id="adm-panel-update" ng-view></div>
	</div>
  </div>
</div>
<script>
$(document).ready(function(){
  $("#adm-show").click(function(){
	clearAppStyle();
    $("#adm-show").addClass("active");
    $("#adm-panel-show").addClass("active");
  });
  
  $("#adm-add").click(function(){
	clearAppStyle();
    $("#adm-add").addClass("active");
    $("#adm-panel-add").addClass("active");
  });

  $("#adm-update").click(function(){
	clearAppStyle();
    $("#adm-update").addClass("active");
    $("#adm-panel-update").addClass("active");
  });
  
});

function clearAppStyle(){
	$("dd").each(function(){
		$(this).removeClass("active");
	});
	$(".content").each(function(){
		$(this).removeClass("active");
	});
};
</script>