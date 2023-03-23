package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dao.DeliveryInfoDAO;
import com.dao.OrderDAO;
import com.dto.CartInfoDTO;
import com.dto.DeliveryInfoDTO;
import com.dto.OrderInfoDTO;
import com.dto.OrderItemDTO;

public class OrderService {
	OrderDAO dao;

	public OrderService() {
		super();
		dao = new OrderDAO();
	}

	public OrderInfoDTO selByinfoCode(int orderInfo_Code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		OrderInfoDTO dto = null;
		try {
			dto = dao.selByinfoCode(session,orderInfo_Code);
		} finally {
			session.close();
		}
		return dto;
	}

	public OrderItemDTO selByCode(int orderInfo_Code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		OrderItemDTO dto = null;
		try {
			dto = dao.selByCode(session,orderInfo_Code);
		} finally {
			session.close();
		}
		return dto;
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
			System.out.println("OrderInfo getOrderInfo_Code :" + n);
			n2 = dao.itemOrderDone(session,oitemDTO);  //orderitem insert
//			System.out.println("OrderItem insert " + n2);
			n3 = dao.delByCode(session,cart_Code);  //cart delete
//			System.out.println("Cart delete "+ n3);
			session.commit();
			System.out.println("commit 됨 ==========================");
		} catch (Exception e) {
			e.printStackTrace();
			session.rollback();
			System.out.println("rollback 됨 =========================");
		}finally {
			session.close();
		}
//		System.out.println("service commit 후 orderinfo_code"+ oinfoDTO.getOrderInfo_Code());
		return n;
	}//end orderDone

	public int orderAllDone(String memberCode, List<String> cList, List<CartInfoDTO> list, OrderInfoDTO orderInfoDTO, DeliveryInfoDTO dDTO) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int result = 0;
		int result2 = 0;
		int result3 = 0;
		int result4 =0;
		try {
			result = dao.orderAllDone(session, orderInfoDTO);
			System.out.println("orderInfo insert : " + result);

			HashMap<String, Object> map = new HashMap<String, Object>();
			map.put("orderName", orderInfoDTO.getOrderInfo_OrderName());
			map.put("list", list);
			result2 = dao.orderItemAllDone(session, map);
			System.out.println("orderItem insert : " + result2);

			CartDAO cDAO = new CartDAO();
			HashMap<String, Object> map2 = new HashMap<String, Object>();
			map2.put("memberCode", memberCode);
			map2.put("list", cList);
			result3 = cDAO.delAll(session, map2);
			System.out.println("Cart delete : " + result3);
			
			DeliveryInfoDAO dao = new DeliveryInfoDAO();
			result4 = dao.insertInfo(session, dDTO);
			System.out.println("Delivery insert : " + result4);
			
			session.commit();
		} catch (Exception e) {
			session.rollback();
			System.out.println(e.getMessage());
			System.out.println("rollback됨 ------");
		} finally {
			session.close();
		}
		return result;
	}

	public List<OrderItemDTO> selAllByinfoCode(int n) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<OrderItemDTO> list = null;
		try {
			list = dao.selAllByinfoCode(session, n);
		} finally {
			session.close();
		}
		return list;
	}

	public List<String> selectBest() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<String> list = null;
		try {
			list = dao.selBest(session);
		} finally {
			session.close();
		}
		return list;
	}
	
}
