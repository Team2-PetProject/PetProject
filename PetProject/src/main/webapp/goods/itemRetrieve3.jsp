<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<%@ page import="com.dto.ItemDTO" %>
<%@ page import="java.text.DecimalFormat" %>


<%
	ItemDTO dto = (ItemDTO)request.getAttribute("itemRetrieve");
	System.out.println("goods/itemRetrieve3.jsp에서 " + dto);
	String itemCode = dto.getItem_Code();
	String itemCategory = dto.getItem_Category();
	String itemName = dto.getItem_Name();
	int itemPrice = dto.getItem_Price();
	String itemImage = dto.getItem_Image();
	String itemSize = dto.getItem_Size();
	String itemColor = dto.getItem_Color();
	String itemTaste = dto.getItem_Taste();

%>
<%
	
	
%>

<script	src="https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js"></script>
<script type="text/javascript">

$(document).ready(function(){
	
	var price = parseInt($("#itemPrice").text());
	var amount = parseInt($("#itemAmount").text());
	
	//금액 천단위 콤마, 화폐단위 표시
	var kPrice = price.toLocaleString();
	$("#itemPrice").text(kPrice+"원");
	$("#totalPrice").text(kPrice+"원");

	//수량 +/-, 총 금액 뿌리기
	$("#up").on("click", function(){
		amount += 1;
		$("#itemAmount").text(amount);
		$("#totalPrice").text(price*amount);
	}); //end 수량+
	
	$("#down").on("click", function(){
		if(amount > 1){
			amount -= 1;
		}
		$("#itemAmount").text(amount);
		$("#totalPrice").text(price*amount);
	});//end 수량-
	
	
	//바로구매
	$("#orderNow").on("click", function(){
		//유효성 검사
		console.log("orderNow 클릭");
		console.log($(".option").val());
		//if($(".option").val() == null)
		
		
		//데이터 넘기기
		//$("#form").attr("action", "CartOrderConfirmServlet");
		
	});//end orderNow
	
	
	//장바구니
	$("#cartAdd").on("click", function(){
		
	});//end cartAdd
	
	

	
	
	//상품문의
	$("#QA").on("click", function() {
		location.href="QAServlet";
		
	});//end QA
	
	
});//end doc

</script>


<div style="height: 50px"></div>

<div id="wrap_top"> <!-- 제일 밖, 가운데 정렬 위함 -->
<div id="wrap_image"> <!-- 상품 카테고리 & 이미지 -->
	<div id="group">
		<div style="float:left; "><a href="#">Home(상품)&nbsp;>&nbsp;&nbsp;</a></div>
		<div style="float:left; "><a href="itemListServlet?Item_Category=<%=itemCategory%>"><%=itemCategory %></a></div>
<%-- 		<div style="float:left; flex-direction:row;"><%=itemCategory %></div> --%>
	</div>
	<img id="img" name="Item_Image" src="images/items/<%=itemImage %>.png" style="float:left; width:400px; height:400px;">
</div>

<div id="wrap_conts"> <!-- 상품 컨텐츠 -->
	
	<div class="forBlank"></div>
	
	<div class="itemBasicInfo" name="Item_Name"><%=itemName %></div>
	<div class="itemBasicInfo" id="itemPrice"><%=itemPrice %></div>
	
	
	<input type="hidden" name="Item_Price" value="<%=itemPrice%>">
	
	
	<div class="wrap_options">
		<%
			//System.out.println(itemSize);
		String[] opt = {itemSize, itemColor, itemTaste};
		String[] key = {"Cart_Size", "Cart_Color", "Cart_Taste"};
		for(int i=0; i<opt.length; i++){
				//System.out.println("opt[i] = "+opt[i]);
			if(opt[i] != null){
				String[] value = opt[i].split("/");
		%>		<div class="option_inner">
					<div>옵션</div>
					<div>
						<select class="option" name=<%=key[i]%>>
							<option selected value="null">선택하세요</option>
							<% for(int j=0; j<value.length; j++){ %>
								<option><%= value[j] %></option>
							<%} //end 안for %>	
						</select>
					</div>
				</div>
			<%} //end if%>
		<%} //end 밖for %>
	
	</div> <!-- end option_outer -->
	
	<div class></div>
	<div>주문 수량</div>
	<div class="itemAmount">
		<img src="images/icon/minus.png" id="down" width="10" height="10">
		<div id="itemAmount" name="Item_Amount" style="width:35px; height:10px; text-align:center;">1</div>
		<img src="images/icon/plus.png" id="up" width="10" height="10">
	</div>
	
	
	<div>총 상품 금액</div>
	<div id="totalPrice" name="totalPrice"><%= itemPrice %></div>




<button id="orderNow">바로구매</button>
<button id="cartAdd">장바구니</button>
<button id="like">찜 하기</button>
<button id="QA">상품문의</button>

<button>상품문의</button>

 
</div><!-- end itemContents -->
</div><!-- end wrapper_top -->


<!-- 상품상세 이미지 -->
<div id="itemDetail">
	<img src="images/items_detail/<%=itemImage %>.png">
</div>



<!-- 스타일 -->
<style type="text/css">

	#wrap_top{
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
	
	#wrap_image{
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
	
	#wrap_conts{
		float: left;
		width: 700px;
		height: 480px;
		background: #69D8AD;
	}
	
	.forBlank{
		width: 30px;
		height: 30px;
		background: white;
	}
	
	.itemBasicInfo{
		font-size: 40px;
		font-weight: 600; /*100~900. 400이 normal, 700이 bold*/
	}
	
	.wrap_options{
		width: 650px;
		height: 200px;
		background: #3BA9AE;
	}
	
	.option_inner{
		
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

