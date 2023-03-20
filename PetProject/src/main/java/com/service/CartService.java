package com.service;


import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dto.CartDTO;
import com.dto.CartInfoDTO;

public class CartService {
	CartDAO dao;

	public CartService() {
		super();
		dao = new CartDAO();
	}

	public int cartAddselKey(CartDTO cDTO) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n = 0;
		try {
			n= dao.cartAddselKey(session,cDTO);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}//end CartAdd

	public CartInfoDTO selectByCode(int cart_code) {
//	public CartInfoDTO selectByCode() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		CartInfoDTO dto = null;
		try {
			dto = dao.selectByCode(session,cart_code);
//			dto = dao.selectByCode(session);
		}finally {
			session.close();
		}
		return dto;
	}





	
}
