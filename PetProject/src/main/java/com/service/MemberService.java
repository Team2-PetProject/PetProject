package com.service;

import org.apache.ibatis.session.SqlSession;

import com.config.MySqlSessionFactory;
import com.dao.MemberDAO;
import com.dto.MemberDTO;

public class MemberService {
	MemberDAO dao;

	public MemberService() {
		super();
		dao = new MemberDAO();
	}

	public MemberDTO selectOne(String memberCode) {
		SqlSession session = MySqlSessionFactory.getSqlSession();
		MemberDTO dto = null;
		try {
			dto = dao.selectOne(session, memberCode);
		} finally {
			session.close();
		}
		return dto;
	}
	
}
