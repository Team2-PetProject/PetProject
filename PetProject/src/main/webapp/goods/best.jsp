<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.dto.ItemDTO" %>
 
<span>인기 상품.</span><span> 여기가 맛집 인기 상품 보기.</span><br>
<table>
	<tr>
<%-- <% for(){ %>	 --%>	
		<tr>
	<%
		List<ItemDTO> list = (List<ItemDTO>) request.getAttribute("bestList");
		
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
						<td>Best</td>
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
							<a href="ItemRetrieveServlet?item_code=<%=itemCode%>"> <!-- 이미지 링크 -->
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
</html>