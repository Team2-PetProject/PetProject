<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Kkosunnae</title>
<!-- 메타 태그 설정, 키워드, 설명  -->
<meta name="description" content="애견용품 전문 쇼핑몰, 애견과 함께하는 행사 소개">
<meta name="keywords" content="애견용품,애견간식,애견식품,목줄,애견집,애견축제">
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
</head>
<body>
	<header>
		<jsp:include page="common/top.jsp"></jsp:include>
		<br>
		<jsp:include page="common/menu.jsp"></jsp:include>
	</header>
		

	<main>
		<jsp:include page="member/memberForm.jsp"></jsp:include>
	</main>


	<footer>
		상호: Kkosunnae(주) | 대표자 : 홍길동 | 고객센터 : 1688-0000 |
		주소: 서울시 강남구 테헤란로  | 이메일: xyz@gmail.com
	</footer>
</body>
</html>