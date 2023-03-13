package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.item_FavoritDAO;
import com.dto.item_FavoritDTO;

public class item_FavoritService {
item_FavoritDAO dao;


	public List<item_FavoritDTO> getList(String member_code) {
		System.out.println("서비스접속");
		SqlSession session=MySqlSessionFactory.getSqlSession();
		System.out.println(session);
		List<item_FavoritDTO> list=null;
		try {
			list=dao.getList(session,member_code);
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	public item_FavoritService() {
		SqlSession session=MySqlSessionFactory.getSqlSession();
		System.out.println(session);
	}
	
	
}
