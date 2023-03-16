package com.controller.member;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class MemberUIServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		String member_code = request.getParameter("member_code");
		String member_passwd = request.getParameter("member_passwd");
		HashMap<String, String> map = new HashMap<>();
		map.put("member_code", member_code);
		map.put("member_passwd", member_passwd);
		
		MemberService service = new MemberService();
		MemberDTO dto = service.login(map);
		HttpSession session = request.getSession();
		String nextPage=null;
		if(dto!=null) {
			nextPage = "main.jsp";
			session.setAttribute("login", dto);
			session.setAttribute("mesg", dto.getMember_name()+"님 환영합니다.");
		}else {
			nextPage = "LoginUIServlet"; 
			session.setAttribute("mesg", "아이디 또는 비밀번호가 잘못 입력되었습니다." );
		}

		response.sendRedirect(nextPage);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
