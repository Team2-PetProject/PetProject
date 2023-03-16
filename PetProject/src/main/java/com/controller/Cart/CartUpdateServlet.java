package com.controller.Cart;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.CartService;

@WebServlet("/CartUpdateServlet")
public class CartUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 여부 확인
//		HttpSession session = request.getSession();
//		MemberDTO login = (MemberDTO) session.getAttribute("login");
//		if(login != null) {
//			String memberCode = login.getMember_code();
			int cartCode = Integer.parseInt(request.getParameter("num"));
			int cartAmount = Integer.parseInt(request.getParameter("amount"));
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("memberCode", 1);
			map.put("cartCode", cartCode);
			map.put("cartAmount", cartAmount);
			
			CartService service = new CartService();
			int n = service.updateAmount(map);
			System.out.println("update 된 레코드 갯수 : " + n);
			response.sendRedirect("CartListServlet");
//		}else {
//			
//		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
