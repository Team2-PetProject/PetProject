package com.service;

import com.dao.TourDAO;

public class TourService {
	TourDAO dao;

	public TourService() {
		super();
		dao = new TourDAO();
	}
	
}
