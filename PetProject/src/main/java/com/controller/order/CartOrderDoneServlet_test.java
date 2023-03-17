package com.controller.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.OrderInfoDTO;
import com.dto.OrderItemDTO;

/**
 * Servlet implementation class CartOrderDoneServlet_test
 */
@WebServlet("/CartOrderDoneServlet_test")
public class CartOrderDoneServlet_test extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartOrderDoneServlet_test() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		OrderInfoDTO oinfoDTO = new OrderInfoDTO("2303171515","1","홍길동","1234","서울시","성수동","01011112222","신용카드","2023-03-17 15:31:49",0);
		OrderItemDTO oitemDTO = new OrderItemDTO(22,"1","2303171515","1","홍길동",5,33000,"food01","더마독 슬리밍 강아지 다이어트 사료","s","red","소고기맛");
		
		request.setAttribute("oinfoDTO", oinfoDTO);
		request.setAttribute("oitemDTO", oitemDTO);
		
		RequestDispatcher dis = request.getRequestDispatcher("orderDone.jsp");
		dis.forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
