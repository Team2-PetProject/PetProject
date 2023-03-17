<%@page import="com.dto.OrderItemDTO"%>
<%@page import="com.dto.OrderInfoDTO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
 OrderInfoDTO oinfoDTO = (OrderInfoDTO)request.getAttribute("oinfoDTO");
 System.out.println("orderDone.jsp oinfoDTO " + oinfoDTO);
 
 OrderItemDTO oitemDTO = (OrderItemDTO)request.getAttribute("oitemDTO");
 System.out.println("orderDone.jsp oitemDTO " +oitemDTO);
	
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
.container{
	margin: 0  auto;
}


</style>
</head>
<body>
<h1>결제완료 화면 입니다.</h1>
<div class="container">
<table  width="80%">
	<tr>
		<td height="30">
	</tr>
	<tr>
		<td align="center"><b>주문이 <span>완료</span>되었습니다.</b></td>
	</tr>
	<tr>
		<td align="center">주문번호|**************</td>
	</tr>
	<tr>
		<td height="30">
	</tr>

</table>

<h3>상품정보</h3>
<table  width="80%">
	<tr>
		<td colspan="4">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>
	<tr>
		<td width="400" align="center"><strong>상품명</strong></td>
		<td width="100" align="center"><strong>판매가</strong></td>
		<td width="100" align="center"><strong>수량</strong></td>
		<td width="100" align="center"><strong>합계</strong></td>
	</tr>
	<tr>
		<td colspan="4">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>
	<tr>
		<td align="left">
			<span>다이어트 사료</span>
		</td>
		<td align="center">
			<span>33000</span>원
		</td>
		<td align="center">
			<span>5</span>
		</td>
		<td align="center">
			<span>165000</span>원
		</td>
	</tr>
	<tr>
		<td colspan="4">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>
	<tr>
		<td align="left" colspan="3">
			배송비
		</td>
		
		<td align="center">
			<span>0</span>원
		</td>
	</tr>
	<tr>
		<td align="left" colspan="3">
			총 결제금액
		</td>
		
		<td align="center">
			<span>165000</span>원
		</td>
	</tr>
	<tr>
		<td colspan="4">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>

</table>

<h3>결제정보</h3>
<table width="80%">
	<tr>
		<td colspan="2">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>
	<tr>
		<td>총 상품금액</td>
		<td></td>
	</tr>
	<tr>
		<td>총 배송비</td>
		<td></td>
	</tr>
	<tr>
		<td>최종 결제금액</td>
		<td></td>
	</tr>
	<tr>
		<td>결제수단</td>
		<td>카카오페이(결제일시)</td>
	</tr>
	<tr>
		<td colspan="2">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>

</table>



<h3>배송정보</h3>
<table width="80%">
	<tr>
		<td colspan="2">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>
	<tr>
		<td>받는분</td>
		<td></td>
	</tr>
	<tr>
		<td>연락처</td>
		<td></td>
	</tr>
	<tr>
		<td>주소</td>
		<td></td>
	</tr>
	<tr>
		<td colspan="2">
			<hr size="1" color="CCCCCC">
		</td>
	</tr>

</table>
</div>

<br>
<br>

<div>
<a>구매 내역</a> &nbsp;&nbsp;
<a>쇼핑 계속하기</a>
</div>





</body>
</html>