package com.dao;




import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;
import com.dto.CartInfoDTO;

public class CartDAO {

	public int cartAddselByKey(SqlSession session, CartDTO cDTO) {
		int n = session.insert("CartMapper.cartAdd",cDTO);
		return n;
	}//end cartAdd

	public CartInfoDTO selectByCode(SqlSession session, int cart_code) {
//	public CartInfoDTO selectByCode(SqlSession session) {
		CartInfoDTO dto = session.selectOne("CartMapper.selectByCode",cart_code);
//		CartInfoDTO dto = session.selectOne("CartMapper.selectByCode");
		return dto;
	}

	public CartDTO selectBymaxCart(SqlSession session, String member_Code) {
		CartDTO dto = session.selectOne("CartMapper.selectBymaxCart",member_Code);
		return dto;
	}

	

}
