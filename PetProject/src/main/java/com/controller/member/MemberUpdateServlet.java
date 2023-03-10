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
 * Servlet implementation class MemberUIServlet
 */
@WebServlet("/MemberUpdateServlet")
public class MemberUpdateServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		HttpSession session = request.getSession();
		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String nextPage=null;
	if(dto!=null) {
			request.setCharacterEncoding("utf-8");//한글처리 
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
			MemberDTO dto2 =
					new MemberDTO(member_code, member_passwd, member_name, member_post, 
							member_addr1, member_addr2, member_phone1, member_phone2, member_phone3, member_email1, member_email2);			
			MemberService service = new MemberService();
			int num = service.memberUpdate(dto2);
			nextPage = "main";
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
