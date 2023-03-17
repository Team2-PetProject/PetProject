package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;
import com.dto.CartInfoDTO;

public class CartDAO {

	public List<CartInfoDTO> cartList(SqlSession session, int member_code) {
		return session.selectList("cartList", member_code);
	}

	public int updateAmount(SqlSession session, Map<String, Object> map) {
		return session.update("updateAmount", map);
	}

	public int delByCode(SqlSession session, int cartCode) {
		return session.delete("delByCode", cartCode);
	}

	public int delAll(SqlSession session, List<String> list) {
		return session.delete("delAll", list);
	}

	public int updateOption(SqlSession session, Map<String, Object> map) {
		return session.update("updateOption", map);
	}

	public List<CartInfoDTO> OrderAll(SqlSession session, List<String> list) {
		return session.selectList("OrderAll", list);
	}

	public int cartAdd(SqlSession session, CartDTO cDTO) {
		int n = session.insert("CartMapper.cartAdd",cDTO);
		return n;
	}//end cartAdd

	public CartInfoDTO selectByCode(SqlSession session, int cart_code) {
		CartInfoDTO dto = session.selectOne("CartMapper.selectByCode",cart_code);
		return dto;
	}

	public CartDTO selectBymaxCart(SqlSession session, String member_Code) {
		CartDTO dto = session.selectOne("CartMapper.selectBymaxCart",member_Code);
		return dto;
	}

}
