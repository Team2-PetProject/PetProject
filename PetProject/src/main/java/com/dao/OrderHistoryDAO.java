package com.dao;

import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.dto.OrderHistoryDTO;

public class OrderHistoryDAO {

	public List<OrderHistoryDTO> getList(SqlSession session, String member_code) {
//		System.out.println("dao접속");
		List<OrderHistoryDTO>list=session.selectList("OrderInfoMapper.orderHistory",member_code);
		return list;
	}



	public List<OrderHistoryDTO> getOredrDay(SqlSession session, Map<String, String> orderDayMap) {
		List<OrderHistoryDTO>list = session.selectList("OrderInfoMapper.getOredrDay",orderDayMap);		
		return list;
	}



	public List<OrderHistoryDTO> getOredrItem(SqlSession session, Map<String, String> orderDayMap) {
		List<OrderHistoryDTO>list = session.selectList("OrderInfoMapper.getOredrItem",orderDayMap);		
		return list;
	}

}
