package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.dto.OrderInfoDTO;
import com.dto.OrderItemDTO;

public class OrderDAO {

	public int orderDone(SqlSession session, OrderInfoDTO oinfoDTO) {
		int n = session.insert("OrderMapper.orderDone",oinfoDTO);
		return n;
	}

	public int itemOrderDone(SqlSession session, OrderItemDTO oitemDTO) {
		System.out.println("dao : " + oitemDTO);
		int n = session.insert("OrderMapper.itemOrderDone",oitemDTO);
		return n;
	}

	public int delByCode(SqlSession session, int cart_Code) {
		int n = session.delete("CartMapper.delByCode",cart_Code);
		return n;
	}
	public int orderAllDone(SqlSession session, OrderInfoDTO dto) {
		return session.insert("orderAllDone", dto);
	}

	public int orderDone2(SqlSession session, HashMap<String, Object> map) {
		return session.insert("orderItemAllDone", map);
	}

}
