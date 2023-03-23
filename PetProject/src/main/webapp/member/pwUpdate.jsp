<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<% 
	String resultNum = (String)request.getAttribute("resultNum");
	System.out.println("pwUpdate.jsp "+ resultNum);
%>

<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
$(document).ready(function(){
	$("#check").on("click",function(){
		if($("#authenticationKey").val()!=<%= resultNum %>){
			alert("유효하지 않은 인증번호 입니다.");
			$("#authenticationKey").focus();
			return false;
		}
	});// 인증번호 확인
	
	$("#pwCheck").on("keyup",function(){
		var mesg = "비밀번호 불일치";
		if($("#pwCheck").val()==$("#pw").val()){
			mesg = "비밀번호 일치";
		}
		$("#sameCheck").text(mesg);
	});//비번 일치여부 확인
	
})//end ready

</script>

<h1>비밀번호 변경</h1>
인증번호 : <input type="text" value="인증번호를 입력하세요" id="authenticationKey"><button id="check">확인</button><br>
새 비밀번호 : <input type="text" value="비밀번호를 입력하세요" id="pw"><br>
비밀번호 확인 : <input type="text" value="비밀번호를 다시 입력하세요" id="pwCheck"><span id="sameCheck"></span><br>
<a href="LoginUIServlet"></a>