package com.test.MybatisTest;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import com.test.domain.Test;

public class Demo {
	public static void main(String[] args) throws IOException{
		InputStream inputStream = Resources.getResourceAsStream("mybatis.xml");
		SqlSessionFactoryBuilder builder = new SqlSessionFactoryBuilder();
		SqlSessionFactory factory = builder.build(inputStream);
		
		SqlSession sqlSession = factory.openSession();
		List<Test> list = sqlSession.selectList("com.test.dao.TestMapper.findAll");
		System.out.println(list.toString());
		sqlSession.close();
	}
}
