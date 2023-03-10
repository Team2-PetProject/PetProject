package com.controller.member;

import java.io.IOException;

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
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/MemberIdSearchServlet")
public class MemberIdSearchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String member_name = request.getParameter("member_name").trim();
		 String member_phone1 = request.getParameter("member_phone1").trim();
		 String member_phone2 = request.getParameter("member_phone2").trim();
		 String member_phone3 = request.getParameter("member_phone3").trim();
		 String member_email1 = request.getParameter("member_email1").trim();
		 String member_email2 = request.getParameter("member_email2").trim();
		 
		 MemberDTO dto = new MemberDTO();
		 dto.setMember_name(member_name);
		 dto.setMember_phone1(member_phone1);
		 dto.setMember_phone2(member_phone2);
		 dto.setMember_phone3(member_phone3);
		 
		 MemberService service = new MemberService();
		 String member_code = service.idSearch(dto);
		 String nextPage = null;
		 if(member_code==null) {
			 nextPage="MemberIdSearchUIServlet";
			 request.setAttribute("mesg", "이름 또는 핸드폰이 등록되지 않은 정보");
		 }else {
			 nextPage="SendMailServlet";
			 request.setAttribute("mailTo", member_email1+"@"+member_email2);
			 request.setAttribute("member_code", member_code);
		 }
		 RequestDispatcher dis =
				 request.getRequestDispatcher(nextPage);
		 dis.forward(request, response);
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
