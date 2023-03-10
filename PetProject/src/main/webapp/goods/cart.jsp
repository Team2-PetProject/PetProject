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
			$.ajax({
				type:"get",
				url : "CartDelServlet",
				data : {num : num},
				dataType : "text",
				success : function(data, status, xhr) {
					
				},
				error : function(xhr, status, error) {
					console.log(error)
				}
			});
		});
		$("#allDel").click(function() {
			$("#myForm").attr("action", "CartDelAllServlet");
			$("#myForm").submit();
		});
		$("#order").click(function() {
			$("#myForm").attr("action", "#");	//구매화면
			$("#myForm").submit();
		});
		$(".up").click(function() {
			event.preventDefault();
			var num = $(this).attr("data-num");
			var amount_box = $("#Amount" + num);
			var amount = Number.parseInt(amount_box.attr("value"));
			amount_box.attr("value", ++amount);
			
		});
		$(".down").click(function() {
			event.preventDefault();
			var num = $(this).attr("data-num");
			var amount_box = $("#Amount" + num);
			var amount = Number.parseInt(amount_box.attr("value"));
			if(amount >1){
				amount_box.attr("value", --amount);
			}
		});
	});
</script>
<form action="#" id="myForm">
<input type="checkbox" id="allCheck"> 전체 선택
<input type="button" value="선택삭제" id="allDel"/>
	<%
		for(int i=0;i<4;i++){
	%>
	<fieldset>
		<div class="img" style = "float : left;">
			<input type="checkbox" class="check" id="check<%=i%>" name = "check" value="<%=i%>">
			<img src="images/items/dish1.png" alt="" width=100px height = 100px>
		</div>
		<div style = "float : left;">
			<h2>상품 제목</h2>
			<p>상품 설명 및 가격
			수량 <button class="up" data-num="<%=i%>">+</button> 
			<input type="text" class="Amount" id="Amount<%=i%>" name = "Amount" value = "1" > 
			<button class="down" data-num="<%=i%>">-</button>
			<input type="button" value="삭제" data-num="<%=i%>" class="del"/>
		</div>
	</fieldset>
	<%
		}
	%>
	<input type="button" value="주문하기" id="order"/>
</form>