package com.controller.favorite;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.dto.OrderHistoryDTO;
import com.service.OrderHistoryService;

@WebServlet("/OrderHistoryServlet")
public class OrderHistoryServlet extends HttpServlet {
	OrderHistoryService service;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session=request.getSession();
//		MemberDTO memberdto=(MemberDTO)session.getAttribute("login");
//		String member_code=memberdto.getMember_code();
//		String nextPage="LoginUIServlet";
//
//		if (memberdto!=null) {
			service=new OrderHistoryService();
			List<OrderHistoryDTO>list=service.getList("111");
			System.out.println(list);
//			List<OrderHistoryDTO>list=service.getList(member_code);
//			request.setAttribute("OrderHistory", list);
//			RequestDispatcher dis=request.getRequestDispatcher(nextPage);
//			dis.forward(request, response);
//		}else {
//			session.setAttribute("mesg", "로그인을 부탁드립니다.");
//			response.sendRedirect(nextPage);
//		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
