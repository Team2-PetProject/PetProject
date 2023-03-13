package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.item_FavoriteDTO;
import com.dto.tour_FavoriteDTO;

public class tour_FavoriteDAO {

	public List<tour_FavoriteDAO> getList(SqlSession session, String member_code) {

		List<tour_FavoriteDAO> list=session.selectList("FavoriteMapper.tourList",member_code);
		System.out.println("dao");
		return list;
	}



}
