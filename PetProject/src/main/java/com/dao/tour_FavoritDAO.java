package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.item_FavoritDTO;
import com.dto.tour_FavoritDTO;

public class tour_FavoritDAO {

	public List<tour_FavoritDAO> getList(SqlSession session, String member_code) {

		List<tour_FavoritDAO> list=session.selectList("FavoriteMapper.tourList",member_code);
		System.out.println("dao");
		return list;
	}



}
