<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%-- <%
 	String Member_code = (String)session.getAttribute("Member_code");
	System.out.println("pwUpdate.jsp "+Member_code);
%> --%>
<style type="text/css">
.outer{
	display: flex;
}
.inner{
	margin: 0 auto;
}


</style>



<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$("form").on("submit",function(){
			if($("#pw_confirm").val()!=$("#pw").val()){
				$("#confirm").text("비밀번호가 일치하지 않습니다");
				$("#pw_confirm").focus();
				return false;
			}
		});//end submit
		
	});//end ready
		
	
</script>


	
<div class="outer">
	<div class="inner">	

    	<form action="PwUpdateServlet" method="post">
			<div class="card text-center" style="width: 18rem;">
			  <div class="card-body">
			  	<h5 class="card-title">새비밀번호 설정</h5>
			  	<div class="textbox">
				<!-- <label for="Member_code">아이디</label><br> -->
				<input type="text" name="pw" id="pw" placeholder="새비밀번호">
				<!-- <div class="error">유효하지 않은 아이디 입니다</div> -->
				</div>
				<br>
				<div class="textbox">
					<!-- <label for="Member_email">이메일</label><br> -->
					<input type="text" name="pw_confirm" id="pw_confirm" placeholder="비밀번호 확인"><br>
					<span id="confirm" style="color: red;"></span>
					<!-- <div class="error">유효하지 않은 이메일 주소 입니다</div> -->
				</div><br>
			    
				
			    <input class="btn btn-primary" type="submit" value="비밀번호변경" id="update">
			    
			  </div>
			</div>
		</form>
	</div>
</div>
