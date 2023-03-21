package com.controller.Cart;

import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.CartService;

@WebServlet("/CartDelAllServlet")
public class CartDelAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartDelAllServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();
		MemberDTO login = (MemberDTO) session.getAttribute("login");
		String nextPage = "";
		if(login != null) {
			String memberCode = login.getMember_code();
			String[] str = request.getParameterValues("check");
			List<String> list = Arrays.asList(str);
			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("memberCode", memberCode);
			map.put("list", list);
			
			CartService service = new CartService();
			int n = service.delAll(map);
			nextPage = "CartListServlet";
			session.setAttribute("mesg", n + "개의 상품이 삭제되었습니다.");
		} else { 
			nextPage = "LoginUIServlet";
			session.setAttribute("mesg", "로그인이 필요한 과정입니다.");
		}
		response.sendRedirect(nextPage);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
