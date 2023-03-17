<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
        
<%
   String mesg = (String)request.getAttribute("mesg");
  if(mesg!=null){
%>    
   <script>
     alert('<%=mesg %>');
   </script>
<%
  }
%>    
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#submit").click(function() {
			
			$.ajax({
				url:"MemberIdSearchServlet",
				method : "post",
				dataType : "text",
				data : {
					name : $("#name").val(), phone1 : $("#phone1").val(), phone2 : $("#phone2").val(), phone3 : $("#phone3").val()
				},
				success : function(data, status, xhr) {
					$("#result").text(data);
				},
				error : function(xhr, status, error) {
					console.log(error);
				}
			});
			return false;
		});
	});
</script>
<form action="#" method="get">
<h1>아이디 찾기</h1>
  이름<input type="text" name="member_name" id="name"><br>
 휴대폰<select name="member_phone1" id="phone1">
       <option value="011">011</option>
       <option value="010">010</option>
     </select>-
      <input type="text" name="member_phone2" id="phone2">-
      <input type="text" name="member_phone3" id="phone3"><br>
      <span id="result"></span><br>
   <input type="submit" value="확인" id="submit">  
</form>

