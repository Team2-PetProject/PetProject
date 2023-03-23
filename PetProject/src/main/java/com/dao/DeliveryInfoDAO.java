package com.dao;

import org.apache.ibatis.session.SqlSession;

import com.dto.DeliveryInfoDTO;

public class DeliveryInfoDAO {

	public int insertInfo(SqlSession session, DeliveryInfoDTO dDTO) {
		return session.insert("insertInfo", dDTO);
	}

}
