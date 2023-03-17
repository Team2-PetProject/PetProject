package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.OrderDAO;
import com.dto.OrderInfoDTO;
import com.dto.OrderItemDTO;

public class OrderService {
	OrderDAO dao;

	public OrderService() {
		super();
		dao = new OrderDAO();
	}

	public int orderDone(OrderInfoDTO oinfoDTO, OrderItemDTO oitemDTO, int cart_Code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n=0;
		int n2=0;
		int n3=0;
		System.out.println("OrderService "+oinfoDTO);
		System.out.println("OrderService "+oitemDTO);
		System.out.println("OrderService "+cart_Code);
		try {
			n = dao.orderDone(session,oinfoDTO);   //orderinfo insert
			System.out.println("OrderInfo insert " + n);
			n2 = dao.itemOrderDone(session,oitemDTO);  //orderitem insert
			System.out.println("OrderItem insert " + n2);
			n3 = dao.delByCode(session,cart_Code);  //cart delete
			System.out.println("Cart delete "+ n3);
			session.commit();
			System.out.println("commit 됨 ==========================");
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			System.out.println("rollback 됨 =========================");
		}finally {
			session.close();
		}
		return n+n2+n3;
	}//end orderDone

	public OrderInfoDTO selByinfoCode(String orderInfo_Code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		OrderInfoDTO dto = null;
		try {
			dto = dao.selByinfoCode(session,orderInfo_Code);
		} finally {
			session.close();
		}
		return dto;
	}

	public OrderItemDTO selByCode(String orderInfo_Code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		OrderItemDTO dto = null;
		try {
			dto = dao.selByCode(session,orderInfo_Code);
		} finally {
			session.close();
		}
		return dto;
	}
	
	
}
