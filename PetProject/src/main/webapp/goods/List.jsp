<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@page import="java.util.List"%>
<%@page import="com.dto.ItemDTO"%>

<script type="text/javascript" src="js/jquery-3.3.1.js"></script>
<script type="text/javascript">
	$(document).ready(function(){
		
	})
</script>

		카테고리<br>
		<input type="checkbox" name="" value="강아지"><br>
		<input type="checkbox" name="" value="고양이"><br>
		<input type="checkbox" name="" value="소동물"><br>
		<hr><br>
		
		브랜드<br><br>
		<input type="checkbox" name="" value="WK"><br>
		<input type="checkbox" name="" value="닥터펫"><br>
		<input type="checkbox" name="" value="이나바"><br>
		<input type="checkbox" name="" value="캐티맨"><br>
		<input type="checkbox" name="" value="ANF"><br>
		<input type="checkbox" name="" value=""><br>
		<hr><br>
		
		주식<br><br>
		<input type="checkbox" name="" value="건식"><br>
		<input type="checkbox" name="" value="습식"><br>
		<input type="checkbox" name="" value="화식"><br>
		<hr><br>
		
		급여대상<br><br>
		<input type="checkbox" name="" value="전연령"><br>
		<input type="checkbox" name="" value="어덜트"><br>
		<input type="checkbox" name="" value="시니어"><br>
		<input type="checkbox" name="" value="키튼"><br>
		<input type="checkbox" name="" value="퍼피"><br>
		<hr><br>
		
		용품<br><br>
		<input type="checkbox" name="" value="산책"><br>
		<input type="checkbox" name="" value="미용"><br>
		<input type="checkbox" name="" value="패션"><br>
		<input type="checkbox" name="" value="집"><br>
		<input type="checkbox" name="" value="장난감"><br>
		<input type="checkbox" name="" value=""><br>
		<hr><br>
		
		할인 상품<br><br>
		<input type="checkbox" name="" value="할인 상품"><br>
		
		<table width="100%" cellspacing="0" cellpadding="0">
		<table align="center" width="710" cellspacing="0" cellpadding="0"
				border="0">
				
<%
	List<ItemDTO> list = (List<ItemDTO>)request.getAttribute("ItemList");
	for(int i=1;i<=list.size();i++){
		ItemDTO dto = list.get(i-1);
		String Item_Code = dto.getItem_Code();
		String Item_Category = dto.getItem_Category();
		String Item_Name = dto.getItem_Name();
		String Item_Info = dto.getItem_Info();
		int Item_Price = dto.getItem_Price();
		String Item_Image = dto.getItem_Image();
		String Item_Color = dto.getItem_Color();
		String Item_Taste = dto.getItem_Taste();
%>
	<table style='padding:15px'>
	<tr>
		<td class= "" align ="left">
		<a class= "" href=""> 
			<%= Item_Name%><br>
		</a>
		</td>
	<tr>
		<td class="" align ="left">
			<%= Item_Info%>
		</td>
	</tr>
	<tr>
		<td>
		<a href="ItemRetrieveServlet?Item_Code=<%= Item_Code %>">
			<img src="images/items/<%= Item_Image %>.png" border="0" align="center" width="100">
		</a>
		</td>
	</tr>
	<tr>
		<td height="10">
	</tr>
	<tr>
	<td class="" align ="left"><strong>
	<%= Item_Price%></strong></td>
	</tr>
	
	</table>
<%
	if(i%4==0){
%>
<%
	}//end if
%>
<%
	}//end for
%>
	</table>
</table>
