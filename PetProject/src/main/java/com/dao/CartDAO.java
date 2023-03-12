package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.dto.CartDTO;

public class CartDAO {

	public List<CartDTO> cartList(SqlSession session, int member_code) {
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

}
