package com.service;

import com.dao.ItemFavoritDAO;

public class ItemFavoritService {
	ItemFavoritDAO dao;

	public ItemFavoritService() {
		super();
		dao = new ItemFavoritDAO();
	}
	
}
