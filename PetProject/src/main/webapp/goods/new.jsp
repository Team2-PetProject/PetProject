<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
	table {
		text-align : center;
	}
</style>
</head>
<body>
<span>최신 상품.</span><span> 따끈따끈한 신상품 보기.</span><br>
<table>
	<tr>
	<%
		for(int i=0;i<4;i++){
	%>
		<td>
			<table style='padding:15px;'>
					<tr class="new" style ="text-align : left;">
						<td>New</td>
					</tr>
					<tr>
						<td class= "" align ="center">
							<a  href="GoodsRetrieveServlet?gCode=">
										더마독 슬리밍 강아지 다이어트 사료 2kg 가수분해 개사료<br>
							</a>
										
						</td>
									
					</tr>
					<tr>
						<td>
							<a href="#"> <!-- 이미지 링크 -->
								<img src="images/best/DermaDog.png" border="0" align="center" width="200">
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
						33000원</td>
					</tr>
				</table>
			</td>
			
<%} %>
	</tr>
</table>

</body>
</html>