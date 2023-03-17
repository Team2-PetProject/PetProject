package com.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.ItemDTO;

public class ItemDAO {

	public List<ItemDTO> ItemList(SqlSession session, String item_Category) {
		List<ItemDTO> list = 
				session.selectList("ItemMapper.ItemList", item_Category);
		return list;
	}
	
}
