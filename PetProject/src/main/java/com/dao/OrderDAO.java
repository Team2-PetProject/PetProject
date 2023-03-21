package com.dao;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.OrderInfoDTO;
import com.dto.OrderItemDTO;

public class OrderDAO {

	public int orderDone(SqlSession session, OrderInfoDTO oinfoDTO) {
		int n = session.insert("OrderInfoMapper.orderDone",oinfoDTO);
//		System.out.println("dao n 값 "+ n);  //insert 갯수
//		System.out.println("orderinfo insert 후 dao orderinfo_code: "+oinfoDTO.getOrderInfo_Code());
		return oinfoDTO.getOrderInfo_Code();
	}

	public int itemOrderDone(SqlSession session, OrderItemDTO oitemDTO) {
//		System.out.println("dao : " + oitemDTO);
		int n = session.insert("OrderItemMapper.itemOrderDone",oitemDTO);
		return n;
	}

	public int delByCode(SqlSession session, int cart_Code) {
		int n = session.delete("CartMapper.delByCode",cart_Code);
		return n;
	}
	public int orderAllDone(SqlSession session, OrderInfoDTO oinfoDTO) {
		int n = session.insert("OrderInfoMapper.orderDone", oinfoDTO);
		return oinfoDTO.getOrderInfo_Code();
	}

	public int orderItemAllDone(SqlSession session, HashMap<String, Object> map) {
		return session.insert("orderItemAllDone", map);
	}

	public OrderInfoDTO selByinfoCode(SqlSession session, int orderInfo_Code) {
		OrderInfoDTO dto = session.selectOne("OrderInfoMapper.selByinfoCode",orderInfo_Code);
		return dto;
	}

	public OrderItemDTO selByCode(SqlSession session, int orderInfo_Code) {
		OrderItemDTO dto = session.selectOne("selByCode",orderInfo_Code);
		return dto;
	}

	public List<OrderItemDTO> selAllByinfoCode(SqlSession session, int orderInfo_Code) {
		return session.selectList("selAllByinfoCode", orderInfo_Code);
	}

}
