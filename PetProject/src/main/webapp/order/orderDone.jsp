<%@page import="com.dto.OrderItemDTO"%>
<%@page import="com.dto.OrderInfoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 OrderInfoDTO oinfoDTO = (OrderInfoDTO)request.getAttribute("oinfoDTO");
// System.out.println("orderDone.jsp oinfoDTO " + oinfoDTO);
 int OrderInfo_Code = oinfoDTO.getOrderInfo_Code();
 String Order_Name = oinfoDTO.getOrderInfo_OrderName();
 String OrderInfo_Post = oinfoDTO.getOrderInfo_Post();
 String OrderInfo_Addr1 = oinfoDTO.getOrderInfo_Addr1();
 String OrderInfo_Addr2 = oinfoDTO.getOrderInfo_Addr2();
 String OrderInfo_Phone = oinfoDTO.getOrderInfo_Phone();
 String OrderInfo_PayMethod = oinfoDTO.getOrderInfo_PayMethod();
 String OrderInfo_OrderDay = oinfoDTO.getOrderInfo_OrderDay();
 int OrderInfo_Delivery = oinfoDTO.getOrderInfo_Delivery();
 
 OrderItemDTO oitemDTO = (OrderItemDTO)request.getAttribute("oitemDTO");
// System.out.println("orderDone.jsp oitemDTO " +oitemDTO);
String Item_Code = oitemDTO.getItem_Code();
int Cart_Amount = oitemDTO.getCart_Amount();
int Item_Price = oitemDTO.getItem_Price();
String Item_Image = oitemDTO.getItem_Image();
String Item_Name = oitemDTO.getItem_Name();
String Cart_Size = oitemDTO.getCart_Size();
String Cart_Color = oitemDTO.getCart_Color();
String Cart_Taste = oitemDTO.getCart_Taste();
 
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.outer{
	display: flex;
}
.inner{
	margin: 0 auto;
}


</style>
</head>
<body>

<div class="outer">
	<div class="inner">
	<table  width="100%">
		<tr>
			<td height="30">
		</tr>
		<tr>
			<td align="center"><b>주문이 <span>완료</span>되었습니다.</b></td>
		</tr>
		<tr>
			<td align="center">주문번호 | <%= OrderInfo_Code %></td>
		</tr>
		<tr>
			<td height="30">
		</tr>
	
	</table>
	
	<h3>상품정보</h3>
	<table  width="100%">
		<tr>
			<td colspan="4">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td width="400" align="center" height="35"><strong>상품명</strong></td>
			<td width="100" align="center" height="35"><strong>판매가</strong></td>
			<td width="100" align="center" height="35"><strong>수량</strong></td>
			<td width="100" align="center" height="35"><strong>합계</strong></td>
		</tr>
		<tr>
			<td colspan="4">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td align="left" height="35">
				<span><%= Item_Name %></span>
			</td>
			<td align="center" height="35">
				<span><%= Item_Price %></span>원
			</td>
			<td align="center" height="35">
				<span><%= Cart_Amount %></span>
			</td>
			<td align="center" height="35">
				<span><%= Item_Price * Cart_Amount  %></span>원
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td align="left" colspan="3" height="35">
				배송비
			</td>
			
			<td align="center" height="35">
				<span><%= OrderInfo_Delivery %></span>원
			</td>
		</tr>
		<tr>
			<td align="left" colspan="3" height="35">
				총 결제금액
			</td>
			
			<td align="center" height="35">
				<span><%= (Item_Price * Cart_Amount) + OrderInfo_Delivery %></span>원
			</td>
		</tr>
		<tr>
			<td colspan="4">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
	
	</table>
	
	<h3>결제정보</h3>
	<table width="100%">
		<tr>
			<td colspan="2">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td height="35">총 상품금액</td>
			<td height="35"><span><%= Item_Price * Cart_Amount  %></span>원</td>
		</tr>
		<tr>
			<td height="35">총 배송비</td>
			<td height="35"><span><%= OrderInfo_Delivery %></span>원</td>
		</tr>
		<tr>
			<td height="35">최종 결제금액</td>
			<td height="35"><span><%= (Item_Price * Cart_Amount) + OrderInfo_Delivery %></span>원</td>
		</tr>
		<tr>
			<td height="35">결제수단</td>
			<td height="35"><%= OrderInfo_PayMethod %>  (<%=OrderInfo_OrderDay %>)</td>
		</tr>
		<tr>
			<td colspan="2">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
	
	</table>
	
	
	
	<h3>배송정보</h3>
	<table width="100%">
		<tr>
			<td colspan="2">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td height="35">받는분</td>
			<td height="35"><%= Order_Name %></td>
		</tr>
		<tr>
			<td height="35">연락처</td>
			<td height="35"> <%= OrderInfo_Phone.substring(0, 3) %>-<%= OrderInfo_Phone.substring(3, 7) %>-<%= OrderInfo_Phone.substring(7) %></td>
		</tr>
		<tr>
			<td height="35">주소</td>
			<td height="35">(<%= OrderInfo_Post %>)<%= OrderInfo_Addr1 %><br>
			<%= OrderInfo_Addr2 %></td>
		</tr>
		
		<tr>
			<td colspan="2">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
	
	</table>
	<br>
	<br>
	<div>
	<a>구매 내역</a> &nbsp;&nbsp;
	<a href="main">쇼핑 계속하기</a>
	</div>
	</div><!--inner  -->
</div><!-- outer  -->









</body>
</html>