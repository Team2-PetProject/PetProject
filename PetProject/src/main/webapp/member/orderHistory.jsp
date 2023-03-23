<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@page import="com.dto.*"%>
<%@page import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<%
List<OrderHistoryDTO> list = (List<OrderHistoryDTO>) request.getAttribute("OrderHistory");
%>
<title>Insert title here</title>
<script type="text/javascript"
	src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	Today = dateFormat(new Date());
	Yesterday = getYesterday();
	LastWeek = getLastWeek();
	TwoAgoWeek = getTwoAgoWeek();
	LastMonth = getLastMonth();
	SixAgoMonth = getSixAgoMonth();
	LastYear = getLastYear();
		
	
	/* day 를 지역변수를 두면 day를 두고 두고 변경해 나간다. 그러면 계속 new Date를 해줘야한다.
	그러면 길어 보이니 그냥 매번 new Date하자
	*/
	/* console.log(today) //20230317
	console.log(yesterday) //20230316
	console.log(lastweek) //20230310
	console.log(lastmonth) //20230217
	console.log(sixagomonth) //20220917
	console.log(lastyear); //20220317 */
	
	showWindowSearch();
	$("form").on("submit", setDate);
})
function dateFormat(e) { 
	var day=e;
	return day.getFullYear()+((day.getMonth()+1)>9? (day.getMonth()+1).toString():"0"+(day.getMonth()+1))
	+(day.getDate()>9? day.getDate().toString():"0"+day.getDate().toString());
	//3항 연산자를 이용해서 1~9면 0을 붙여서 날짜 계산을 하게 해준다.
	
}

function getYesterday() {
	   var day = new Date();
	   day.setDate(day.getDate() - 1);
	   return dateFormat(day);  
	}

function getLastWeek() {
	var day = new Date();
	day.setDate(day.getDate() - 7);
	 return dateFormat(day);
}

function getTwoAgoWeek() {
	var day = new Date();
	day.setDate(day.getDate() - 14);
	return dateFormat(day);  
}

function getLastMonth() {
	var day = new Date();
	day.setMonth(day.getMonth() - 1);
	return dateFormat(day);  
}

function getSixAgoMonth() {
	var day = new Date();
	day.setMonth(day.getMonth() - 6);
	return dateFormat(day);  
}

function getLastYear() {
	var day = new Date();
	day.setFullYear(day.getFullYear() - 1);
	return dateFormat(day);  
	}

function setDate(fromDate, toDate) {
	var item_name = $("#itemSearch").val();
	console.log($("#itemSearch").val());
	if (toDate == null) {
		var fromYear = $("#from_year").val();
		var fromMonth = $("#from_month").val();
		var fromDay = $("#from_day").val();
		var startDay = fromYear + fromMonth + fromDay
		
		var toYear = $("#to_year").val();
		var toMonth = $("#to_month").val();
		var toDay = $("#to_day").val();
		var endDay = toYear + toMonth + toDay
		
	/* 	console.log("item_name==null fromYear" + fromYear)
		console.log("item_name==null fromMonth" + fromMonth)
		console.log("item_name==null fromDay" + fromDay)
		console.log("item_name==null toYear" + toYear)
		console.log("item_name==null toMonth" + toMonth)
		console.log("item_name==null toDay" + toDay)
		console.log("item_name==null startDay" + startDay)
		console.log("item_name==null startDay" + endDay)
		console.log("item_name==null item_name" + item_name)  */
		
		$("#orderInfo").append("<input type='hidden' name='startDay' value = " + startDay + ">");
		
		$("#orderInfo").append("<input type='hidden' name='endDay' value = " + endDay + ">");
		
		
	
 	} else {
		var startDay = fromDate;
		var endDay = toDate;
		console.log("startDay!=null" + startDay)
		console.log("endDay!=null" + endDay)
		location.href = "../OrderSearchServlet?startDay=" + startDay + "&endDay=" + endDay;
	}
 	
 	
}


	function showWindowSearch() { // 연도 추가하는 함수 
		
 		var schedule = Today.substring(4, 8)
		//var schedule = "0323"; 
		var nowYear = Today.substring(0, 4)  
		/*substring 바로 +1 하면문자열취급  */
		var newYear = parseInt(nowYear)+1
		
		
		
	
		
		if (schedule==1231) {
		const targetDate = new Date(newYear + '-01-01')
		const now = new Date();
		const showTime = targetDate.getTime() - now.getTime();
		setTimeout(subYear, showTime);	
		} 
/* 		if (schedule!="0322") { //테스트용
			console.log(schedule); // 0323
			const targetDate = new Date(newYear + '-03-23')
			console.log("targetDate: " + targetDate)
			//targetDate: Sat Mar 23 2024 09:00:00 GMT+0900 (한국 표준시)
			const now = new Date();
			//const showTime = targetDate.getTime() - now.getTime();
			const showTime = 1000;
			
			console.log("showTime : " + showTime)
			//showTime : 31582313263
			//showTime : 31581916858
			setTimeout(subYear, showTime);	
		} */
	}  
	

	function subYear() { //셀렉문에 년도 추가하는 함수 
		
		const newYear = parseInt(Today.substring(0, 4))+1
		

	 	
		$("#from_year").append(" <option value= '"+ newYear + "'>" + newYear + "</option>");
		//이방식은 내가 평상시 사용하는 코드 잘 추가가 됨
		
		//$("#to_year").append(`<option value="${newYear}">${newYear}</option>`);
		//이게 되야하는데 안됨
		
	 	$("#to_year").append($('<option>',
			{
			value : newYear,
			text : newYear
			
			}	
			));   
		
		//이방법은 jquery 사용하니 별로 추천을 못함 그런데 기존 방식도 제이쿼리이다.
		//key는 안되고 text로 해야함.
	
		//리터럴 이용 방식 이때는 탭 위에있는 백틱키를 사용한다. 그래야 리터럴안에 값을 인식해준다. 아니면
		// ${newYear} 이렇게 출력된다.
		//인덱트는 가능한 적게 사용하는 것이 좋다. 그러면 인덴트는 무엇인가? 인덱트는 인덱스다. 
		//현재 안먹힘. 공백이 먹힘 // 배틱이 제일 최신 방법임. node.js 사용
	}
	
</script>
</head>
<body>
	<h1 id="search1">주문/배송</h1>
	<h1 id="search2">조회</h1>
	<form action="../OrderSearchServlet" id="orderInfo" method="get">
	<!--  -->
		<table border="1">
			<tr>
				<td rowspan="3">조회기간</td>
				<td colspan="10">
				
				<input type="button" onclick="setDate(yesterday,today)" value="하루"> 
				<input type="button" class="dayBtn" onclick="setDate(lastweek,today)"value="1주일"> 
				<input type="button" class="dayBtn" onclick="setDate(twoagoweek,today)"value="2주일"> 
				<input type="button" class="dayBtn" onclick="setDate(lastmonth,today)" value="1개월"> 
				<input type="button" class="dayBtn" onclick="setDate(sixagomonth,today)" value="6개월">
				<input type="button" class="dayBtn" onclick="setDate(lastyear,today)" value="1년"></td>
			</tr>
			<tr>
				<td colspan="10">
					<!--연선택  --> 
					<select  id="from_year">
						<option value="2020">2020</option>
						<option value="2021">2021</option>
						<option value="2022">2022</option>
						<option value="2023" selected="selected">2023</option>
						<!--Today 가지고와서 자동 지정.  -->
				</select>년 
				<!--달선택  --> 
				<select  id="from_month">
						<option value="01">1</option>
						<option value="02">2</option>
						<option value="03">3</option>
						<option value="04">4</option>
						<option value="05">5</option>
						<option value="06">6</option>
						<option value="07">7</option>
						<option value="08">8</option>
						<option value="09">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
				</select>월 
				<!--날 선택  --> 
				<select  id="from_day">
						<option value="01">1</option>
						<option value="02">2</option>
						<option value="03">3</option>
						<option value="04">4</option>
						<option value="05">5</option>
						<option value="06">6</option>
						<option value="07">7</option>
						<option value="08">8</option>
						<option value="09">9</option>
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
				</select>일 ~ 
				
				<!--연선택  --> 
				<select  id="to_year">
						<option value="2020">2020</option>
						<option value="2021">2021</option>
						<option value="2022">2022</option>
						<option value="2023" selected="selected">2023</option>
				</select>년 <!--달선택  --> 
				<select  id="to_month">
						<option value="01">1</option>
						<option value="02">2</option>
						<option value="03">3</option>
						<option value="04">4</option>
						<option value="05">5</option>
						<option value="06">6</option>
						<option value="07">7</option>
						<option value="08">8</option>
						<option value="09">9</option>
						<option value="10">10</option>
						<option value="11">11</option>
						<option value="12">12</option>
				</select>월 <!--날선택  --> 
				<select  id="to_day">
						<option value="01">1</option>
						<option value="02">2</option>
						<option value="03">3</option>
						<option value="04">4</option>
						<option value="05">5</option>
						<option value="06">6</option>
						<option value="07">7</option>
						<option value="08">8</option>
						<option value="09">9</option>
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
				<td colspan="10">
				<input type="text" name="itemName" id="itemSearch" placeholder="주문 상품을 검색하세요." size="40"> 
				<input type="submit" value="조회하기"></td>
			</tr>
		</table>
	</form>
	<!--주문내역 리스트 시작  -->
	<h5>주문내역</h5>
	<table border="1">
		<tr>
			<td>주문일자
			</td>
			<td>주문문상품정보
			</td>
			<td>상품금액
			</td>
			<td>배송비
			</td>
			<td>주문상태
			</td>
		</tr>
		<!-- 반복문 시작  -->
		<tr>
			<td>주문일자,상품번호,상세보기화면 넘기기
			</td>
			<td>이미지,상품이름,
			</td>
			<td>상품총금액,상품수량
			</td>
			<td>배송비
			</td>
			<td>주문상태(배송중),(배송완료)
			</td>
		</tr>
		<!--반복문 끝 -->
	</table>
	<hr>
	<input type="button" value="연도추가" onclick="subYear()">
</body>
</html>