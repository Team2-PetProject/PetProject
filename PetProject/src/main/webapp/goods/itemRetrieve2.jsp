<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.dto.ItemDTO" %>
<%
	ItemDTO dto = (ItemDTO)request.getAttribute("itemRetrieve");
	System.out.println("goods/itemRetrieve2.jsp에서 " + dto);
	String itemCode = dto.getItem_Code();
	String itemCategory = dto.getItem_Category();
	String itemName = dto.getItem_Name();
	int itemPrice = dto.getItem_Price();
	String itemImage = dto.getItem_Image();
	String itemSize = dto.getItem_Size();
	String itemColor = dto.getItem_Color();
	String itemTaste = dto.getItem_Taste();

%>


<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	var price = $("#itemPrice").text();
	var rs = $("#cart_amount").val();

	//수량 +/-, 총 금액 뿌리기
	$("#up").on("click", function(){
		rs = parseInt(rs)+1;
		$("#cart_amount").val(rs);
		$("#totalPrice").text(price*rs);
	});//end 수량+
	
	$("#down").on("click", function(){
		if(rs > 1){
			rs = parseInt(rs)-1;
		}
		$("#cart_amount").val(rs);
		$("#totalPrice").text(price*rs);
	});//end 수량-
	
	//바로구매
	$("#order").on("click", function(){
		//유효성 검사
		
		//데이터 넘기기
		//$("#form").attr("action", "CartOrderConfirmServlet");
		
	});//end order
	
	//장바구니
	
	//찜하기
	$("#like").on("click", function() {
		$("")
		//
	});//end like
	
});//end doc

</script>

<div style="height: 50px"></div>

<div class="goods_top"> <!-- 가운데 정렬 위함 -->
<div class="goods_img"> <!-- 상품 이미지 -->
	<img name="Item_Image" src="images/items/<%=itemImage %>.png" width="400px" height="400px">
</div>

<div class="goods_option">

<table border="1">
	<tr height="40px">
	<tr>
		<td><a href="#"><span name="Item_Category" style="font-size:12px"><%=itemCategory %></span></a></td>
		<td>
		<td>
	</tr>
	<tr height="15px">
	<tr>
		<td colspan="3"><span name="Item_Name" style="font-size:25px; font-weight:bold;"><%=itemName %></span></td>
	</tr>
	<tr height="5px">
	<tr>
		<td colspan="4">
			<span id="itemPrice" style="font-size:25px; font-weight:bold;"><%=itemPrice %></span>
			<span style="font-size:23px; font-weight:bold;">원</span>
		</td>
	</tr>
<!-- 	<tr height="20" />
	<tr rowspan="2"> 
		<td> --> <!-- 택배박스 모양 이미지 -->
			<!-- <img src="images/icon/package_icon.png" width="40" height="40">  -->
<!-- 		</td>
		<td colspan="3">
			<span style="font-size:13px">배송안내</span><br>
			<span style="font-size:10px">마이페이지-배송 정보 확인에서 배송정보 확인 가능</span>
		</td>
	</tr> -->
	<tr height="20" />
	<tr>
	
	<!-- 
		if(itemSize == null) {
			<td width = "0px">
		} else{
			<td>
		}
	
	 -->
	
		<% System.out.println(itemSize);
		if( itemSize != null) { %>
			<td>상품 옵션</td>
		<% }else{ %>
			<td width="0"><td> <%} %>
		<td>상품 옵션</td>
		<td>상품 옵션</td>
	</tr>
	<tr>
		<% System.out.println(itemSize);
		if( itemSize != null) { %>
			<td>
			<select id="itemSize" name="Cart_Size">
				<option selected >선택하세요</option>
			</select>
		</td>
		<% }else{ %>
			<td width="0"><td> <%} %>
		<td>
			<select id="itemSize" name="Cart_Size">
				<option selected >선택하세요</option>
			</select>
		</td>
		<td>
			<select id="itemColor" name="Cart_Color">
				<option selected >선택하세요</option>
			</select>
		</td>
		<td>
			<select id="itemTaste" name="Cart_Taste">
				<option selected >선택하세요</option>
			</select>
		</td>
	</tr>
	<tr height="20" />
	<tr>
		<td colspan="3">수량</td>
		<td><img src="images/icon/minus.png" id="down" width="10" height="10">
			<input type="text" id="item_amount" name="item_amount" value="1" style="width:25px; text-align:center;">
			<img src="images/icon/plus.png" id="up" width="10"></td>
	</tr>
	<tr height="10" />
	<tr>
		<td colspan="3">총 금액</td>
		<td><span id="totalPrice">40000</span></td>
	</tr>
	
	
</table>
<br>
<button id="order">바로구매</button>
<button id="cart">장바구니</button>
<button id="like">찜 하기</button>

<button>상품문의</button>

 </div> <!-- end goods_option -->
</div><!-- end goods_top -->


<!-- 상세보기 -->
<div class="goods_detail">
	<img src="images/items_detail/food01.png">
</div>



<!-- 스타일 -->
<style type="text/css">

	.goods_top{
		border: 1px solid #E6E6E6;
		border-radius:2em;
		margin: auto;
		width: 1000px;
		height: 500px;
		/*background: grey;*/
		display: flex;
		align-items:center;
		padding-left: 40px;
	}
	
	.goods_img{
		float: left;
		width: 450px;
		height: 450px;
	/*	background: blue;*/
		margin-right: 40px;
		display: flex; /*수직, 수평방향의 중앙 설정위해 부모 div에 설정*/
		justify-content: center; /*가로 중앙 정렬*/
		align-items:center; /*세로 중앙 정렬*/
	}
	
	.goods_option{
		float: left;
		width: 450px;
		height: 450px;
		background: pink;
	}
	
	.goods_detail{
		width: 700px;
		margin: auto;
		margin-top:100px;
		
	}
</style>

