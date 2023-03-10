package com.service;

import java.util.List;

import com.dao.tour_FavoriteDAO;
import com.dto.tour_FavoritDTO;

public class tour_FavoriteService {
	tour_FavoriteDAO dao;

	public tour_FavoriteService() {
		super();
		dao = new tour_FavoriteDAO();
	}

	public List<tour_FavoritDTO> getList() {
		// TODO Auto-generated method stub
		return null;
	}

}
