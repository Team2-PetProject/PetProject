package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;
import com.dto.CartInfoDTO;

public class CartDAO {

	public int cartAdd(SqlSession session, CartDTO cDTO) {
		int n = session.insert("CartMapper.cartAdd",cDTO);
		return n;
	}//end cartAdd

	public CartInfoDTO selectByCode(SqlSession session, int cart_code) {
		CartInfoDTO dto = session.selectOne("CartMapper.selectByCode",cart_code);
		return dto;
	}

	

}
