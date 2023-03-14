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

<div id="wrapper_outer"> <!-- 제일 밖, 가운데 정렬 위함 -->
<div id="wrapper_inner_left"> <!-- 상품 카테고리 & 이미지 -->
	<div id="group">
		<div style="float:left; "><a href="#">Home(상품)&nbsp;>&nbsp;&nbsp;</a></div>
		<div style="float:left; "><a href="itemListServlet?Item_Category=<%=itemCategory%>"><%=itemCategory %></a></div>
<%-- 		<div style="float:left; flex-direction:row;"><%=itemCategory %></div> --%>
	</div>
	<img id="img" name="Item_Image" src="images/items/<%=itemImage %>.png" style="float:left; width:400px; height:400px;">
</div>

<div id="wrapper_inner_right"> <!-- 상품 컨텐츠 -->
	
	<div class="forBlank"></div>
	
	<div class="itemBasicInfo"><%=itemName %></div>
	<div class="itemBasicInfo"><%=itemPrice %>원</div>
	
	<div class="itemOptionList">
		<%
		if(itemSize==null && itemColor!=null && itemTaste!=null
				|| itemSize!=null && itemColor==null && itemTaste!=null
				|| itemSize!=null && itemColor!=null && itemTaste==null){
		%>
			<div class="itemOption">옵션</div>
			<div class="itemOption">옵션</div>
		<%}else if(itemSize==null && itemColor==null && itemTaste!=null 
				|| itemSize==null && itemColor!=null && itemTaste==null
				|| itemSize!=null && itemColor==null && itemTaste==null){ %>	
			<div class="itemOption">옵션</div>
		<%}else{ %>	
			<div class="itemOption">옵션</div>
			<div class="itemOption">옵션</div>
			<div class="itemOption">옵션</div>
		<%} %>
	</div>
	
	
	
	<div class="itemOptionList2">
		<%
		String[] opt = {itemSize, itemColor, itemTaste};
		//System.out.println(opt[1]);
		int num=0;
		for(int i=0; i<opt.length; i++){
			if(opt[i] != null){
				num += 1;
			}
		}
		if(num==1){
		%>
			<div class="itemOption2">option</div>
		<%}else if(num==2){ %>
			<div class="itemOption2">option</div>
			<div class="itemOption2">option</div>
		<%}else{ %>
			<div class="itemOption2">option</div>
			<div class="itemOption2">option</div>
			<div class="itemOption2">option</div>
		<%} %>
	</div>
	
	<div class="itemOptionList2">
		<%
		String[] size= opt[0].split("/");
		%>
	
	</div>
	
	
	
	
	<div class="itemOptionList">
		
			<div>
				<select class="itemOption">
					<option selected>선택해주세요</option>
					<%
					if(itemSize != null){
						String[] sizeOpt = itemSize.split("/");
						for(int i=0; i<sizeOpt.length; i++){%>
							<option><%=sizeOpt[i] %></option>
						<%} %>
					<%} %>
				</select>
			</div>
	</div>




<!-- <button id="order">바로구매</button>
<button id="cart">장바구니</button>
<button id="like">찜 하기</button>

<button>상품문의</button>
 -->
 
</div><!-- end itemContents -->
</div><!-- end wrapper -->


<!-- 상품상세 이미지 -->
<div id="itemDetail">
	<img src="images/items_detail/food01.png">
</div>



<!-- 스타일 -->
<style type="text/css">

	#wrapper_outer{
		border: 1px solid #6182D6;
		border-radius:2em;
		margin: auto; /*이것만 해줘도 브라우저 가로기준 가운데 정렬됨 */
		width: 1300px;
		height: 530px;
		background: #6182D6;
		display: flex; /*자식인 #itemImg와 itemContents 가운데정렬 위해 부모에 설정*/
		align-items:center; /*flex와 이것까지가 세로기준 가운데 정렬 */
		justify-content: center; /*flex와 이게 가로기준 가운데 정렬*/
		flex-direction:row;
	}
	
	#wrapper_inner_left{
		float: left;
		width: 450px;
		height: 480px;
		background: #FF843A;
		margin-right: 40px;
		display: flex; /* 자식인 진짜 이미지 수직, 수평방향의 중앙 설정위해 부모 div에 설정*/
		justify-content: center; /*가로 중앙 정렬*/
		align-items:center; /*세로 중앙 정렬*/
		flex-direction: column; /*자식들인 group과 img를 세로로 쌓기위함*/
	}
	
	#group{
		float: left;
		background: #B0981B;
		width: 400px;
		height: 30px;
		margin-bottom: 10px;
	}
	
	#wrapper_inner_right{
		float: left;
		width: 700px;
		height: 480px;
		background: #69D8AD;
	}
	
	.forBlank{
		height: 30px;
	}
	
	.itemOptionList{
		background-color:#3BA9AE;
		display:flex;
		justify-content: flex-start; <!-- itemOption 가로 정렬위해?? -->
	}
	
	.itemOption{
		background-color:#BFBFBF;
		width:150px;
		height: 20px;
		margin-right:30px;
	}
	
	.itemOptionList2{
		background-color:red;
		display:flex;
		justify-content: flex-start; <!-- itemOption 가로 정렬위해?? -->
	}
	
	.itemOption2{
		background-color:pink;
		width:150px;
		height: 20px;
		margin-right:30px;
	}
	
	#itemDetail{
		width: 700px;
		margin: auto;
		margin-top:100px;
	}
	
</style>

