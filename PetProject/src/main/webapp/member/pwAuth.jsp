<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String resultNum = (String)request.getAttribute("resultNum");
	System.out.println("pwAuth.jsp "+ resultNum);
	
%>

<style type="text/css">
.outer{
	display: flex;
}
.inner{
	margin: 0 auto;
}


 </style>

 <%
 String authmesg = (String)request.getAttribute("authmesg");
	if(authmesg!=null){
%>
<script>
	alert("<%= authmesg %>");
</script>
<%
	request.removeAttribute("authmesg");
	}
%> 


<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		
		$("#auth_check").on("click",function(){
			if($("#pw_Auth").val()!= <%= resultNum %>){
				alert("인증번호가 올바르지 않습니다");
				return false;
			}
		});//end click
		
		
		
	});//end ready
		
	
</script>


	
<div class="outer">
	<div class="inner">	

    	
			<div class="card text-center" style="width: 18rem;">
			  <div class="card-body">
			  	<h5 class="card-title">비밀번호 찾기</h5>
			  	<div class="textbox">
				<!-- <label for="Member_code">아이디</label><br> -->
				<input type="text" name="pw_Auth" id="pw_Auth" placeholder="인증번호를 입력하세요">
				<!-- <div class="error">유효하지 않은 아이디 입니다</div> -->
				</div>
				<br>
				
			    
				
			    <a href="PwUpdateUIServlet" class="btn btn-primary" id="auth_check">확인</a>
			    
			  </div>
			</div>
		
	</div>
</div>
