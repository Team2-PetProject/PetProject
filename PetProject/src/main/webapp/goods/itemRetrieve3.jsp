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

<div id="itemView"> <!-- 제일 밖, 가운데 정렬 위함 -->
<div id="itemImg"> <!-- 상품 이미지 -->
	<img name="Item_Image" src="images/items/<%=itemImage %>.png" width="400px" height="400px">
</div>

<div id="itemContents">



<button id="order">바로구매</button>
<button id="cart">장바구니</button>
<button id="like">찜 하기</button>

<button>상품문의</button>

 </div> <!-- end itemContents -->
</div><!-- end itemView -->


<!-- 상세보기 -->
<div class="goods_detail">
	<img src="images/items_detail/food01.png">
</div>



<!-- 스타일 -->
<style type="text/css">

	#itemView{
		border: 1px solid #6182D6;
		border-radius:2em;
		margin: auto;
		width: 1300px;
		height: 500px;
		/*background: #6182D6;*/
		display: flex;
		align-items:center;
		padding-left: 40px;
	}
	
	#itemImg{
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

