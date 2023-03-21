package com.dao;


import java.util.List;

import org.apache.ibatis.session.SqlSession;

import com.dto.ItemDTO;

public class ItemDAO {

	public ItemDTO itemRetrieve(SqlSession session, String item_code) {
		ItemDTO dto = session.selectOne("ItemMapper.itemRetrieve", item_code);
		return dto;
	}

	public List<ItemDTO> selectNew(SqlSession session) {
		return session.selectList("ItemMapper.selectNew");
	}

	public List<ItemDTO> selectBest(SqlSession session, List<String> itemCodeList) {
		return session.selectList("ItemMapper.selectBest", itemCodeList);
	}
	
}//end class
