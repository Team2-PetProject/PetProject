package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.tour_FavoriteDTO;

public class tour_FavoriteDAO {

	public List<tour_FavoriteDTO> getList(SqlSession session, String member_code) {
		System.out.println("dao");
		List<tour_FavoriteDTO> list=session.selectList("FavoriteMapper.tourList",member_code);
		System.out.println(list);
		return list;
	}



}
