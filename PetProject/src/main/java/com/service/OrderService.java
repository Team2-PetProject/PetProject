package com.service;

import java.util.HashMap;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dao.OrderDAO;
import com.dto.CartInfoDTO;
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
			n = dao.orderAllDone(session,oinfoDTO);   //orderinfo insert
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
public int orderAllDone(List<String> cList, List<CartInfoDTO> list, OrderInfoDTO orderInfoDTO) {
	SqlSession session = MySqlSessionFactory.getSqlSession();
	int result = 0;
	int result2 = 0;
	int result3 = 0;
	try {
		result = dao.orderDone(session, orderInfoDTO);
		System.out.println("orderInfo insert : " + result);
		
		HashMap<String, Object> map = new HashMap<String, Object>();
		map.put("orderInfoCode", orderInfoDTO.getOrderInfo_Code());
		map.put("orderName", orderInfoDTO.getOrderInfo_OrderName());
		map.put("list", list);
		result2 = dao.orderDone2(session, map);
		System.out.println("orderItem insert : " + result2);
		
		CartDAO cDAO = new CartDAO();
		result3 = cDAO.delAll(session, cList);
		System.out.println("Cart delete : " + result3);
		session.commit();
	} catch (Exception e) {
		session.rollback();
		System.out.println(e.getMessage());
		System.out.println("rollback됨 ------");
	} finally {
		session.close();
	}
	return result + result2 + result3;
}
	
}
