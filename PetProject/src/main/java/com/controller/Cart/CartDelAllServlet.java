package com.controller.Cart;

import java.io.IOException;
import java.util.Arrays;
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
//		if(login != null) {
			String[] str = request.getParameterValues("check");
			List<String> list = Arrays.asList(str);
			
			CartService service = new CartService();
			int n = service.delAll(list);
			response.sendRedirect("CartListServlet");
//		} else {
//			
//		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
