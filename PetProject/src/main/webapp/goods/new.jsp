<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.dto.ItemDTO" %>
<style type="text/css">
	table {
		text-align : center;
	}
</style>
<body>
<span>최신 상품.</span><span> 따끈따끈한 신상품 보기.</span><br>
<table>
	<tr>
	<%
		List<ItemDTO> list = (List<ItemDTO>) request.getAttribute("newList");
		
		for(int i=0;i<list.size();i++){
			ItemDTO dto = list.get(i);
			String itemCode = dto.getItem_Code();
			String itemName = dto.getItem_Name();
			String itemImage = dto.getItem_Image();
			int itemPrice = dto.getItem_Price();
	%>
		<td>
			<table style='padding:15px;'>
					<tr class="new" style ="text-align : left;">
						<td>New</td>
					</tr>
					<tr>
						<td class= "" align ="center">
							<a  href="GoodsRetrieveServlet?gCode=">
										<%=itemName%><br>
							</a>
										
						</td>
									
					</tr>
					<tr>
						<td>
							<a href="#"> <!-- 이미지 링크 -->
								<img src="images/items/<%=itemImage%>.png" border="0" align="center" width="200">
							</a>
						</td>
					</tr>
					<tr>
								
						<td height="10">
					</tr>
					
					<tr>
						<td height="10">
					</tr>
					<tr>
						<td class="" align ="center">
						<%=itemPrice%>원</td>
					</tr>
				</table>
			</td>
			
<%} %>
	</tr>
</table>

</body>