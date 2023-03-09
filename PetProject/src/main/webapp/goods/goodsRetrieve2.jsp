<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<style type="text/css">

	.goods_top{
		border: 1px solid grey;
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
		border: 1px solid blue;
		float: left;
		width: 450px;
		height: 450px;
		/*background: blue;*/
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
</style>
<div style="height: 50px"></div>
<div class="goods_top">
<div class="goods_img">
	<img src="images/items/food02.png" width="400px" height="400px">
	<!-- 이미지 -->
</div>

<div class="goods_option">

<table border="1">

	<tr height="30" />
	<tr>
		<td width="45"><a href="#"><span style="font-size:12px">사료</span></a></td>
		<td width="45"><a href="#"><span style="font-size:12px">건식</span></a></td>
		<td width="150">
		<td width="50">
		
	</tr>
	<tr>
		<td colspan="4"><span style="font-size:25px; font-weight:bold;">ANF 램 전견용 7.2kg</span></td>
	</tr>
	<tr>
		<td colspan="4"><span style="font-size:25px; font-weight:bold;">40000원</span></td>
	</tr>
	<tr height="20" />
	<tr rowspan="2">
		<td> <!-- 택배박스 모양 이미지 -->
			<img src="images/icon/package_icon.png" width="40" height="40">
		</td>
		<td colspan="3">
			<span style="font-size:13px">배송안내</span><br>
			<span style="font-size:10px">마이페이지-배송 정보 확인에서 배송정보 확인 가능</span>
		</td>
	</tr>
	<tr height="20" />
	<tr>
		<td colspan="3">수량선택</td>
		<td><input type="text" value="1"></td>
	</tr>
	<tr height="10" />
	<tr>
		<td colspan="3">총 금액</td>
		<td> 가격 * 수량</td>
	</tr>
	
	
</table>

<input type="submit" value="장바구니">
<input type="submit" value="구매하기">
<input type="submit" value="문의하기">

</div>
</div><!-- 전체 칸 -->



