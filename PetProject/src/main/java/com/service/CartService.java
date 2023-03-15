package com.service;

import com.dao.CartDAO;

public class CartService {
	CartDAO dao;

	public CartService() {
		super();
		dao = new CartDAO();
	}
	
}
