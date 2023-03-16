package com.service;

import com.dao.OrderDAO;

public class OrderService {
	OrderDAO dao;

	public OrderService() {
		super();
		dao = new OrderDAO();
	}
	
	
}
