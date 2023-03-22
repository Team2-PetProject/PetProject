package com.controller.main;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.dto.ItemDTO;
import com.dto.OrderItemDTO;
import com.service.ItemService;
import com.service.OrderService;

@WebServlet("/main")
public class MainServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public MainServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ItemService service = new ItemService();
		List<ItemDTO> list = service.selectNew();
		request.setAttribute("newList", list);
		
		OrderService oService = new OrderService();
		List<String> itemCodeList = oService.selectBest();
		List<ItemDTO> bestList = service.selectBest(itemCodeList);
		request.setAttribute("bestList", bestList);
		RequestDispatcher dis = request.getRequestDispatcher("main.jsp");
		dis.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
