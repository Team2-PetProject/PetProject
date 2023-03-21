package com.controller.order;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.dto.CartDTO;
import com.dto.CartInfoDTO;
import com.dto.MemberDTO;
import com.service.CartService;
import com.service.MemberService;

/**
 * Servlet implementation class CartOrderConfirmServlet
 */
@WebServlet("/CartOrderConfirmServlet")
public class CartOrderConfirmServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CartOrderConfirmServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		/////////////////////
//		HttpSession session = request.getSession();
//		MemberDTO dto = (MemberDTO)session.getAttribute("login");
		String nextPage = null;
//		if(dto!=null) {
			String Member_Code = "1";
//			String Member_Code = dto.getMember_code();
			String Cart_Amount = request.getParameter("Cart_Amount");
			System.out.println("CartOrderConfirmSevlet  Cart_Amount: " + Cart_Amount);
			String Item_Code = request.getParameter("Item_Code");
			System.out.println("CartOrderConfirmSevlet Item_Code : "+Item_Code);
			String Cart_Size = request.getParameter("Cart_Size");
			String Cart_Color = request.getParameter("Cart_Color");
			String Cart_Taste = request.getParameter("Cart_Taste");
			
			CartDTO cDTO = new CartDTO();
			cDTO.setMember_Code(Member_Code);
			cDTO.setCart_Amount(Cart_Amount);
			cDTO.setItem_Code(Item_Code);
			cDTO.setCart_Size(Cart_Size);
			cDTO.setCart_Color(Cart_Color);
			cDTO.setCart_Taste(Cart_Taste);
			
			System.out.println("cDTO "+cDTO);
			
			
			CartService cService = new CartService();
//			System.out.println("등록전 Cart_Code 값: "+cDTO.getCart_Code());  
			int n = cService.cartAddselKey(cDTO);  //상세페이지 주문 =>  카트 저장  //select key 이용 cart_code 얻기
		
//			System.out.println("등록 후 Cart_Code 값: "+cDTO.getCart_Code() +"n값 : " +n);  
			System.out.println("db에서 꺼내온 cartcode들어있는 cDTO: "+cDTO);
			
//			CartInfoDTO cinfoDTO = cService.selectByCode(cDTO.getCart_Code());
			CartInfoDTO cinfoDTO = cService.selectByCode(n);   //n = cDTO.getCart_Code()
//			System.out.println("CartInfoDTO  : "+cinfoDTO);
			
			MemberService mService = new MemberService();
			MemberDTO mDTO = mService.mypage(Member_Code);
			
			request.setAttribute("cinfoDTO", cinfoDTO);  //상품 주문 정보
			request.setAttribute("mDTO", mDTO);  //고객 정보
			
			nextPage = "orderConfirm.jsp";
			
//		}else {
//			nextPage = "LoginUIServlet";
//			session.setAttribute("mesg", "로그인이 필요한 작업입니다.");
//		}
		
		RequestDispatcher dis = request.getRequestDispatcher(nextPage);
		dis.forward(request, response);
		
	}//end doGet

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}