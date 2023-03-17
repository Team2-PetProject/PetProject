package com.service;

import com.dao.TourFavoriteDAO;

public class TourFavoriteService {
	TourFavoriteDAO dao;

	public TourFavoriteService() {
		super();
		dao = new TourFavoriteDAO();
	}
	
}
