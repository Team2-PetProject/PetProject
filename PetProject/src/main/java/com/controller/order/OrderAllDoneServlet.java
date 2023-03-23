package com.controller.order;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartInfoDTO;
import com.dto.DeliveryInfoDTO;
import com.dto.MemberDTO;
import com.dto.OrderInfoDTO;
import com.dto.OrderItemDTO;
import com.service.CartService;
import com.service.OrderService;

@WebServlet("/OrderAllDoneServlet")
public class OrderAllDoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OrderAllDoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO) session.getAttribute("login");
		if(dto != null) {
			String memberCode = dto.getMember_code();
			String[] cartCode = request.getParameterValues("orderNum");
			String orderName = request.getParameter("orderName");
			String post = request.getParameter("post");
			String addr1 = request.getParameter("addr1");
			String addr2 = request.getParameter("addr2");
			String phone = request.getParameter("phone");
			String payMethod = request.getParameter("payMethod");
			String delivery = request.getParameter("delivery");  
			
			OrderInfoDTO OrderInfoDTO = new OrderInfoDTO(0, "1", orderName, post, addr1, addr2, phone, payMethod, "", Integer.parseInt(delivery));
			
			List<String> cList = Arrays.asList(cartCode);
			CartService cService = new CartService();
			List<CartInfoDTO> list = cService.OrderAll(cList);
			OrderService oService = new OrderService();
			DeliveryInfoDTO dDTO = new DeliveryInfoDTO(0, "배송전", "ACompany", "12345", "2022-03-21", "2022-03-22", 0);
			int n = oService.orderAllDone(memberCode, cList, list, OrderInfoDTO, dDTO);
			System.out.println(n);
			
			OrderInfoDTO oDTO = oService.selByinfoCode(n);
			System.out.println(oDTO);
			List<OrderItemDTO> oList = oService.selAllByinfoCode(n);
			for (OrderItemDTO orderItemDTO : oList) {
				System.out.println(orderItemDTO);
			}
			RequestDispatcher dis = request.getRequestDispatcher("orderAllDone.jsp");
			request.setAttribute("oinfoDTO", oDTO);
			request.setAttribute("oitemList", oList);
			dis.forward(request, response);
		}else {
			response.sendRedirect("LoginUIServlet");
			session.setAttribute("mesg", "로그인이 필요한 과정입니다.");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}