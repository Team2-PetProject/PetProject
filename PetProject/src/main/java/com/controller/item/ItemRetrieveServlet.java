package com.controller.item;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.ItemDTO;
import com.service.ItemService;

@WebServlet("/ItemRetrieveServlet")
public class ItemRetrieveServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String item_code = request.getParameter("item_code");
		
		//ItemDTO iDTO = new ItemDTO("food02", "food", "연어어쩌고", null, 40000, "food02", "S/M/L", null, "mild/spicy");
		
		String item_code = "beauty01";
		System.out.println("상품 코드 : " + item_code);
		
		ItemService service = new ItemService();
		ItemDTO dto= service.itemRetrieve(item_code);
		System.out.println(dto);
		
		request.setAttribute("itemRetrieve", dto);
		
		RequestDispatcher dis = request.getRequestDispatcher("itemRetrieve.jsp");
		dis.forward(request, response);
		
		
		
		
	}//end doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}//end servlet
