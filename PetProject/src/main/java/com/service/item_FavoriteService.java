package com.service;

import java.util.List;

import com.dao.item_FavoriteDAO;
import com.dto.item_FavoriteDTO;

public class item_FavoriteService {
	item_FavoriteDAO dao;

	public item_FavoriteService() {
		super();
		dao = new item_FavoriteDAO();
	}

	public List<item_FavoriteDTO> getList() {
		// TODO Auto-generated method stub
		return null;
	}
	
	
}
