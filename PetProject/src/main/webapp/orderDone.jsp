<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kkosunnae</title>

<style type="text/css">
html,
body {
  height: 100%;
}

body {
  display: flex;
  min-height: 100vh;
  flex-direction: column;
}

main {
  flex: 1; /* flex-grow */
}

</style>

<!-- font-awesome-icon -->
<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.2.0/css/all.min.css" integrity="sha512-xh6O/CkQoPOWDdYTDqeRdPCVd1SpvCA9XXcUnZS2FmJNp1coAFzvtCN9BmamE+4aHK8yyUHUSCcJHgXloTyT2A==" crossorigin="anonymous" referrerpolicy="no-referrer" />
</head>
<body>
	<header>
		<jsp:include page="common/top.jsp" flush="true"></jsp:include>
		<hr>
		<jsp:include page="common/menu.jsp" flush="true"></jsp:include>
	</header>
		

	<main>
		<jsp:include page="order/orderDone.jsp" flush="true"></jsp:include>
	</main>


	<footer>
		상호: Kkosunnae(주) | 대표자 : 홍길동 | 고객센터 : 1688-0000 |
		주소: 서울시 강남구 테헤란로  | 이메일: xyz@gmail.com
	</footer>
</body>
</html>