package com.dao;

import java.util.HashMap;

import org.apache.ibatis.session.SqlSession;

import com.dto.MemberDTO;

public class MemberDAO {

	public String idSearch(SqlSession session,
			MemberDTO dto) {
		String member_code = session.selectOne("MemberMapper.idSearch",dto);
		return member_code;
	}
	
	public int memberUpdate(SqlSession session,MemberDTO dto) {
		   int n = session.update("MemberMapper.memberUpdate", dto);
		   return n;
	   }	
	
   public int memberAdd(SqlSession session,MemberDTO dto) {
	   int n = session.insert("MemberMapper.memberAdd", dto);
	   return n;
   }
   public int idCheck(SqlSession session, String member_code) {
		int count = session.selectOne("MemberMapper.idCheck", member_code);
		return count;
	}
   
   public MemberDTO login(SqlSession session, HashMap<String, String> map) {
	   MemberDTO n = session.selectOne("MemberMapper.login", map);
	   return n;
   }
   
   public MemberDTO mypage(SqlSession session,String member_code) {
	   MemberDTO n = session.selectOne("MemberMapper.mypage", member_code);
	   return n;
   }

	public MemberDTO selectOne(SqlSession session, String memberCode) {
		return session.selectOne("selectOne", memberCode);
	}
}
