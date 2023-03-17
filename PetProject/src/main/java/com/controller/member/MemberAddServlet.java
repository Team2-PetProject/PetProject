package com.controller.member;

import java.io.IOException;

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
@WebServlet("/MemberAddServlet")
public class MemberAddServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		String member_code = request.getParameter("member_code");
		String member_passwd = request.getParameter("member_passwd");
		String member_name = request.getParameter("member_name");
		String member_post = request.getParameter("member_post");
		String member_addr1 = request.getParameter("member_addr1");
		String member_addr2 = request.getParameter("member_addr2");
		String member_phone1 = request.getParameter("member_phone1");
		String member_phone2 = request.getParameter("member_phone2");
		String member_phone3 = request.getParameter("member_phone3");
		String member_email1 = request.getParameter("member_email1");
		String member_email2 = request.getParameter("member_email2");
		System.out.println(member_post);
		MemberDTO dto =
				new MemberDTO(member_code, member_passwd, member_name, member_post, 
						member_addr1, member_addr2, member_phone1, member_phone2, member_phone3, member_email1, member_email2);
		
		MemberService service = new MemberService();
		int n = service.memberAdd(dto);
		
		HttpSession session = request.getSession();
		session.setAttribute("memberAdd", "회원가입성공");
		session.setMaxInactiveInterval(3600);
		response.sendRedirect("main.jsp");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
