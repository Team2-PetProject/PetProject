package com.controller.favorite;

import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.MemberDTO;
import com.dto.OrderHistoryDTO;
import com.page.OrderHistoryPage;
import com.service.OrderHistoryService;

@WebServlet("/OrderSearchServlet")
public class OrderSearchServlet extends HttpServlet {
	OrderHistoryService service;
	OrderHistoryPage page;
	public OrderSearchServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session=request.getSession();
//		MemberDTO memberdto=(MemberDTO)session.getAttribute("login");
//		String member_code=memberdto.getMember_code();
		String member_code="111";
		service = new OrderHistoryService();
		page = new OrderHistoryPage(); 
		String startDay = request.getParameter("startDay");
		String endDay = request.getParameter("endDay");
		String curPage = request.getParameter("curPage");
		String item_name = request.getParameter("itemName");
		String perPage=page.getPerPage();
		
		Map<String	, String> orderDayMap 	= new HashMap<String, String>();
		
		int totalCount= service.totalCount(member_code);
		//게시글 총 숫자 =201
		
		int num=page.setTotalCount(totalCount);
		//201

		int totalPage=page.getTotalPage();
		//21페이지
		orderDayMap.put("startDay", startDay);
		orderDayMap.put("endDay", endDay);
		orderDayMap.put("member_code", member_code);
	
		request.setAttribute("totalPage", totalPage);

		if (curPage == null) {
			curPage = "1";
			int start_page = ((Integer.parseInt(curPage)- 1 ) * Integer.parseInt(perPage) + 1);
			//페이지 시작 게시글
			String startPage=Integer.toString(start_page);
			//1 나올수있다
			String endPage=Integer.toString((start_page+Integer.parseInt(perPage)-1));
			System.out.println("if문 안 endPage 페이지 종료 게시글" + endPage);
			//페이지 종료 게시글 그런데 1? 10나와야하는뎅
			orderDayMap.put("perPage", perPage);
			orderDayMap.put("startPage", startPage);
			orderDayMap.put("endPage", endPage);
			//여기에 넣어주는 이유는 perPage는 맨처음 null이기때문이다. 여기서 설정안하면 History에서 설정잡아주면될듯.
			
			if (item_name == null) {
				
				List<OrderHistoryDTO> list = service.getOredrDay(orderDayMap);
				System.out.println(list.size());
				System.out.println("이건 그냥 버튼 클릭 조회입니다." + list);
				
			}else if(item_name!=null) {
				
				orderDayMap.put("item_name", item_name);
				List<OrderHistoryDTO> list = service.getOredrItem(orderDayMap);
				System.out.println(list.size());
				System.out.println("이건 이름 조회입니다." + list);
				
			}

		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
