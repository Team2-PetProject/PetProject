package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.GoodsDAO;
import com.dto.GoodsDTO;

public class GoodsService {
	GoodsDAO dao;

	public GoodsService() {
		super();
		dao = new GoodsDAO();
	}

	public GoodsDTO goodsRetrieve(String item_code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		GoodsDTO gdto = null;
		try {
			GoodsDAO dao = new GoodsDAO();
			gdto = dao.goodsRetrieve(session, item_code);
		} finally {
			session.close();
		}
		return gdto;
	}//end goodsRetrieve
	
}//end class
