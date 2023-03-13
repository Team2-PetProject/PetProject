package com.controller.goods;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.GoodsDTO;
import com.service.GoodsService;

@WebServlet("/GoodsRetrieveServlet")
public class GoodsRetrieveServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String item_code = request.getParameter("item_code");
		System.out.println("상품 코드 : " + item_code);
		
		GoodsService service = new GoodsService();
		GoodsDTO gdto= service.goodsRetrieve(item_code);
		System.out.println(gdto);
		
		request.setAttribute("goodsRetrieve", gdto);
		
		RequestDispatcher dis = request.getRequestDispatcher("goodsRetrieve.jsp");
		dis.forward(request, response);
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}//end servlet
