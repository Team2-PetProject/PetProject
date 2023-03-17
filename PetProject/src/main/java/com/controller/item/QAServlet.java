package com.controller.item;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/QAServlet")
public class QAServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String itemCode = request.getParameter("Item_Code");
		String itemName = request.getParameter("Item_Name");
		String itemPrice = request.getParameter("Item_Price");
		System.out.println(itemCode + "\t" + itemName + "\t" + itemPrice);
	}//doGet

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}//end servlet