package com.controller.Order;

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
import com.dto.MemberDTO;
import com.service.CartService;
import com.service.MemberService;

@WebServlet("/OrderAllServlet")
public class OrderAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public OrderAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO login = (MemberDTO) session.getAttribute("login");
		if(login != null) {
			MemberService mService = new MemberService();
			String memberCode = login.getMember_code();
			MemberDTO dto = mService.selectOne(memberCode);
			request.setAttribute("mDTO", dto);
			
			String[] arr = request.getParameterValues("check");
			List<String> list = Arrays.asList(arr);
			
			CartService service = new CartService();
			List<CartInfoDTO> cartInfoList = service.OrderAll(list);
			request.setAttribute("cinfoList", cartInfoList);
			RequestDispatcher dis = request.getRequestDispatcher("order/orderAllConfirm.jsp");
			dis.forward(request, response);
		} else {
			response.sendRedirect("LoginUIServlet");
			session.setAttribute("mesg", "로그인이 필요한 과정입니다.");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
