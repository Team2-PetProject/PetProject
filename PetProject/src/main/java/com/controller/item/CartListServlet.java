package com.controller.item;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/CartListServlet")
public class CartListServlet extends HttpServlet {
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String Item_Code = request.getParameter("Item_Code");
		String Item_Name = request.getParameter("Item_Name");
		int Item_Price = Integer.parseInt(request.getParameter("Item_Price"));
		String Item_Image = request.getParameter("Item_Image");
		String Cart_Size = request.getParameter("Cart_Size");
		String Cart_Color = request.getParameter("Cart_Color");
		String Cart_Taste = request.getParameter("Cart_Taste");
		String Cart_Amount = request.getParameter("Item_Amount");
		System.out.println("==============");
		System.out.println("code "+Item_Code);
		System.out.println(Item_Name);
		System.out.println(Item_Price);
		System.out.println(Item_Image);
		System.out.println(Cart_Size + "\t"+Cart_Color+"\t"+Cart_Taste);
		System.out.println(Cart_Amount);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
