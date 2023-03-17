package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.OrderHistoryDTO;

public class OrderHistoryDAO {

	public List<OrderHistoryDTO> getList(SqlSession session, String member_code) {
//		System.out.println("dao접속");
		List<OrderHistoryDTO>list=session.selectList("OrderInfoMapper.orderHistory",member_code);
		return list;
	}

	public List<OrderHistoryDTO> getOredrDay(SqlSession session, int num) {
		List<OrderHistoryDTO>list=session.selectList("OrderInfoMapper.OredrDay",num);
		return list;
	}

	public List<OrderHistoryDTO> getOredrMonth(SqlSession session, int num) {
		System.out.println("dao접속"+num);
		List<OrderHistoryDTO>list=session.selectList("OrderInfoMapper.OredrMonth",num);
		return list;
	}

}
