package com.service;


import java.util.List;

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

	public List<ItemDTO> selectNew() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<ItemDTO> list = null;
		try {
			list = dao.selectNew(session);
		} finally {
			session.close();
		}
		return list;
	}

	public List<ItemDTO> selectBest(List<String> itemCodeList) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<ItemDTO> list = null;
		try {
			list = dao.selectBest(session, itemCodeList);
		} finally {
			session.close();
		}
		return list;
	}

	
	
}//end class
