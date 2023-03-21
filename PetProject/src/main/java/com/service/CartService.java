package com.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.CartDAO;
import com.dto.CartDTO;
import com.dto.CartInfoDTO;

public class CartService {
	CartDAO dao;

	public CartService() {
		super();
		dao = new CartDAO();
	}

	public int cartAddselKey(CartDTO cDTO) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n = 0;
		try {
			n= dao.cartAddselKey(session,cDTO);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}//end CartAdd

	public CartInfoDTO selectByCode(int cart_code) {
//	public CartInfoDTO selectByCode() {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		CartInfoDTO dto = null;
		try {
			dto = dao.selectByCode(session,cart_code);
//			dto = dao.selectByCode(session);
		}finally {
			session.close();
		}
		return dto;
	}
	public List<CartInfoDTO> cartList(int member_code) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<CartInfoDTO> list = null;
		try {
			list = dao.cartList(session, member_code);
		} finally {
			session.close();
		}
		return list;
	}

	public int updateAmount(Map<String, Object> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n = 0;
		try {
			n = dao.updateAmount(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	public int delByCode(int cartCode) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n =0;
		try {
			n = dao.delByCode(session, cartCode);
			session.commit();
		} catch (Exception e) {
			System.out.println("rollback()-------");
			session.rollback();
		} finally {
			session.close();
		}
		return n;
	}

	public int delAll(HashMap<String, Object> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n = 0;
		try {
			n = dao.delAll(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	public int updateOption(Map<String, Object> map) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int n =0;
		try {
			n = dao.updateOption(session, map);
			session.commit();
		} finally {
			session.close();
		}
		return n;
	}

	public List<CartInfoDTO> OrderAll(List<String> list) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		List<CartInfoDTO> cList = null;
		try {
			cList = dao.OrderAll(session, list);
			session.commit();
		} finally {
			session.close();
		}
		return cList;
	}

	public int insertItem(CartDTO dto) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		int result =0 ;
		try {
			result = dao.insertItem(session, dto);
		} catch (Exception e) {
			session.rollback();
		} finally {
			session.close();
		}
		return result;
	}
	
}
