package com.controller.member;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class MemberUIServlet
 */
@WebServlet("/MyPageServlet")
public class MyPageServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	      HttpSession session = request.getSession();
	      MemberDTO dto = (MemberDTO)session.getAttribute("login");
		 String nextPage = null;
	      if(dto!=null) {
			  nextPage = "mypage.jsp";
              String member_code = dto.getMember_code();
              
              MemberService service = new MemberService();
              MemberDTO x = service.mypage(member_code);
              session.setAttribute("login", x);
              System.out.println("mypage이동");
	      }else {
			  nextPage = "LoginUIServlet";
			  request.setAttribute("mesg", "로그인이 필요한 작업입니다.");
		  }
	      RequestDispatcher dis =
	    		  request.getRequestDispatcher(nextPage);
	      dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
