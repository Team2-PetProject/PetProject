package com.controller.Cart;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dto.CartInfoDTO;
import com.dto.ItemDTO;
import com.dto.MemberDTO;
import com.service.CartService;
import com.service.ItemService;

@WebServlet("/CartListServlet")
public class CartListServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartListServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//로그인 인증 절차 필요
//		HttpSession session = request.getSession();
//		MemberDTO dto = (MemberDTO) session.getAttribute("login");
//		String nextPage = null;
//		if(dto != null) {
			CartService cService = new CartService();
			List<CartInfoDTO> cartList = cService.cartList(1);
			request.setAttribute("cartList", cartList);
			RequestDispatcher dis = request.getRequestDispatcher("cartList.jsp");
			dis.forward(request, response);
//		}else {
//			nextPage = "";
//		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
