<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

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


	<h1>비밀번호 찾기</h1>
	<form action="SendEmailpwServlet" method="post">
		아이디 : <input type="text" name="Member_code"><br>
		이메일 : <input type="text" name="Member_email1">@<input type="text" name="Member_email2"><br>
		<button type="submit">비밀번호 찾기</button>
	</form>
