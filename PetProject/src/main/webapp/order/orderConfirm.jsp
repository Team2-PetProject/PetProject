<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>


<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<script>
	$(document).ready(function(){
		
		//유효성 검사
		$("form").on("submit",function(){
			var oname = $("#oname").val();
			var opost = $("#opost").val();
			var oaddress1 = $("#oaddress1").val();
			var oaddress2 = $("#oaddress2").val();
			var ophone1 = $("#ophone1").val();
			var ophone2 = $("#ophone2").val();
			var ophone3 = $("#ophone3").val();
			var oemail = $("#oemail").val();
			var orderName = $("#orderName").val();
			var sample4_postcode = $("#sample4_postcode").val();
			var sample4_roadAddress = $("#sample4_roadAddress").val();
			var sample4_jibunAddress = $("#sample4_jibunAddress").val();
			var phone1 = $("#phone1").val();
			var phone2 = $("#phone2").val();
			var phone3 = $("#phone3").val();
			
			
			if(oname.length==0){
				alert("필수 입력 항목");
				$("#oname").focus();
				return false;
			}
			if(opost.length==0){
				alert("필수 입력 항목");
				$("#opost").focus();
				return false;
			}
			if(oaddress1.length==0){
				alert("필수 입력 항목");
				$("#oaddress1").focus();
				return false;
			}
			if(oaddress2.length==0){
				alert("필수 입력 항목");
				$("#oaddress2").focus();
				return false;
			}
			if(ophone1.length==0){
				alert("필수 입력 항목");
				$("#ophone1").focus();
				return false;
			}
			if(ophone2.length==0){
				alert("필수 입력 항목");
				$("#ophone2").focus();
				return false;
			}
			if(ophone3.length==0){
				alert("필수 입력 항목");
				$("#ophone3").focus();
				return false;
			}
			if(oemail.length==0){
				alert("필수 입력 항목");
				$("#oemail").focus();
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
			
			
		});//end form
		
		
		
		//주문정보와 동일 여부
		$("#same").on("click",function(){
			if(this.checked){
				$("#orderName").val($("#oname").val());
				$("#sample4_postcode").val($("#opost").val());
				$("#sample4_roadAddress").val($("#oaddress1").val());
				$("#sample4_jibunAddress").val($("#oaddress2").val());
				$("#phone1").val($("#ophone1").val());
				$("#phone2").val($("#ophone2").val());
				$("#phone3").val($("#ophone3").val());
			}else{
				$("#orderName").val("");
				$("#sample4_postcode").val("");
				$("#sample4_roadAddress").val("");
				$("#sample4_jibunAddress").val("");
				$("#ophone1").val("");
				$("#ophone2").val("");
				$("#ophone3").val("");
			}
			
		});//end same
		
		
		
	});//end ready
</script>


<h1>주문결제</h1>

<form name="myForm" method="post" action="CartOrderDoneServlet">
<input type="hidden" name="gCode" value="">
<input type="hidden" name="gName" value="">
<input type="hidden" name="gPrice" value="">
<input type="hidden" name="gSpec" value="">
<input type="hidden" name="gTaste" value="">
<input type="hidden" name="gAmount" value="">
<input type="hidden" name="gImage" value="">
<input type="hidden" name="phone" value=""><!-- phone1,2,3 합치기 -->
<input type="hidden" name="orderNum" value=""><!-- cart 번호 : cart에서 삭제 시 사용 -->

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

		<tr>
			<td class="td_default" width="80"></td>
			<td class="td_default" width="80"><img
				src="images/items/dish1.png" border="0" align="center" width="80" /></td>
			<td class="td_default" width="300" style='padding-left: 30px'>식기
				<br> <font size="2" color="#665b5f">[옵션 : 옵션1() , 옵션2()] </font>
			</td>
			<td class="td_default" align="center" width="110">12000</td>
			<td class="td_default" align="center" width="90">1</td>

		</tr>


		<tr>
			<td height="30" colspan="3"></td>
			<td class="td_default" align="center">총 결제 금액 :</td>
			<td class="td_default" align="center">12000원</td>
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
				type="text" id="oname" size="20" maxlength="20" value=""></input></td>
		</tr>
		<tr>
			<td height="35" class="td_default">우편번호</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="opost" size="6" maxlength="6" value="" >

			</td>
		</tr>
		<tr>
			<td height="35" class="td_default">주 소</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="oaddress1" size="35" maxlength="200" value=""
				></input><br> <input class="input_default" type="text"
				id="oaddress2" size="35" maxlength="200" value="" ></input>
			</td>
		</tr>

		<tr>
			<td height="35" class="td_default">휴대전화</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="ophone1" size="5" maxlength="5" value=""></input>-<input
				class="input_default" type="text" id="ophone2" size="5" maxlength="5"
				value=""></input>-<input class="input_default" type="text"
				id="ophone3" size="5" maxlength="5" value=""></input></td>
		</tr>
		<tr>
			<td height="35" class="td_default">이메일</td>
			<td height="35" class="td_default"><input class="input_default"
				type="text" id="oemail" size="35" maxlength="35" value=""></td>
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