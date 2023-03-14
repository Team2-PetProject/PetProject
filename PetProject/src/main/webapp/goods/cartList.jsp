<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.dto.CartInfoDTO" %>
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
			var num = $(this).attr("data-code");
			location.href="CartDelServlet?num="+num;
		});
		$(".update").click(function() {
			var num = $(this).attr("data-num");
			var amount = $("#Amount" + num).val();
		/* $(".update").click(function() {
			var itemCode = $(this).attr("data-code");
			var amount = $("#Amount" + itemCode).val();
			var price = $("#price" + itemCode).text();
			console.log(amount + "/" + price);
			$.ajax({
				type:"post",
				url : "CartUpdateServlet",
				data : {num : itemCode, amount : amount},
				dataType : "text",
				success : function(data, status, xhr) {
					
					$("#total" + itemCode).text(amount*price);
				},
				error : function(xhr, status, error) {
					console.log(error)
				}
			});
		});
		}); */
		$("#allDel").click(function() {
			var n = $("input:checkbox:checked").length;
			if(n==0){
			var amount_box = $("#Amount" + num);
			var amount = Number.parseInt(amount_box.attr("value"));
			amount_box.attr("value", ++amount);
			
			updateAmount(num);
		});
		$(".down").click(function() {
			event.preventDefault();
			if(amount >1){
				amount_box.attr("value", --amount);
			}
			updateAmount(num);
		});
		$("#order").click(function() {
			$("#myForm").attr("action", "#");
			var key = this.id;
			var value = this.value;
			location.href="CartUpdateOptServlet?cartCode="+cartCode + "&key="+key+"&value="+value;
			/* $.ajax({
				type:"post",
				url : "CartUpdateOptServlet",
				data : {cartCode : cartCode,key :key, value : value},
				dataType : "text",
				success : function(data, status, xhr) {
					
				},
				error : function(xhr, status, error) {
					console.log(error)
				}
			}); */
		});
	});
	function updateAmount(itemCode) {
		var amount = $("#Amount" + itemCode).val();
		var price = $("#price" + itemCode).text();
		console.log(amount + "/" + price);
		$.ajax({
			type:"post",
			url : "CartUpdateServlet",
			data : {num : itemCode, amount : amount},
			dataType : "text",
			success : function(data, status, xhr) {
				$("#total" + itemCode).text(amount*price);
			},
			error : function(xhr, status, error) {
				console.log(error)
			}
		});
	}
</script>
<h1>장바구니</h1>
<form action="#" id="myForm">
<input type="checkbox" id="allCheck"> 전체 선택
<input type="button" value="선택삭제" id="allDel"/>
	<%
	List<CartInfoDTO> list = (List<CartInfoDTO>) request.getAttribute("cartList");
	int sum =0;
			for(int i=0;i<list.size();i++){
		CartInfoDTO dto = list.get(i);
		int cartCode = dto.getCart_Code();
		String memberCode = dto.getMember_Code();
		String cartAmount = dto.getCart_Amount();
		int cartAmount = Integer.parseInt(dto.getCart_Amount());
		String itemSize = dto.getItem_Size();
		String itemColor = dto.getItem_Color();
		String itemTaste = dto.getItem_Taste();
		String cartColor = dto.getCart_Color();
		String cartTaste = dto.getCart_Taste();
		String itemImage = dto.getItem_Image();
		int totalPrice = itemPrice * cartAmount;
		sum += totalPrice;
	%>
	<fieldset>
		<div class="img" style = "float : left;">
			수량 <button class="up" data-num="<%=cartCode%>">+</button> 
			<input type="text" class="Amount" id="Amount<%=cartCode%>" name = "Amount" value = "<%=cartAmount%>"> 
			<button class="down" data-num="<%=cartCode%>">-</button>
			<input type="button" value="변경" data-num="<%=memberCode%>" data-code = <%=cartCode%> class="update"/>
			<%-- <input type="button" value="변경" data-code = <%=cartCode%> class="update"/> --%>
			<input type="button" value="삭제" data-code="<%=cartCode%>" class="del"/>
			가격 <span id="price<%=cartCode%>"><%=itemPrice%></span>
			총가격 <span id="total<%=cartCode%>"><%=totalPrice%></span>
		</div>
	</fieldset>
	<%
		}
	%>
	<b>결제정보</b>
	<table border ='1'>
		<tr>
			<td>주문금액 <%=sum%></td> 
			<td>결제금액 <%=sum%></td>
		</tr>
	</table>
	<input type="button" value="주문하기" id="order"/>
</form>