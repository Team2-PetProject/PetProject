package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.item_FavoriteDTO;

public class item_FavoriteDAO {

	public List<item_FavoriteDTO> getList(SqlSession session, String member_code) {
		System.out.println("dao");
		List<item_FavoriteDTO> list=session.selectList("FavoriteMapper.itemList",member_code);
		return list;
	}
	
}
