<%@page import="java.util.List"%>
<%@page import="com.dto.CartInfoDTO"%>
<%@page import="org.eclipse.jdt.internal.compiler.parser.ParserBasicInformation"%>

<%@page import="com.dto.MemberDTO"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		
		//유효성 검사
		$("form").on("submit",function(){
			var mname = $("#mname").val();
			var mpost = $("#mpost").val();
			var maddress1 = $("#maddress1").val();
			var maddress2 = $("#maddress2").val();
			var mphone1 = $("#mphone1").val();
			var mphone2 = $("#mphone2").val();
			var mphone3 = $("#mphone3").val();
			var memail = $("#memail").val();
			var orderName = $("#orderName").val();
			var sample4_postcode = $("#sample4_postcode").val();
			var sample4_roadAddress = $("#sample4_roadAddress").val();
			var sample4_jibunAddress = $("#sample4_jibunAddress").val();
			var phone1 = $("#phone1").val();
			var phone2 = $("#phone2").val();
			var phone3 = $("#phone3").val();
			
			
			if(mname.length==0){
				alert("필수 입력 항목");
				$("#mname").focus();
				return false;
			}
			if(mpost.length==0){
				alert("필수 입력 항목");
				$("#mpost").focus();
				return false;
			}
			if(maddress1.length==0){
				alert("필수 입력 항목");
				$("#maddress1").focus();
				return false;
			}
			if(maddress2.length==0){
				alert("필수 입력 항목");
				$("#maddress2").focus();
				return false;
			}
			if(mphone1.length==0){
				alert("필수 입력 항목");
				$("#mphone1").focus();
				return false;
			}
			if(mphone2.length==0){
				alert("필수 입력 항목");
				$("#mphone2").focus();
				return false;
			}
			if(mphone3.length==0){
				alert("필수 입력 항목");
				$("#mphone3").focus();
				return false;
			}
			if(memail.length==0){
				alert("필수 입력 항목");
				$("#memail").focus();
				return false;
			}
			if(orderName.length==0){
				alert("필수 입력 항목");
				$("#orderName").focus();
				return false;
			}
			if(sample4_postcode.length==0){
				alert("필수 입력 항목");
				$("#sample4_postcode").focus();
				return false;
			}
			if(sample4_roadAddress.length==0){
				alert("필수 입력 항목");
				$("#sample4_roadAddress").focus();
				return false;
			}
			if(sample4_jibunAddress.length==0){
				alert("필수 입력 항목");
				$("#sample4_jibunAddress").focus();
				return false;
			}
			if(phone1.length==0){
				alert("필수 입력 항목");
				$("#phone1").focus();
				return false;
			}
			if(phone2.length==0){
				alert("필수 입력 항목");
				$("#phone2").focus();
				return false;
			}
			if(phone3.length==0){
				alert("필수 입력 항목");
				$("#phone3").focus();
				return false;
			}
			
			
			$("#phone").val($("#phone1").val()+$("#phone2").val()+$("#phone3").val());
			console.log($("#phone").val());
			
		});//end form
		
		
		
		//주문정보와 동일 여부
		$("#same").on("click",function(){
			if(this.checked){
				$("#orderName").val($("#mname").val());
				$("#sample4_postcode").val($("#mpost").val());
				$("#sample4_roadAddress").val($("#maddress1").val());
				$("#sample4_jibunAddress").val($("#maddress2").val());
				$("#phone1").val($("#mphone1").val());
				$("#phone2").val($("#mphone2").val());
				$("#phone3").val($("#mphone3").val());
			}else{
				$("#orderName").val("");
				$("#sample4_postcode").val("");
				$("#sample4_roadAddress").val("");
				$("#sample4_jibunAddress").val("");
				$("#phone1").val("");
				$("#phone2").val("");
				$("#phone3").val("");
			}
			
		});//end same
		
		
		
		
		
	});//end ready
</script>

<h1>주문결제</h1>
<%
MemberDTO mDTO = (MemberDTO)request.getAttribute("mDTO");
String m_code = mDTO.getMember_code();
String m_name = mDTO.getMember_name();
String m_post = mDTO.getMember_post();
String m_addr1= mDTO.getMember_addr1();
String m_addr2= mDTO.getMember_addr2();
String m_phone1= mDTO.getMember_phone1();
String m_phone2= mDTO.getMember_phone2();
String m_phone3= mDTO.getMember_phone3();
String m_email1= mDTO.getMember_email1();
String m_email2= mDTO.getMember_email2();
%>
<form name="myForm" method="post" action="OrderAllDoneServlet">

	<h3>주문상품 정보</h3>

	<table width="90%" cellspacing="0" cellpadding="0">
		<tr>
			<td colspan="6">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td class="td_default" align="center"><strong>주문번호</strong></td>
			<td class="td_default" align="center" colspan="2"><strong>상품정보</strong></td>
			<td class="td_default" align="center"><strong>판매가</strong></td>
			<td class="td_default" align="center" colspan="2"><strong>수량</strong></td>

		</tr>
		
		<tr>
			<td colspan="6">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
<%
	List<CartInfoDTO> list = (List<CartInfoDTO>) request.getAttribute("cinfoList");
	int sum =0;
	for(int i=0;i<list.size();i++){
	
		CartInfoDTO cDTO = list.get(i);
		int Cart_Code = cDTO.getCart_Code();
		String Member_Code = cDTO.getMember_Code();
		int Cart_Amount =  Integer.parseInt(cDTO.getCart_Amount()) ;
		String Cart_Size = cDTO.getCart_Size();
		String Cart_Color = cDTO.getCart_Color();
		String Cart_Taste = cDTO.getCart_Taste();
		String Item_Code = cDTO.getItem_Code();
		String Item_Name = cDTO.getItem_Name();
		String Item_Info = cDTO.getItem_Info();
		int Item_Price = cDTO.getItem_Price();
		String Item_Image = cDTO.getItem_Image();
		sum += Item_Price * Cart_Amount;
%>
		
		<tr>
			<td class="td_default" width="80"><%= Cart_Code %></td>
			<td class="td_default" width="80"><img
				src="images/items/<%= Item_Image %>.png" border="0" align="center" width="80" height = "100"/></td>
			<td class="td_default" width="300" style='padding-left: 30px'><%= Item_Name %>
				<br> <font size="2" color="#665b5f">[옵션 : 옵션1(<%= Cart_Size %>) , 옵션2(<%=Cart_Color %>), 옵션3(<%=Cart_Taste %>)] </font>
			</td>
			<td class="td_default" align="center" width="110"><%= Item_Price %></td>
			<td class="td_default" align="center" width="90"><%= Cart_Amount %></td>

		</tr>
		
		<tr>
			<td colspan="6">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
	<input type="hidden" name="Member_Code" value="<%= Member_Code%>"><!-- 테스트용 -->
	<input type="hidden" name="Item_Code" value="<%= Item_Code%>">
	<input type="hidden" name="Item_Name" value="<%= Item_Name%>">
	<input type="hidden" name="Item_Price" value="<%= Item_Price%>"> 
	<input type="hidden" name="Cart_Size" value="<%= Cart_Size%>">
	<input type="hidden" name="Cart_Color" value="<%= Cart_Color%>">
	<input type="hidden" name="Cart_Taste" value="<%= Cart_Taste%>">
	<input type="hidden" name="Cart_Amount" value="<%= Cart_Amount%>">
	<input type="hidden" name="Item_Image" value="<%= Item_Image%>">
	<input type="hidden" name="phone" id="phone" value="<%=m_phone1+m_phone2+m_phone3%>"><!-- phone1,2,3 합치기 -->
	<input type="hidden" name="orderNum" value="<%= Cart_Code%>"><!-- cart 번호 : cart에서 삭제 시 사용 -->
<%}
	int delivery = 0;
	if(sum < 50000){
		delivery = 3000;
	}
	%>
	<input type="hidden" name="delivery" value="<%=delivery%>">
	

		<tr>
			<td height="30" colspan="3"></td>
			<td class="td_default" align="center">배달비 :</td>
			<td class="td_default" align="center"><%=delivery%>원</td>
		</tr>
		<tr>
			<td colspan="6">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td height="30" colspan="3"></td>
			<td class="td_default" align="center">총 결제 금액 :</td>
			<td class="td_default" align="center"><%=sum+delivery%>원</td>
		</tr>
		<tr>
			<td colspan="6">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
	</table>
	<br> <br>
	<!-- 주문 정보 시작 -->
	<h3>주문 정보</h3>

	<table width="90%" cellspacing="0" cellpadding="0">
		<tr>
			<td colspan="3">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td width="125" height="35" class="td_default">주문하시는 분</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="mname" size="20" maxlength="20" value="<%= m_name %>"></input></td>
		</tr>
		<tr>
			<td height="35" class="td_default">우편번호</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="mpost" size="6" maxlength="6" value="<%= m_post %>" >

			</td>
		</tr>
		<tr>
			<td height="35" class="td_default">주 소</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="maddress1" size="35" maxlength="200" value="<%= m_addr1 %>"
				></input><br> <input class="input_default" type="text"
				id="maddress2" size="35" maxlength="200" value="<%= m_addr2 %>" ></input>
			</td>
		</tr>

		<tr>
			<td height="35" class="td_default">휴대전화</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="mphone1" size="5" maxlength="5" value="<%= m_phone1 %>"></input>-<input
				class="input_default" type="text" id="mphone2" size="5" maxlength="5"
				value="<%= m_phone2 %>"></input>-<input class="input_default" type="text"
				id="mphone3" size="5" maxlength="5" value="<%= m_phone3 %>"></input></td>
		</tr>
		<tr>
			<td height="35" class="td_default">이메일</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="memail" size="35" maxlength="35" value="<%= m_email1%>@<%= m_email2%>"></td>
		</tr>
		<tr>
			<td colspan="3">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
	</table>
	<!-- 주문 정보 끝  -->
	<br> <br>
	<!-- 배송 정보 시작 -->
	<h3>배송 정보</h3>
	<table width="90%" cellspacing="0" cellpadding="0">
		<tr>
			<td colspan="2">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td>배송지 확인</td>
			<td class="td_default"><input type="checkbox" name="same"
				id="same"> 주문고객 정보와 동일합니다.</td>
		</tr>
		<tr>
			<td width="125" height="35" class="td_default">이 름</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="orderName" name="orderName" size="20" maxlength="20"
				value=""></input></td>
		</tr>
		<tr>
			<td height="35" class="td_default">우편번호</td>
			<td height="35" class="td_default">
				<!-- 다음주소 시작--> <input type="text" name="post" id="sample4_postcode"
				placeholder="우편번호"> <input type="button"
				onclick="sample4_execDaumPostcode()" value="우편번호 찾기"><br>
				<input type="text" name="addr1" id="sample4_roadAddress"
				placeholder="도로명주소"> <input type="text" name="addr2"
				id="sample4_jibunAddress" placeholder="지번주소"> <span
				id="guide" style="color: #999"></span> <br> <!-- 다음주소 끝 -->
			</td>
		</tr>

		<tr>
			<td height="35" class="td_default">휴대전화</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="phone1" size="5" maxlength="5" value=""></input>-<input
				class="input_default" type="text" id="phone2" size="5" maxlength="5"
				value=""></input>-<input class="input_default" type="text"
				id="phone3" size="5" maxlength="5" value=""></input></td>
			
		</tr>
		<tr>
			<td colspan="2">
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
	</table>
	<!-- 배송 정보 끝 -->
	<br> <br>
	<!-- 결제 수단 시작  -->
	<h3>결제 수단</h3>
	<table width="90%" cellspacing="0" cellpadding="0">
		<tr>
			<td>
				<hr size="1" color="CCCCCC">
			</td>
		</tr>
		<tr>
			<td width="125" height="35" class="td_default"><input
				type="radio" name="payMethod" value="신용카드" checked>신용카드</input> <input
				type="radio" name="payMethod" value="계좌이체">계좌이체</input> <input
				type="radio" name="payMethod" value="무통장 입금">무통장 입금</input></td>

		</tr>
		<td>
			<hr size="1" color="CCCCCC">
		</td>

	</table>
	<!-- 결제 수단 끝 -->

	<input type="submit" value="결제하기">
</form>

<script src="http://dmaps.daum.net/map_js_init/postcode.v2.js"></script>
<script>
	//본 예제에서는 도로명 주소 표기 방식에 대한 법령에 따라, 내려오는 데이터를 조합하여 올바른 주소를 구성하는 방법을 설명합니다.
	function sample4_execDaumPostcode() {
		new daum.Postcode(
				{
					oncomplete : function(data) {
						// 팝업에서 검색결과 항목을 클릭했을때 실행할 코드를 작성하는 부분.

						// 도로명 주소의 노출 규칙에 따라 주소를 조합한다.
						// 내려오는 변수가 값이 없는 경우엔 공백('')값을 가지므로, 이를 참고하여 분기 한다.
						var fullRoadAddr = data.roadAddress; // 도로명 주소 변수
						var extraRoadAddr = ''; // 도로명 조합형 주소 변수

						// 법정동명이 있을 경우 추가한다. (법정리는 제외)
						// 법정동의 경우 마지막 문자가 "동/로/가"로 끝난다.
						if (data.bname !== '' && /[동|로|가]$/g.test(data.bname)) {
							extraRoadAddr += data.bname;
						}
						// 건물명이 있고, 공동주택일 경우 추가한다.
						if (data.buildingName !== '' && data.apartment === 'Y') {
							extraRoadAddr += (extraRoadAddr !== '' ? ', '
									+ data.buildingName : data.buildingName);
						}
						// 도로명, 지번 조합형 주소가 있을 경우, 괄호까지 추가한 최종 문자열을 만든다.
						if (extraRoadAddr !== '') {
							extraRoadAddr = ' (' + extraRoadAddr + ')';
						}
						// 도로명, 지번 주소의 유무에 따라 해당 조합형 주소를 추가한다.
						if (fullRoadAddr !== '') {
							fullRoadAddr += extraRoadAddr;
						}

						// 우편번호와 주소 정보를 해당 필드에 넣는다.
						document.getElementById('sample4_postcode').value = data.zonecode; //5자리 새우편번호 사용
						document.getElementById('sample4_roadAddress').value = fullRoadAddr;
						document.getElementById('sample4_jibunAddress').value = data.jibunAddress;

						// 사용자가 '선택 안함'을 클릭한 경우, 예상 주소라는 표시를 해준다.
						if (data.autoRoadAddress) {
							//예상되는 도로명 주소에 조합형 주소를 추가한다.
							var expRoadAddr = data.autoRoadAddress
									+ extraRoadAddr;
							document.getElementById('guide').innerHTML = '(예상 도로명 주소 : '
									+ expRoadAddr + ')';

						} else if (data.autoJibunAddress) {
							var expJibunAddr = data.autoJibunAddress;
							document.getElementById('guide').innerHTML = '(예상 지번 주소 : '
									+ expJibunAddr + ')';

						} else {
							document.getElementById('guide').innerHTML = '';
						}
					}
				}).open();
	}
</script>

</form>