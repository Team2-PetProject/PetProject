package com.dao;




import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;
import com.dto.CartInfoDTO;

public class CartDAO {

	public int cartAddselKey(SqlSession session, CartDTO cDTO) {
		int n = session.insert("CartMapper.cartAddselKey",cDTO);
		System.out.println("cart insert 후 cartcode dao : "+cDTO.getCart_Code());
		return cDTO.getCart_Code();
	}//end cartAdd

	public CartInfoDTO selectByCode(SqlSession session, int cart_code) {
//	public CartInfoDTO selectByCode(SqlSession session) {
		CartInfoDTO dto = session.selectOne("CartMapper.selectByCode",cart_code);
//		CartInfoDTO dto = session.selectOne("CartMapper.selectByCode");
		return dto;
	}



	

}
