package com.service;

import com.dao.OrderInfoDAO;

public class OrderInfoService {
	OrderInfoDAO dao;

	public OrderInfoService() {
		super();
		dao = new OrderInfoDAO();
	}
	
}
