<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<style type="text/css">
.outer{
	display: flex;
}
.inner{
	margin: 0 auto;
}


</style>

<%
	String checkmesg = (String)request.getAttribute("checkmesg");
	if(checkmesg!=null){
%>
<script>
	alert("<%= checkmesg %>");
</script>
<%
//	request.removeAttribute(checkmesg);
	}
%>


<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		$.ajax({
			
		});//end ajax
	});//end ready
		
	
</script>


	
<div class="outer">
	<div class="inner">	

    	<form action="SendEmailpwServlet" method="post">
			<div class="card text-center" style="width: 18rem;">
			  <div class="card-body">
			  	<h5 class="card-title">비밀번호 찾기</h5>
			  	<div class="textbox">
				<!-- <label for="Member_code">아이디</label><br> -->
				<input type="text" name="Member_code" id="Member_code" placeholder="아이디">
				<!-- <div class="error">유효하지 않은 아이디 입니다</div> -->
				</div>
				<br>
				<div class="textbox">
					<!-- <label for="Member_email">이메일</label><br> -->
					<input type="text" name="Member_email1" id="Member_email1" placeholder="이메일"><br>
					<input type="text" name="Member_email2" placeholder="@">
					<!-- <div class="error">유효하지 않은 이메일 주소 입니다</div> -->
				</div><br>
			    
				
			    <input class="btn btn-primary" type="submit" value="비밀번호 찾기">
			    
			  </div>
			</div>
		</form>
	</div>
</div>
