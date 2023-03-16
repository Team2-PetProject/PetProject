package com.controller.Order;

import java.io.IOException;
import java.util.Arrays;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartInfoDTO;
import com.dto.MemberDTO;
import com.dto.OrderInfoDTO;
import com.service.CartService;

@WebServlet("/OrderAllDoneServlet")
public class OrderAllDoneServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OrderAllDoneServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		HttpSession session = request.getSession();
//		MemberDTO dto = (MemberDTO) session.getAttribute("login");
//		if(dto != null) {
//			String memberCode = dto.getMember_code();
			String[] cartCode = request.getParameterValues("orderNum");
			String orderName = request.getParameter("mname");
			String post = request.getParameter("mpost");
			String addr1 = request.getParameter("maddress1");
			String addr2 = request.getParameter("maddress2");
			String phone = request.getParameter("phone");
			String email1 = request.getParameter("memail");
			String payMethod = request.getParameter("payMethod");
			String delivery = request.getParameter("delivery");
			OrderInfoDTO OrderInfoDTO = new OrderInfoDTO(0, "1", orderName, post, addr1, addr2, phone, payMethod, "", Integer.parseInt(delivery));
			
			List<String> cList = Arrays.asList(cartCode);
			CartService cService = new CartService();
			List<CartInfoDTO> list = cService.OrderAll(cList);
			
			
			
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
