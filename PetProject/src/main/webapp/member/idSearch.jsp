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
<form action="MemberIdSearchServlet" method="get">
<h1>아이디 찾기</h1>
  이름<input type="text" name="member_name"><br>
 휴대폰<select name="member_phone1">
       <option value="011">011</option>
       <option value="010">010</option>
     </select>-
      <input type="text" name="member_phone2">-
      <input type="text" name="member_phone3"><br>
이메일<input type="text"  name="member_email1">@
     <input type="text"  name="member_email2" id="member_email2" placeholder="직접 입력">
   <input type="submit" value="메일 보내기">  
</form>

