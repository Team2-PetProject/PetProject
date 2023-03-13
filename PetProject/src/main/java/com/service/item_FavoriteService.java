package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.item_FavoriteDAO;
import com.dto.item_FavoriteDTO;

public class item_FavoriteService {



	public List<item_FavoriteDTO> getList(String member_code) {
		System.out.println("서비스");
		SqlSession session=MySqlSessionFactory.getSqlSession();
		System.out.println(session);
		item_FavoriteDAO dao=new item_FavoriteDAO();
		List<item_FavoriteDTO> list=null;
		try {
			list=dao.getList(session,member_code);
		} catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}

	public item_FavoriteService() {
		SqlSession session=MySqlSessionFactory.getSqlSession();
		System.out.println(session);
	}
	
	
}
