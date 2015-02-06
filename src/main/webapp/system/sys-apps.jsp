<div class="row">
  <div class="large-12 columns">
	<dl class="tabs vertical" data-tab="">
	  <dd class="active" id="app-show"><a href="#">所有应用</a></dd>
	  <dd id="app-add"><a href="#">添加应用</a></dd>
	  <dd id="app-update"><a href="#">修改应用</a></dd>
	</dl>
	<div class="tabs-content vertical">
	    <div class="content active" id="app-panel-show">
	    <form>
		  <fieldset>
		    <legend>所有应用</legend>
		      <div class="row">
		        <div class="large-12 columns">
		          <table id="app-tbl">
		            <thead>
		              <tr>
		                <th width="100">应用编号</th>
		                <th width="100">应用名称</th>
		                <th width="200">应用链接</th>
		                <th>应用介绍</th>
		                <th width="100">操作</th>
		              </tr>
		            </thead>
		            <tbody id="app-tbody">
		            </tbody> 
		          </table>
		        </div>
		    </div>
		  </fieldset>
		</form>
	  </div>
	  <div class="content" id="app-panel-add">
	    <form name="add-app-form" id="add-form">
		  <fieldset>
		    <legend>添加应用</legend>
		     	<div class="row">
			      <div class="large-12 columns">
			        <label>应用编号</label>
			        <input type="text" name="appid1" placeholder="10001">
			      </div>
			    </div>
			    
			    <div class="row">
			      <div class="large-6 columns">
			        <label>应用名称</label>
			        <input type="text" name="appname1" placeholder="绿色指标">
			      </div>
			      <div class="large-6 columns">
				      <div class="row collapse">
				        <label>应用链接</label>
				        <input type="text" name="appuri1" placeholder="http://172.12.15.26/app.html">
				       </div>
			      </div>
			     </div>
			     
			     <div class="row">
			      <div class="large-12 columns">
			          <label>应用介绍</label>
			          <textarea name="appdes1" placeholder="描述信息"></textarea>
			      </div>
			     </div>
			     <div class="row">
			      <div class="large-4 columns">&nbsp&nbsp</div>
			      <div class="large-4 columns">
			        <a href="#" id="reset1" class="button tiny">重置参数</a>
			        <a href="#" id="submit1" class="button tiny">提交表单</a>
			      </div>
			      <div class="large-4 columns">&nbsp&nbsp</div>
			    </div>
		  </fieldset>
		</form>
	  </div>
	  <div class="content" id="app-panel-update">
	    <form name="update-app-form" id="update-form">
		  <fieldset>
		    <legend>修改应用</legend>
		      <div class="row">
			      <div class="large-12 columns">
			        <label>应用编号</label>
			        <input type="text" name="appid2" placeholder="10001">
			      </div>
			    </div>
			    
			    <div class="row">
			      <div class="large-6 columns">
			        <label>应用名称</label>
			        <input type="text" name="appname2" placeholder="绿色指标">
			      </div>
			      <div class="large-6 columns">
				      <div class="row collapse">
				        <label>应用链接</label>
				        <input type="text" name="appuri2" placeholder="http://172.12.15.26/app.html">
				       </div>
			      </div>
			     </div>
			     
			     <div class="row">
			      <div class="large-12 columns">
			          <label>应用介绍</label>
			          <textarea name="appdes2" placeholder="描述信息"></textarea>
			      </div>
			     </div>
			     <div class="row">
			      <div class="large-4 columns">&nbsp&nbsp</div>
			      <div class="large-4 columns">
			        <a href="#" id="reset2" class="button tiny">重置参数</a>
			        <a href="#" id="submit2" class="button tiny">提交表单</a>
			      </div>
			      <div class="large-4 columns">&nbsp&nbsp</div>
			    </div>
		  </fieldset>
		</form>
	  </div>
	</div>
	</div>
</div>
<script>
$(document).ready(function(){
  $.post("${pageContext.request.contextPath}/sys/app/list", callBack);

  $("#app-show").click(function(){
	clearAppStyle();
    $("#app-show").addClass("active");
    $("#app-panel-show").addClass("active");
  });
  
  $("#app-add").click(function(){
	clearAppStyle();
    $("#app-add").addClass("active");
    $("#app-panel-add").addClass("active");
  });

  $("#app-update").click(function(){
	clearAppStyle();
    $("#app-update").addClass("active");
    $("#app-panel-update").addClass("active");
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

 $("#submit1").click(function(){
	 var appid = $('input[name=appid1]').val();
	 var appname = $('input[name=appname1]').val();
	 var appuri = $('input[name=appuri1]').val();
	 var appdes = $('textarea[name=appdes1]').val();
	  $.post("${pageContext.request.contextPath}/sys/app/add",
	  {
	    appid:appid,
	    appname:appname,
	    appuri:appuri,
	    appdes:appdes
	  }, callBack);
});

$("#submit2").click(function(){
	 var appid = $('input[name=appid2]').val();
	 var appname = $('input[name=appname2]').val();
	 var appuri = $('input[name=appuri2]').val();
	 var appdes = $('textarea[name=appdes2]').val();
	  $.post("${pageContext.request.contextPath}/sys/app/put",
	  {
	    appid:appid,
	    appname:appname,
	    appuri:appuri,
	    appdes:appdes
	  }, callBack);
});
 
function callBack(data,status){
	 $("#app-tbl").find("tbody").html("");
	 $.each(data, function(index,item){
	    	var row = "<tr><td>"+item.appid
	    	+"</td><td>"+item.appname
	    	+"</td><td>"+item.appuri
	    	+"</td><td>"+item.appdes
	    	+"</td><td><a onclick=\"deleteApp('"+item.appid+"');\""
	    	+" style=\"font-family:Arial;font-size:0.3rem;\">删除</a>&nbsp&nbsp"
	    	+"<a onclick=\"findApp('"+item.appid+"');\""+" style=\"font-family:Arial;font-size:0.3rem;\">修改</a></td></tr>";
	    	$("#app-tbl").find("tbody").append(row);
	    });
	    clearAppStyle();
	    $("#app-show").addClass("active");
	    $("#app-panel-show").addClass("active");
};

function deleteApp(appid){
	var uri = "${pageContext.request.contextPath}/sys/app/del";
	$.post(uri,
	  {
	    appid:appid
	  }, callBack);
};

function findApp(appid){
	var uri = "${pageContext.request.contextPath}/sys/app/find";
	$.post(uri,
	  {
	    appid:appid
	  }, function(data,status){
		  $('input[name=appid2]').val(data.appid);
		  $('input[name=appid2]').attr("readonly","readonly");
		  $('input[name=appname2]').val(data.appname);
		  $('input[name=appuri2]').val(data.appuri);
		  $('textarea[name=appdes2]').val(data.appdes);
		  clearAppStyle();
		  $("#app-update").addClass("active");
		  $("#app-panel-update").addClass("active");
	  });
};
</script>