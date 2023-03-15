package com.service;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.tour_FavoriteDAO;
import com.dto.tour_FavoriteDTO;

public class tour_FavoriteService {
	tour_FavoriteDAO dao;

	public tour_FavoriteService() {
		super();
		dao = new tour_FavoriteDAO();
	}

	public List<tour_FavoriteDTO> getList(String member_code) {
		SqlSession session=MySqlSessionFactory.getSqlSession();
		dao=new tour_FavoriteDAO();
		List<tour_FavoriteDTO> list = null;
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
