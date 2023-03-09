<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.dto.CartDTO" %>
<%@ page import="java.util.List" %>
<style type="text/css">
	.card {
		width : 100px; height : 400px;

	}
	input {
		display : inline-block;
	}
</style>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
	$(function() {
		$("#allCheck").click(function() {
			var checked = this.checked;
			$(".check").each(function(idx, data) {
				this.checked = checked;
			});
			
		});
		$(".del").click(function() {
			var num = $(this).attr("data-num");
			location.href="CartDelServlet?num="+num;
		});
	});
</script>
<form action="#">
<input type="checkbox" id="allCheck"> 전체 선택
<button>선택 삭제</button>
	<%
		for(int i=0;i<4;i++){
	%>
	<fieldset>
		<div class="img" style = "float : left;">
			<input type="checkbox" class="check" id="check<%=i%>" name="<%=i%>">
			<img src="images/items/dish1.png" alt="" width=100px height = 100px>
		</div>
		<div style = "float : left;">
			<h2>상품 제목</h2>
			<p>상품 설명 및 가격
			<input type="button" value="삭제" data-num="<%=i%>" class="del"/>
		</div>
	</fieldset>
	<%
		}
	%>
</form>