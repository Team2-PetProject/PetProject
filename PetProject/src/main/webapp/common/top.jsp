<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.dto.MemberDTO" %>
<style type="text/css">
	  .title{
		float: left;
	} 
	.right-box{
		 float: right;
	} 
	
	a{
		text-decoration: none;
	}
	/*  .header-container{
		display: flex;
		justify-content: space-between;
		align-items: center;
		 height: 10rem; 
	}  */
</style>


	<div class="inner">
		<div class="hearder-container">
			  <!-- <div class="title"> -->
				<a href="#"><img><b class= "title">Kkosunnae</b></a>
			 <!-- </div>  -->
			<!-- title -->
			
			<div class="right-box">
				<button>채팅</button>&nbsp;
				<button>알림</button>&nbsp;
				<%
					MemberDTO dto = (MemberDTO) session.getAttribute("login");
					if(dto == null){
				%>
				<div class="btn-group" role="group">
					<button type="button" class="btn btn-primary dropdown-toggle"
						data-bs-toggle="dropdown" aria-expanded="false">회원</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="LoginUIServlet">로그인</a></li>
						<li><a class="dropdown-item" href="MemberUIServlet">회원가입</a></li>
					</ul>
				</div>
				<%
					} else{
				%>
					<div class="btn-group" role="group">
					<button type="button" class="btn btn-primary dropdown-toggle"
						data-bs-toggle="dropdown" aria-expanded="false">회원</button>
					<ul class="dropdown-menu">
						<li><a class="dropdown-item" href="LogoutServlet">로그아웃</a></li>
						<li><a class="dropdown-item" href="CartListServlet">장바구니</a></li>
					</ul>
				</div>	
				<% 
					}
				%>
			</div>
			
		</div>
		<!-- header-container -->
	</div>
   

