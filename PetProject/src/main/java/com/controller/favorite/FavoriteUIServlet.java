package com.controller.favorite;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Set;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.item_FavoriteDTO;
import com.dto.tour_FavoriteDTO;
import com.service.item_FavoriteService;
import com.service.tour_FavoriteService;

@WebServlet("/FavoriteUIServlet")
public class FavoriteUIServlet extends HttpServlet {
	item_FavoriteService item_Service;
	tour_FavoriteService tour_Service;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
//		MemberDTO memberdto=(MemberDTO)session.getAttribute("login");
//		String member_code=memberdto.getMember_code();
		String nextPage="LoginUIServlet";

//		if (memberdto!=null) {
//		List<tour_FavoriteDTO> tourList = tour_Service.getList(member_code);
//		List<item_FavoriteDTO> itemList = item_Service.getList(member_code);
		
		item_Service = new item_FavoriteService();
		tour_Service = new tour_FavoriteService();
		List<tour_FavoriteDTO> tourList = tour_Service.getList("111");
		List<item_FavoriteDTO> itemList = item_Service.getList("111");
		HashMap<Integer, item_FavoriteDTO> itemMap= new HashMap<Integer,item_FavoriteDTO>();
		HashMap<Integer, tour_FavoriteDTO> tourMap= new HashMap<Integer, tour_FavoriteDTO>();	
		for (int i = 0; i < itemList.size(); i++) {
			itemMap.put(i, itemList.get(i));
		}
		for (int i = 0; i < tourList.size(); i++) {
			tourMap.put(i, tourList.get(i));
		}
		Set<Integer> keySet=itemMap.keySet();
		for (Integer key : keySet) {
			System.out.println(key+":"+ itemMap.get(key));
		}
		Set<Integer> keySet2=tourMap.keySet();
		for (Integer key : keySet2) {
			System.out.println(key+":"+ tourMap.get(key));
		}
//		request.setAttribute("item_Favorite", itemMap);	
//		request.setAttribute("tour_Favorite", tourMap);
//		RequestDispatcher dis=request.getRequestDispatcher(nextPage);
//		dis.forward(request, response);
		
//		}else {
//			session.setAttribute("mesg", "로그인을 부탁드립니다.");
//			response.sendRedirect(nextPage);
//		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
