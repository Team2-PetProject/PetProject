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

@WebServlet("/CartUpdateOptServlet")
public class CartUpdateOptServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartUpdateOptServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 여부 확인
//		HttpSession session = request.getSession();
//		MemberDTO login = (MemberDTO) session.getAttribute("login");
//		if(login != null) {
//			String memberCode = login.getMember_code();
			int cartCode = Integer.parseInt(request.getParameter("cartCode"));
			String key = (String) request.getParameter("key");
			String value = (String) request.getParameter("value");
			Map<String, Object> map = new HashMap<String, Object>();
			map.put("memberCode", 1);
			map.put("cartCode", cartCode);
			map.put("key", key);
			map.put("value", value);
			System.out.println(map);
			
			CartService service = new CartService();
			int n = service.updateOption(map);
			System.out.println("update 된 레코드 갯수 : " + n);
//		}else {
//			
//		}
		
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
