package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.ItemDAO;
import com.dto.ItemDTO;

public class ItemService {
	ItemDAO dao;

	public ItemService() {
		super();
		dao = new ItemDAO();
	}
	
	public ItemDTO itemRetrieve(String item_code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		ItemDTO dto = null;
		try {
			ItemDAO dao = new ItemDAO();
			dto = dao.itemRetrieve(session, item_code);
		} finally {
			session.close();
		}
		return dto;
	}//end goodsRetrieve
	
}//end class
