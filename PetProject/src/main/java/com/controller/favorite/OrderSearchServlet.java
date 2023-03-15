package com.controller.favorite;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.OrderHistoryDTO;
import com.service.OrderHistoryService;

@WebServlet("/OrderSearchServlet")
public class OrderSearchServlet extends HttpServlet {
	OrderHistoryService service;

	public OrderSearchServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		int num=request.getParameter("orderDay");
		service = new OrderHistoryService();
		String curPage = request.getParameter("curPage");
		if (curPage == null) {
			curPage="1";
		}
//		if (num == 0 || 7) {
//		List<OrderHistoryDTO> list1 = service.getOredrDay(num);
//		List<OrderHistoryDTO> list1 = service.getOredrDay(7);
//		} else if (num == 1 || 6) {
//		List<OrderHistoryDTO> list2 = service.getOredrMonth(num);
		List<OrderHistoryDTO> list2 = service.getOredrMonth(6);
		System.out.println(list2);
//		} else {
//		List<OrderHistoryDTO> list3 = service.getOredrTerm(num);
//		List<OrderHistoryDTO> list3 = service.getOredrTerm("20200101","20200101");
//		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
