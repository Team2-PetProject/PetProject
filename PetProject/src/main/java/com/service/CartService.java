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

	public int cartAdd(CartDTO cDTO) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n = 0;
		try {
			n= dao.cartAdd(session,cDTO);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}//end CartAdd

	public CartInfoDTO selectByCode(int cart_code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		CartInfoDTO dto = null;
		try {
			dto = dao.selectByCode(session,cart_code);
		}finally {
			session.close();
		}
		return dto;
	}

	public CartDTO selectBymaxCart(String member_Code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		CartDTO dto = null;
		try {
			dto = dao.selectBymaxCart(session,member_Code);
		}finally {
			session.close();
		}
		return dto;
	}



	
}
