package com.config;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MySqlSessionFactory {
	static SqlSessionFactory sqlSessionFactory= null;  
	//connection과 같은 기능을 하는  SqlSession을 생성하는 객체
	static {//초기화
		String resource = "com/config/Configuration.xml";   //MySqlSessionFactory에서 유일한 수정부분
		InputStream inputStream= null;
		try {
			inputStream = Resources.getResourceAsStream(resource);//파일을 읽어오는 코드
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
		 //configuration 오류 시 생성 안됨
	}//end static
	
	//SqlSession 반환
	public static SqlSession getSqlSession() {  //getConnection과 비슷
		SqlSession session = sqlSessionFactory.openSession();
		return session;
	}
	
}
