package com.service;

import com.dao.MemberDAO;

public class MemberService {
	MemberDAO dao;

	public MemberService() {
		super();
		dao = new MemberDAO();
	}
	
}
