package com.controller.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.CartInfoDTO;
import com.dto.MemberDTO;

/**
 * Servlet implementation class CartOrderConfirmServlet_toy
 */
@WebServlet("/CartOrderConfirmServlet_toy")
public class CartOrderConfirmServlet_toy extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartOrderConfirmServlet_toy() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
//		CartInfoDTO dto = new CartInfoDTO(5, "1", "5", "s","red", "소고기맛","1", "food", "더마독 슬리밍 강아지 다이어트 사료", "다이어트 사료 2kg 가수분해 개사료", 
//				33000, "food01", "S/M/L","RED/YELLOW/BLUE","딸기맛/사과맛/소고기맛");
//		
//		MemberDTO dto2 = new MemberDTO("1", "1234", "홍길동","1234" ,"서울시","성수동","010", "1111", "2222", "1111","@naver.com");
//		
//		request.setAttribute("cinfoDTO", dto);
//		request.setAttribute("mDTO", dto2);
//		RequestDispatcher dis = request.getRequestDispatcher("orderConfirm.jsp");
//		dis.forward(request, response);
		
		
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
