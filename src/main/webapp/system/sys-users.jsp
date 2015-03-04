<div class="row">
  <div class="large-12 columns">
	<dl class="tabs vertical" data-tab="">
	  <dd class="active" id="adm-show"><a href="#">所有管理员</a></dd>
	  <dd id="adm-add"><a href="#">添加管理员</a></dd>
	  <dd id="adm-update"><a href="#">修改管理员</a></dd>
	</dl>
	<div class="tabs-content vertical">
	  <div class="content active" id="adm-panel-show">
	  	<form>
		  <fieldset>
		    <legend>所有应用</legend>
		      <div class="row">
		        <div class="large-12 columns">
		          <table id="adm-tbl">
		            <thead>
		              <tr>
		                <th width="100">管理员编号</th>
		                <th width="100">登录名</th>
		                <th width="100">密码</th>
		                <th width="150">联系电话</th>
		                <th>邮箱地址</th>
		                <th width="100">操作</th>
		              </tr>
		            </thead>
		            <tbody>
		            </tbody> 
		          </table>
		        </div>
		    </div>
		  </fieldset>
		</form>
	  </div>
	  <div class="content" id="adm-panel-add">
	  	<form>
		  <fieldset>
		    <legend>添加管理员</legend>
		      <div class="row">
		      <div class="large-12 columns">
		        <label>管理员编号</label>
		        <input id="id" type="text" placeholder="10001"/>
		      </div>
		    </div>
		    <div class="row">
		      <div class="large-4 columns">
		        <label>管理员登录名</label>
		        <input id="name" type="text" placeholder="ad0001"/>
		      </div>
		      <div class="large-4 columns">
		        <label>密码</label>
		        <input id="pwd" type="text" placeholder="六位字符或数字"/>
		      </div>
		      <div class="large-4 columns">
		        <div class="row collapse">
		          <label>确认密码</label>
		          <input id="repwd" type="text" placeholder="六位字符或数字"/>
		        </div>
		      </div>
		    </div>
		    <div class="row">
		      <div class="large-4 columns">
		        <label>管理员等级</label>
		        <input id="level" type="text" placeholder="ad0001"/>
		      </div>
		      <div class="large-4 columns">
		        <label>联系电话</label>
		        <input id="tel" type="text" placeholder=""/>
		      </div>
		      <div class="large-4 columns">
		        <div class="row collapse">
		          <label>邮箱地址</label>
		          <div class="small-9 columns">
		            <input id="mail" type="text" placeholder="admin@hongqiao"/>
		          </div>
		          <div class="small-3 columns">
		            <span class="postfix">.com</span>
		          </div>
		        </div>
		      </div>
		    </div>
		    <div class="row">
		      <div class="large-4 columns">&nbsp&nbsp</div>
		      <div class="large-4 columns">
		        <a class="button tiny">重置参数</a>
		        <a onclick="addAdmin()"class="button tiny">提交表单</a>
		      </div>
		      <div class="large-4 columns">&nbsp&nbsp</div>
		    </div>
		  </fieldset>
		</form>
	  </div>
	  <div class="content" id="adm-panel-update">
	  	<form>
		  <fieldset>
		    <legend>修改管理员</legend>
		      <div class="row">
		      <div class="large-12 columns">
		        <label>管理员编号</label>
		        <input id="id2" readonly="readonly" type="text" placeholder="10001"/>
		      </div>
		    </div>
		    <div class="row">
		      <div class="large-4 columns">
		        <label>管理员登录名</label>
		        <input id="name2" type="text" placeholder="ad0001"/>
		      </div>
		      <div class="large-4 columns">
		        <label>密码</label>
		        <input id="pwd2" type="text" placeholder="六位字符或数字"/>
		      </div>
		      <div class="large-4 columns">
		        <div class="row collapse">
		          <label>确认密码</label>
		          <input id="repwd2" type="text" placeholder="六位字符或数字"/>
		        </div>
		      </div>
		    </div>
		    <div class="row">
		      <div class="large-4 columns">
		        <label>管理员等级</label>
		        <input id="level2" type="text" placeholder="ad0001"/>
		      </div>
		      <div class="large-4 columns">
		        <label>联系电话</label>
		        <input id="tel2" type="text" placeholder=""/>
		      </div>
		      <div class="large-4 columns">
		        <div class="row collapse">
		          <label>邮箱地址</label>
		          <div class="small-9 columns">
		            <input id="mail2" type="text" placeholder="admin@hongqiao"/>
		          </div>
		          <div class="small-3 columns">
		            <span class="postfix">.com</span>
		          </div>
		        </div>
		      </div>
		    </div>
		    <div class="row">
		      <div class="large-4 columns">&nbsp&nbsp</div>
		      <div class="large-4 columns">
		        <a class="button tiny">重置参数</a>
		        <a onclick="uptAdmin()"class="button tiny">提交表单</a>
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
	$.ajax({
		url: "${pageContext.request.contextPath}/sys/user", 
		type: "GET",
		success: callBack
	});
	
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

function delAdmin(id){
	$.ajax({
		url: "${pageContext.request.contextPath}/sys/user/"+id, 
		type: "DELETE",
		success: callBack
	});
};

function findAdmin(id){
	$.ajax({
		url: "${pageContext.request.contextPath}/sys/user/"+id, 
		type: "GET",
		success: function(data,status){
			clearAppStyle();
		    $("#adm-update").addClass("active");
		    $("#adm-panel-update").addClass("active");
			$("#id2").val(data.adminid);
		    $("#name2").val(data.adminname);
		    $("#pwd2").val(data.adminpwd);
		    $("#repwd2").val(data.adminpwd);
		    $("#level2").val(data.adminlevel);
		    $("#tel2").val(data.admintelno);
		    $("#mail2").val(data.adminmail);
		}
	});
};

function addAdmin(){
	$.ajax({
		url: "${pageContext.request.contextPath}/sys/user/add", 
		type: "POST",
		data: {
			id:$("#id").val(),
			name:$("#name").val(),
			pwd:$("#pwd").val(),
			tel:$("#tel").val(),
			mail:$("#mail").val()
			},
		success: callBack
	});
};

function uptAdmin(){
	$.ajax({
		url: "${pageContext.request.contextPath}/sys/user/upt", 
		type: "POST",
		data: {
			id:$("#id2").val(),
			name:$("#name2").val(),
			pwd:$("#pwd2").val(),
			tel:$("#tel2").val(),
			mail:$("#mail2").val()
			},
		success: callBack
	});
};

function callBack(data,status){
	 $("#adm-tbl").find("tbody").html("");
	 $.each(data, function(index,item){
	    	var row = "<tr><td>"+item.adminid
	    	+"</td><td>"+item.adminname
	    	+"</td><td>"+item.adminpwd
	    	+"</td><td>"+item.admintelno
	    	+"</td><td>"+item.adminemail
	    	+"</td><td><a onclick=\"delAdmin('"+item.adminid+"');\""
	    	+" style=\"font-family:Arial;font-size:0.3rem;\">删除</a>&nbsp&nbsp"
	    	+"<a onclick=\"findAdmin('"+item.adminid+"');\""+" style=\"font-family:Arial;font-size:0.3rem;\">修改</a></td></tr>";
	    	$("#adm-tbl").find("tbody").append(row);
	    });
		clearAppStyle();
	    $("#adm-show").addClass("active");
	    $("#adm-panel-show").addClass("active");
}
</script>