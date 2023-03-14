package com.service;

import com.dao.ItemDAO;

public class ItemService {
	ItemDAO dao;

	public ItemService() {
		super();
		dao = new ItemDAO();
	}
	
}
