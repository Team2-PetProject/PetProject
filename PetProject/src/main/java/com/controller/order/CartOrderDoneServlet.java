package com.controller.order;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.OrderInfoDTO;
import com.dto.OrderItemDTO;
import com.service.OrderService;

/**
 * Servlet implementation class CartOrderDoneServlet
 */
@WebServlet("/CartOrderDoneServlet")
public class CartOrderDoneServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		HttpSession session = request.getSession();
//		MemberDTO dto = (MemberDTO)session.getAttribute("login");
//		String nextPage = null;
//		if(dto!=null) {
			//회원전용 처리 
//			String Member_Code = dto.getMember_code();
			String Member_Code = request.getParameter("Member_Code");  //테스트 용
			String orderName = request.getParameter("orderName");
			String post = request.getParameter("post");
			String addr1 = request.getParameter("addr1");
			String addr2 = request.getParameter("addr2");
			String phone = request.getParameter("phone");
			String payMethod = request.getParameter("payMethod");
			int OrderInfo_Delivery = Integer.parseInt(request.getParameter("delivery")) ;
			
			
			//주문번호 생성
			//1. 4자리 난수 생성
			Random random = new Random();
			int createNum = 0;
			String ranNum = "";
			int letter = 4;
			String resultNum="";
			
			for (int i = 0; i < letter; i++) {
				createNum = random.nextInt(10);
				ranNum = Integer.toString(createNum);
				resultNum += ranNum;
			}
			
			System.out.println(resultNum);
			
			//2. 주문날짜
			Date date = new Date();
			SimpleDateFormat format = new SimpleDateFormat("YYMMdd");
			
			String OrderInfo_Code = format.format(date)+resultNum;
			System.out.println(OrderInfo_Code);
			
			
			//OrderInfo insert
			OrderInfoDTO oinfoDTO = new OrderInfoDTO(OrderInfo_Code, Member_Code, orderName, post, addr1, addr2, phone, payMethod, null,OrderInfo_Delivery); 
			
			System.out.println("CartOrderDoneservlet: infoDTO "+oinfoDTO);

			

			String Item_Code = request.getParameter("Item_Code");
			int Cart_Amount = Integer.parseInt(request.getParameter("Cart_Amount")) ;
			int Item_Price = Integer.parseInt(request.getParameter("Item_Price"));
			String Item_Image = request.getParameter("Item_Image");
			String Item_Name = request.getParameter("Item_Name");
			String Cart_Size = request.getParameter("Cart_Size");
			String Cart_Color = request.getParameter("Cart_Color");
			String Cart_Taste = request.getParameter("Cart_Taste"); 
			
			
			//OrderItem insert
			OrderItemDTO oitemDTO = new OrderItemDTO(0, Item_Code, OrderInfo_Code, Member_Code, orderName, Cart_Amount, Item_Price, Item_Image, Item_Name, Cart_Size, Cart_Color, Cart_Taste);
			System.out.println("CartOrderDoneservlet: oitemDTO "+oitemDTO);
			
			
			//Cart delete
			int Cart_Code = Integer.parseInt(request.getParameter("Cart_Code")) ;
			
			OrderService oService = new OrderService();
			
			int n = oService.orderDone(oinfoDTO,oitemDTO,Cart_Code);  //트랜잭션 처리
			System.out.println("CartOrderDoneServlet commit 된 갯수: "+n);
			
			
			oinfoDTO = oService.selByinfoCode(OrderInfo_Code);
			System.out.println("jsp로 넘어갈 oinfoDTO "+ oinfoDTO);
			
			
			oitemDTO = oService.selByCode(OrderInfo_Code);
			System.out.println("jsp로 넘어갈 oitemDTO "+ oitemDTO);
			
			
			request.setAttribute("oinfoDTO", oinfoDTO);
			request.setAttribute("oitemDTO", oitemDTO);
			
			RequestDispatcher dis = request.getRequestDispatcher("orderDone.jsp");
			dis.forward(request, response);
//			nextPage = "orderDone.jsp";
//		
//		}else {
//			nextPage ="LoginUIServlet";
//			session.setAttribute("mesg", "로그인이 필요한 작업입니다.");
//		}
//		
//		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
//		dis.forward(request, response);
		
		
	
	}//end doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
