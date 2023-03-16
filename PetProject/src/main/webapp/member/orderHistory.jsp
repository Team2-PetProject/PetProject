<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@page import="com.dto.*" %>
    <%@page import="java.util.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%List<OrderHistoryDTO>list=(List<OrderHistoryDTO>)request.getAttribute("OrderHistory");
%>
<title>Insert title here</title>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">
$(document).ready(function(){
	/* 오늘날짜 */
	var day=new Date();
	var today=dateFormat(day);
	var yesterDay=today-1
	var lastMonth=today-30
	var sixMonthsAgo=today-180
	var lastYear=today-365

	
	
	
})
function dateFormat(day) {
	return day.getFullYear()+((day.getMonth()+1)>9? (day.getMonth()+1).toString():"0"+(day.getMonth()+1))
	+(day.getDate()>9? day.getDate().toString():"0"+day.getDate().toString());
	//3항 연산자를 이용해서 1~9면 0을 붙여서 날짜 계산을 하게 해준다.
	
}
</script>
</head>
<body>
<h1 id="search1">주문/배송</h1><h1 id="search2">조회</h1>
<form action="OrderSearchServlet">
<table border="1">
<tr>
<td rowspan="3"> 조회기간 </td>
<td colspan="10"><input type="button" onclick="setDate('today','today')" value="오늘">
<input type="button" class="dayBtn" onclick="setDate(,dateFormat())" value="1주일">
<input type="button" class="dayBtn" onclick="setDate(,dateFormat())" value="1개월">
<input type="button" class="dayBtn" onclick="setDate(,dateFormat())" value="6개월">
<input type="button" class="dayBtn" onclick="setDate(,dateFormat())" value="1년">
</td>
</tr>
<tr>
<td colspan="10"> 
<!--연선택  -->
<select name="year1">
<option value="2020">2020</option>
<option value="2021">2021</option>
<option value="2022">2022</option>
<option value="2023" selected="selected">2023</option>
</select>년
<!--달선택  -->
<select name="month1">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
</select>월
<!--날 선택  -->
<select name="day1">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select>일

~
<!--연선택  -->
<select name="year2">
<option value="2020">2020</option>
<option value="2021">2021</option>
<option value="2022">2022</option>
<option value="2023" selected="selected">2023</option>
</select>년

<!--달선택  -->
<select name="month2">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
</select>월

<!--날선택  -->
<select name="day2">
<option value="1">1</option>
<option value="2">2</option>
<option value="3">3</option>
<option value="4">4</option>
<option value="5">5</option>
<option value="6">6</option>
<option value="7">7</option>
<option value="8">8</option>
<option value="9">9</option>
<option value="10">10</option>
<option value="11">11</option>
<option value="12">12</option>
<option value="13">13</option>
<option value="14">14</option>
<option value="15">15</option>
<option value="16">16</option>
<option value="17">17</option>
<option value="18">18</option>
<option value="19">19</option>
<option value="20">20</option>
<option value="21">21</option>
<option value="22">22</option>
<option value="23">23</option>
<option value="24">24</option>
<option value="25">25</option>
<option value="26">26</option>
<option value="27">27</option>
<option value="28">28</option>
<option value="29">29</option>
<option value="30">30</option>
<option value="31">31</option>
</select>일
</td>
</tr>
<!--상품조회  -->
<tr>
<td colspan="10"> <input type="text" id="item_name" value="주문 상품을 검색하세요.">
<input type="button" id="item_name" name="item_name" value="조회하기"></td>
</tr>
</table>
</form>
<!--주문내역 리스트 시작  -->
<h5>주문내역</h5>
<table border="1">
<tr>
<td>주문일자<td>
<td>주문문상품정보<td>
<td>상품금액<td>
<td>배송비<td>
<td>주문상태<td>
</tr>
<!-- 반복문 시작  -->
<tr>
<td>주문일자,상품번호,상세보기화면 넘기기<td>
<td>이미지,상품이름,<td>
<td>상품총금액,상품수량<td>
<td>배송비<td>
<td>주문상태(배송중),(배송완료)<td>
</tr>
<!--반복문 끝 -->
</table>
</body>
</html>