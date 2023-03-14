package com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OrderHistoryDAO;
import com.dto.OrderHistoryDTO;

public class OrderHistoryService {
	OrderHistoryDAO dao;

	public List<OrderHistoryDTO> getList(String member_code) {
		System.out.println("서비스접속");
		SqlSession session = MySqlSessionFactory.getSqlSession();
		dao = new OrderHistoryDAO();
		System.out.println(session);
		List<OrderHistoryDTO> list = null;
		try {
			list = dao.getList(session, member_code);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public List<OrderHistoryDTO> getOredrDay(int num) {
		System.out.println("서비스접속");
		SqlSession session = MySqlSessionFactory.getSqlSession();
		dao = new OrderHistoryDAO();
		System.out.println(session);
		List<OrderHistoryDTO> list = null;
		try {
			list = dao.getOredrDay(session, num);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public List<OrderHistoryDTO> getOredrMonth(int num) {
		System.out.println("서비스접속");
		SqlSession session = MySqlSessionFactory.getSqlSession();
		dao = new OrderHistoryDAO();
		System.out.println(session);
		List<OrderHistoryDTO> list = null;
		try {
			list = dao.getOredrMonth(session, num);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			session.close();
		}
		return list;
	}

	public List<OrderHistoryDTO> getOredrTerm(String string, String string2) {
		// TODO Auto-generated method stub
		return null;
	}
}
