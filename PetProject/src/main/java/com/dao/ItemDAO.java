package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.ItemDTO;

public class ItemDAO {

	public ItemDTO goodsRetrieve(SqlSession session, String item_code) {
		ItemDTO dto = session.selectOne("ItemMapper.goodsRetrieve", item_code);
		return dto;
	}
	
}//end class
