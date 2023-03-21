package com.controller.Cart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartDTO;
import com.dto.MemberDTO;
import com.service.CartService;

@WebServlet("/CartServlet")
public class CartServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public CartServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession();  
		MemberDTO login = (MemberDTO) session.getAttribute("login");
		if(login != null) {
			String memberCode = login.getMember_code();
			String itemCode = (String) request.getAttribute("Item_Code");
			String CartSize = (String) request.getAttribute("Cart_Size");
			String CartColor = (String) request.getAttribute("Cart_Color");
			String CartTaste = (String) request.getAttribute("Cart_Taste");
			String CartAmount = (String) request.getAttribute("Cart_Amount");
			CartDTO dto = new CartDTO(0, memberCode, CartAmount, itemCode, CartSize, CartColor, CartTaste);
			CartService service = new CartService();
			int n = service.insertItem(dto);
			System.out.println(n);
		}else {
			session.setAttribute("mesg", "로그인이 필요한 과정입니다.");
			response.sendRedirect("LoginUIServlet");
		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
