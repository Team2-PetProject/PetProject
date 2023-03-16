package com.service;

import com.dao.OrderItemDAO;

public class OrderItemService {
	OrderItemDAO dao;

	public OrderItemService() {
		super();
		dao = new OrderItemDAO();
	}
	
}
