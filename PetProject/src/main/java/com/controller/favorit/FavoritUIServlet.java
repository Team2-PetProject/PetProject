package com.controller.favorit;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.dto.item_FavoriteDTO;
import com.service.item_FavoriteService;
import com.service.tour_FavoriteService;
import com.dto.;


@WebServlet("/FavoritUIServlet")
public class FavoritUIServlet extends HttpServlet {
item_FavoriteService item_service;
tour_FavoriteService tour_service;

	


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session=request.getSession();
		MemberDTO memberdto=(MemberDTO)session.getAttribute("login");
		String member_code=memberdto.getMember_code();
		String nextPage="main";
		
		if (memberdto!=null) {
			List<item_FavoriteDTO> item_list=null;
			List<tour_FavoriteDTO> tour_list=null;
			item_list=item_service.getList();
			
			
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
