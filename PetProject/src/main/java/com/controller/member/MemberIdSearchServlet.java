package com.controller.member;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.MemberDTO;
import com.service.MemberService;

/**
 * Servlet implementation class MemberUpdateServlet
 */
@WebServlet("/MemberIdSearchServlet")
public class MemberIdSearchServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		 String member_name = request.getParameter("name").trim();
		 String member_phone1 = request.getParameter("phone1").trim();
		 String member_phone2 = request.getParameter("phone2").trim();
		 String member_phone3 = request.getParameter("phone3").trim();
		 
		 MemberDTO dto = new MemberDTO();
		 dto.setMember_name(member_name);
		 dto.setMember_phone1(member_phone1);
		 dto.setMember_phone2(member_phone2);
		 dto.setMember_phone3(member_phone3);
		 
		 MemberService service = new MemberService();
		 String member_code = service.idSearch(dto);
		 String mesg = "";
		 if(member_code==null) {
			 mesg = "가입되어 있지 않습니다.";
		 }else {
			 mesg = "아이디는 " + member_code + "입니다.";
		 }
		 response.setContentType("text/html;charset=UTF-8");
		 PrintWriter out = response.getWriter();
		 out.print(mesg);
		 
		 
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
