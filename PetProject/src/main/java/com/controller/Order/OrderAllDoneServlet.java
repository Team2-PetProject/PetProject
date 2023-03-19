package com.controller.Order;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.CartInfoDTO;
import com.dto.OrderInfoDTO;
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
//		HttpSession session = request.getSession();
//		MemberDTO dto = (MemberDTO) session.getAttribute("login");
//		if(dto != null) {
//			String memberCode = dto.getMember_code();
			String[] cartCode = request.getParameterValues("orderNum");
			String orderName = request.getParameter("orderName");
			String post = request.getParameter("post");
			String addr1 = request.getParameter("addr1");
			String addr2 = request.getParameter("addr2");
			String phone = request.getParameter("phone");
			String payMethod = request.getParameter("payMethod");
			String delivery = request.getParameter("delivery");
			
			//주문번호 생성
            //1. 4자리 난수 생성
            

			
			OrderInfoDTO OrderInfoDTO = new OrderInfoDTO(1, "1", orderName, post, addr1, addr2, phone, payMethod, "", Integer.parseInt(delivery));
			
			List<String> cList = Arrays.asList(cartCode);
			CartService cService = new CartService();
			List<CartInfoDTO> list = cService.OrderAll(cList);
			OrderService oService = new OrderService();
			int n = oService.orderAllDone(cList, list, OrderInfoDTO);
			System.out.println(n);
			
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
