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

import com.service.MemberService;

/**
 * Servlet implementation class PwUpdateServlet
 */
@WebServlet("/PwUpdateServlet")
public class PwUpdateServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PwUpdateServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("PwUpdateServlet 입니다.");
		
		HttpSession session = request.getSession();
		String Member_code = (String)session.getAttribute("Member_code");
		String Member_passwd = request.getParameter("pw");
		System.out.println("PwUpdateServlet  Member_code "+ Member_code);
		System.out.println("PwUpdateServlet  pw "+ Member_passwd);
		
		MemberService service = new MemberService();
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("Member_code", Member_code);
		map.put("Member_passwd", Member_passwd);
		int n = service.pwUpdate(map);
		System.out.println("PwUpdateServlet update 갯수 : "+ n);
		
		session.removeAttribute("Member_code");
		session.setAttribute("pwUdmesg", "비밀번호가 변경되었습니다");
		
		
//		RequestDispatcher dis = request.getRequestDispatcher("LoginUIServlet");
//		dis.forward(request, response);
		
		
		
		
		
		response.sendRedirect("LoginUIServlet");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
