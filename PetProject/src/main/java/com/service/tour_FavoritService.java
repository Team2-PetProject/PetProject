package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.item_FavoritDAO;
import com.dao.tour_FavoritDAO;
import com.dto.item_FavoritDTO;
import com.dto.tour_FavoritDTO;

public class tour_FavoritService {
	tour_FavoritDAO dao;

	public tour_FavoritService() {
		super();
		dao = new tour_FavoritDAO();
	}

	public List<tour_FavoritDAO> getList(String member_code) {
		SqlSession session=MySqlSessionFactory.getSqlSession();
		System.out.println(session);
		List<tour_FavoritDAO> list=null;
		try {
			list=dao.getList(session,member_code);
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}



}
