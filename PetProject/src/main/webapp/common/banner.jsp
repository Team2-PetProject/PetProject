<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<script type="text/javascript" src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
<style type="text/css">
	.slideshow-container {
		max-width : 1440px;
		position : relative;
		margin : auto;
	}
	div {
		text-align : center;
	}
</style>
<script type="text/javascript">
	var index = 0;
	$(function() {
		$(".mySlide").not(".active").hide();
		
		setInterval(slide, 10000);
	});
	function slide() {
		var arrSlide = $(".mySlide");
		var n = arrSlide.length;
		if(index == (n-1)){
			console.log("prev" + index);
			prevSlide();
		}else{
			console.log("next" + index);
			nextSlide();
		}
	}
	function prevSlide() {
		var arrSlide = $(".mySlide");
		var n = arrSlide.length;
		if(index !=0){
			index--;
		}
		$(".mySlide").removeClass("active");
		$(".mySlide").eq(index).addClass("active");
		$(".mySlide").eq(index).show();
		$(".mySlide").not(".active").hide();
	}
	function nextSlide() {
		var arrSlide = $(".mySlide");
		var n = arrSlide.length;
		if(index != (n-1)){
			index++;
		}
		$(".mySlide").removeClass("active");
		$(".mySlide").eq(index).addClass("active");
		$(".mySlide").eq(index).show();
		$(".mySlide").not(".active").hide();
	}
</script>

		
<div class="slideshow-container">
	<div class = "mySlide active">
		<img alt="" src="images/banner/banner1.png">
	</div>
	<div class = "mySlide">
		<img alt="" src="images/banner/banner2.png">
	</div>
	<a class="prev" onclick="prevSlide()">&#10094;</a>
	<a class="next" onclick="nextSlide()">&#10095;</a>
	
</div>