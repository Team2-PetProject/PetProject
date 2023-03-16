package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.dto.OrderInfoDTO;

public class OrderDAO {

	public int orderDone(SqlSession session, OrderInfoDTO dto) {
		return session.insert("orderAllDone", dto);
	}

	public int orderDone2(SqlSession session, HashMap<String, Object> map) {
		return session.insert("orderItemAllDone", map);
	}

}
