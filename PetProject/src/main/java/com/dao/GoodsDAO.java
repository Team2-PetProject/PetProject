package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.GoodsDTO;

public class GoodsDAO {

	public GoodsDTO goodsRetrieve(SqlSession session, String item_code) {
		GoodsDTO gdto = session.selectOne("GoodsMapper.goodsRetrieve", item_code);
		return gdto;
	}
	
}//end class