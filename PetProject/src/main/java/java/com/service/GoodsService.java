package java.com.service;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import java.com.config.MySqlSessionFactory;
import java.com.dao.GoodsDAO;
import java.com.dto.GoodsDTO;

public class GoodsService {

	public List<GoodsDTO> goodsList(String gCategory) {
		SqlSession session = MySqlSessionFactory.getSession();
		 List<GoodsDTO> list = null;
		 try {
			 GoodsDAO dao = new GoodsDAO();
			 list = dao.goodsList(session, gCategory);
		 }catch(Exception e) {
				e.printStackTrace();
		 }finally {
			 session.close();
		 }
		return list;
	}

}
