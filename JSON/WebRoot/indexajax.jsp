<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	
	<script type="text/javascript" src="js/jquery-3.2.1.min.js" ></script>  
    <script type="text/javascript">  
     function  sub(){  
       $.ajax({  
       dataType:"json",
       type:"GET", 
       data:{username:$("#name").val()},  
       url:"/JSON/Servletajax",  
       statusCode: {404: function() {  
            alert('page not found'); }  
         },
         //data为servlet返回的数据      
       success:function(data,textStatus){ 
       $("#sp").html("<table border='1'><tr><td>ID</td><td>NAME</td><td>AGE</td></tr>"+
                "<tr><td>"+data.people.id+"</td><td>"+data.people.name+"</td><td>"+data.people.age+"</td></table>");  
       }  
       });  
     }  
    </script>  
  </head>
  
  <body>
  		<input type="text" name="username" id="name">  
       <br> 
       <input type="button" value="点击测试" id="btn" onclick="sub()"/><br>  
    result : 
    <span id="sp"></span> 
  </body>
</html>
