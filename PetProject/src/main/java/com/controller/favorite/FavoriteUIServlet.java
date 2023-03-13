package com.controller.favorite;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.item_FavoriteDTO;
import com.service.item_FavoriteService;
import com.service.tour_FavoriteService;

@WebServlet("/FavoriteUIServlet")
public class FavoriteUIServlet extends HttpServlet {
	item_FavoriteService itemService;
//	tour_FavoritService tour_Service;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		HttpSession session=request.getSession();
//		MemberDTO memberdto=(MemberDTO)session.getAttribute("login");
//		String member_code=memberdto.getMember_code();
//		String nextPage="main";

//		if (memberdto==null) {
		item_FavoriteService service = new item_FavoriteService();
		List<item_FavoriteDTO> itemList = service.getList("111");
		System.out.println(itemList);
//		System.out.println(service);
		
	
//		List<tour_FavoritDTO> tour_list=tour_Service.getList(member_code);
//		List<tour_FavoritDTO> tourList=tour_Service.getList("111");
//		System.out.println(tourList);
//			ArrayList<FavoritDTO> list= new ArrayList<FavoritDTO>();
//			list.add((FavoritDTO) tour_list);
//			list.add((FavoritDTO) item_list);
//			HashMap<Integer, List<FavoritDTO>> favorit=new HashMap<Integer, List<FavoritDTO>>();
//			for (int i = 0; i < item_list.size(); i++) {
//				favorit.put(i, item_list);
//			}
//			for (int i =item_list.size()+1; i < tour_list.size(); i++) {
//				favorit.put(i, tour_list);
//			}
//			
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
