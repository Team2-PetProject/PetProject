package com.service;

import com.dao.CartDAO;

public class OrderItemService {
	CartDAO dao;

	public OrderItemService() {
		super();
		dao = new CartDAO();
	}
	
}
