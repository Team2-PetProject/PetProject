package com.controller.favorite;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
//		HttpSession session=request.getSession();
//		MemberDTO memberdto=(MemberDTO)session.getAttribute("login");
//		String member_code=memberdto.getMember_code();
//		String nextPage="main";

//		if (memberdto==null) {
//		item_FavoriteService itemService = new item_FavoriteService();
//		tour_FavoriteService tourService = new tour_FavoriteService();
		item_Service = new item_FavoriteService();
		tour_Service = new tour_FavoriteService();
//		List<item_FavoriteDTO> itemList = itemService.getList("111");
//		List<tour_FavoriteDTO> tourList = tourService.getList("111");
		List<item_FavoriteDTO> itemList = item_Service.getList("111");
		List<tour_FavoriteDTO> tourList = tour_Service.getList("111");
		HashMap<Integer, Object> map= new HashMap<Integer, Object>();
		System.out.println(itemList.size());
			for (int i = 0; i < itemList.size(); i++) {
				map.put(i,itemList);
				for (int j = itemList.size()+1; j < itemList.size()+tourList.size(); j++) {
					map.put(j, tourList);
				}
			}
			Set set=map.keySet();
			Iterator<Integer> keys=map.keySet().iterator();
			while (keys.hasNext()){
				int key=keys.next();
				System.out.println(key);
			}
//			
//		}else {
//			session.setAttribute("mesg", "로그인을 부탁드립니다.");
//			nextPage="LoginUIServlet";
//		}
//		response.sendRedirect(nextPage);

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
