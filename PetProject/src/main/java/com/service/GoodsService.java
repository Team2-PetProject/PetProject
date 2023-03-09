package com.service;

import com.dao.GoodsDAO;

public class GoodsService {
	GoodsDAO dao;

	public GoodsService() {
		super();
		dao = new GoodsDAO();
	}
	
}
