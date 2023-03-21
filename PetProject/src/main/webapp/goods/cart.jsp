<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="com.dto.CartInfoDTO" %>
<%@ page import="java.util.List" %>
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
		$("input:checkbox").click(function() {
			var arr = $(".check:checked");
			if(arr.length ==0){
				$("#OrderPrice").text(0);
				$("#DeliverPrice").text(0);
				$("#Price").text(0);
			}else{
				var sum = 0;
				var sum_deliver = 0;
				arr.each(function(idx, data) {
					var cartCode = $(this).val();
					var amount = $("#Amount" + cartCode).val();
					var price = $("#price" + cartCode).text();
					sum += amount*price;
				});
				$("#OrderPrice").text(sum);
				if(sum < 50000){
					sum_deliver = 3000;
				}
				$("#DeliverPrice").text(sum_deliver);
				$("#Price").text(sum+sum_deliver);
			}
			
		});
		$("#allDel").click(function() {
			var n = $("input:checkbox:checked").length;
			if(n==0){
				alert('삭제할 상품을 선택하세요');
			}else{
				$("#myForm").attr("action", "CartDelAllServlet");
				$("#myForm").submit();
			}
			
		});
		$("#order").click(function() {
			var n = $("input:checkbox:checked").length;
			if(n==0){
				alert('주문할 상품을 선택하세요');
			}else{
				$("#myForm").attr("action", "OrderAllServlet");
				$("#myForm").submit();
			}
			
		});
		$(".up").click(function() {
			event.preventDefault();
			var num = $(this).attr("data-num");
			var amount_box = $("#Amount" + num);
			var amount = Number.parseInt(amount_box.attr("value"));
			amount_box.attr("value", ++amount);
			updateAmount(num);
		});
		$(".down").click(function() {
			event.preventDefault();
			var num = $(this).attr("data-num");
			var amount_box = $("#Amount" + num);
			var amount = Number.parseInt(amount_box.attr("value"));
			if(amount >1){
				amount_box.attr("value", --amount);
			}
			updateAmount(num);
		});
		$(".option").change(function() {
			var cartCode = $(this).attr("data-code");
			var key = this.id;
			var value = this.value;
			$.ajax({
				type:"post",
				url : "CartUpdateOptServlet",
				data : {cartCode : cartCode, key : key, value : value},
				dataType : "text",
				success : function(data, status, xhr) {
					
				},
				error : function(xhr, status, error) {
					console.log(error)
				}
			});
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
<form id="myForm">
<input type="checkbox" id="allCheck"> 전체 선택
<input type="button" value="선택삭제" id="allDel"/>
	
	<%
	List<CartInfoDTO> list = (List<CartInfoDTO>) request.getAttribute("cartList");
	//String[] arr = {"cartSize", "cartColor", "cartTaste"};
	int sum =0;
			for(int i=0;i<list.size();i++){
		CartInfoDTO dto = list.get(i);
		int cartCode = dto.getCart_Code();
		String memberCode = dto.getMember_Code();
		int cartAmount = Integer.parseInt(dto.getCart_Amount());
		String itemSize = dto.getItem_Size();
		String itemColor = dto.getItem_Color();
		String itemTaste = dto.getItem_Taste();
		String itemCode = dto.getItem_Code();
		String itemCategory = dto.getItem_Category();
		String itemName = dto.getItem_Name();
		String itemInfo = dto.getItem_Info();
		int itemPrice = dto.getItem_Price();
		String cartSize = dto.getCart_Size();
		String cartColor = dto.getCart_Color();
		String cartTaste = dto.getCart_Taste();
		String itemImage = dto.getItem_Image();
		int totalPrice = itemPrice * cartAmount;
		sum += totalPrice;
	%>
	<div class="row shadow p-3 mb-5 bg-body rounded m-5 ">
		<div class="col-md-1 form-check">
			<input class="form-check-input check" type="checkbox" 
			id="check<%=memberCode%>" name = "check" value="<%=cartCode%>" style="vertical-align: middle"> 
			<img src="images/기존items/<%=itemImage%>.png" class="rounded float-start" alt="..." width = "100px" height="100px">
		</div>
		<div class="col-md-5">
			<h5><%=itemName%></h5>
			<p><%=itemInfo%></p>
			<%if(cartSize!=null||cartColor!=null||cartTaste!=null){ %>
			옵션	
			<%} %>		
			<%if(cartSize != null){ %>
			<select name="optionSize" class="option" id="size" data-code=<%=cartCode%>>
			<%
				
					String[] arr = itemSize.split("/");
				
					for(int j=0;j<arr.length;j++){
			%>
							<option value="<%=arr[j]%>" <%if(cartSize.equals(arr[j])){%>selected<%} %>><%=arr[j]%></option>
						
			<%
					}
			%>
			</select>
			<%
				}
			%>
			<%if(cartColor != null){ %>
			<select name="optionColor" class="option" id="color" data-code=<%=cartCode%>>
			<%
				
					String[] arr = itemColor.split("/");
					for(int j=0;j<arr.length;j++){
			%>
							<option value="<%=arr[j]%>" <%if(cartColor.equals(arr[j])){%>selected<%} %>><%=arr[j]%></option>
						
			<%
					}
			%>
			</select>
			<%
				}
			%>
			<%if(cartTaste != null){ %>
			<select name="optionTaste" class="option" id="taste" data-code=<%=cartCode%>>
			<%
				
					String[] arr = itemTaste.split("/");
					for(int j=0;j<arr.length;j++){
			%>
							<option value="<%=arr[j]%>" <%if(cartTaste.equals(arr[j])){%>selected<%} %>><%=arr[j]%></option>
						
			<%
					}
			%>
			</select>
			<%
				}
			%>
		</div>
		<div class="col-md-1 align-self-center align-top">
			<%=itemCategory%>
		</div>
		<div class="col-md-2 align-self-center">
			<div class="input-group input-group-sm mb-3">
				<button class="btn btn-outline-secondary up" data-num="<%=cartCode%>" type="button">+</button>
				<input type="text" class="form-control Amount" placeholder=""
					aria-label="Example text with two button addons"
					id="Amount<%=cartCode%>" name = "Amount" value = "<%=cartAmount%>">
				<button class="btn btn-outline-secondary down" data-num="<%=cartCode%>" type="button">-</button>
			</div>
		</div>
		<div class="col-md-2 align-self-center d-flex justify-content-center">
			가격<span id="price<%=cartCode%>"><%=itemPrice%></span>&nbsp;
			총가격 <span id="total<%=cartCode%>"><%=totalPrice%></span>
		</div>
		<div class="col-md-1 align-self-center d-flex justify-content-end">
			<button type="button" class="btn-close del" aria-label="Close" data-code="<%=cartCode%>" ></button>
		</div>
	</div>
	<%
		}
	%>
	<b>결제정보</b>
	<div class="m-5 ">
		<table class="table table-bordered shadow p-3 mb-5 bg-body rounded" >
		<tr>
			<td>주문금액 <span id="OrderPrice">0</span>원</td> 
			<td rowspan='2' class="align-middle">결제금액 <span id="Price">0</span>원</td>
		</tr>
		<tr>
			<td>배달비 <span id="DeliverPrice">0</span>원</td>
		</tr>
	</table>
	</div>
	
	<input type="button" value="주문하기" id="order"/>
</form>