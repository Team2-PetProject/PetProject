package com.controller.favorit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;

@WebServlet("/FavoritUIServlet")
public class FavoritUIServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		MemberDTO mdto=(MemberDTO)session.getAttribute("login");
		String nextPage="main";
		if (mdto!=null) {
			
		}else {
			session.setAttribute("mesg", "로그인을 부탁드립니다.");
			nextPage="LoginUIServlet";
		}
		response.sendRedirect(nextPage);
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
