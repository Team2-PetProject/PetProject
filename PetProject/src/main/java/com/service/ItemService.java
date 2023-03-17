package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.ItemDAO;
import com.dto.ItemDTO;

public class ItemService {
	
	public List<ItemDTO> ItemList(String item_Category) {

		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<ItemDTO> list = null;
		try {
			ItemDAO dao = new ItemDAO();
			 list = dao.ItemList(session, item_Category);
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			session.close();
		}
		return list;
	}
}
