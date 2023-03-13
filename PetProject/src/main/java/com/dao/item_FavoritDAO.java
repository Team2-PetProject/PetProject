package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.item_FavoritDTO;

public class item_FavoritDAO {

	public List<item_FavoritDTO> getList(SqlSession session, String member_code) {
		
		List<item_FavoritDTO> list=session.selectList("FavoriteMapper.tourList",member_code);
		System.out.println("dao");
		return list;
	}
	
}
