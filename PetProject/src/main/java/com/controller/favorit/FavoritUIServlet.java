package com.controller.favorit;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.item_FavoritDTO;
import com.service.item_FavoritService;
import com.service.tour_FavoritService;

@WebServlet("/FavoritUIServlet")
public class FavoritUIServlet extends HttpServlet {
//	item_FavoritService itemService;
//	tour_FavoritService tour_Service;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
//		HttpSession session=request.getSession();
//		MemberDTO memberdto=(MemberDTO)session.getAttribute("login");
//		String member_code=memberdto.getMember_code();
//		String nextPage="main";

//		if (memberdto==null) {
		item_FavoritService service = new item_FavoritService();
		List<item_FavoritDTO> itemList = service.getList("111");
		System.out.println(itemList);
		
	
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
