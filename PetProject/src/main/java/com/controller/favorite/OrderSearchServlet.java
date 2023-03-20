package com.controller.favorite;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
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
		HttpSession session=request.getSession();
//		MemberDTO memberdto=(MemberDTO)session.getAttribute("login");
//		String member_code=memberdto.getMember_code();
		String member_code="111";
		service = new OrderHistoryService();
		String startDay = request.getParameter("startDay");
		String endDay = request.getParameter("endDay");
		String item_name = request.getParameter("itemName");
		System.out.println("orderSearch" + startDay);
		System.out.println("orderSearch" + endDay);
		System.out.println("orderSearch" + item_name);
		Map<String	, String> orderDayMap 	= new HashMap<String, String>();
		orderDayMap.put("startDay", startDay);
		orderDayMap.put("endDay", endDay);
		orderDayMap.put("member_code", member_code);
		String curPage = request.getParameter("curPage");

		if (curPage == null) {
			curPage = "1";
			if (item_name == null) {
				List<OrderHistoryDTO> list = service.getOredrDay(orderDayMap);
				System.out.println(list);
				for (int i = 0; i < 10; i++) {
					System.out.println(list);
				}
			}else {
				
			}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
