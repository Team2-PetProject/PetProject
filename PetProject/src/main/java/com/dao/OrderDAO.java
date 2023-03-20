package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.OrderInfoDTO;
import com.dto.OrderItemDTO;

public class OrderDAO {

	public int orderDone(SqlSession session, OrderInfoDTO oinfoDTO) {
		int n = session.insert("OrderMapper.orderDone",oinfoDTO);
//		System.out.println("dao n 값 "+ n);  //insert 갯수
//		System.out.println("orderinfo insert 후 dao orderinfo_code: "+oinfoDTO.getOrderInfo_Code());
		return oinfoDTO.getOrderInfo_Code();
	}

	public int itemOrderDone(SqlSession session, OrderItemDTO oitemDTO) {
//		System.out.println("dao : " + oitemDTO);
		int n = session.insert("OrderMapper.itemOrderDone",oitemDTO);
		return n;
	}

	public int delByCode(SqlSession session, int cart_Code) {
		int n = session.delete("CartMapper.delByCode",cart_Code);
		return n;
	}

	public OrderInfoDTO selByinfoCode(SqlSession session, int orderInfo_Code) {
		OrderInfoDTO dto = session.selectOne("selByinfoCode",orderInfo_Code);
		return dto;
	}

	public OrderItemDTO selByCode(SqlSession session, int orderInfo_Code) {
		OrderItemDTO dto = session.selectOne("selByCode",orderInfo_Code);
		return dto;
	}

}
