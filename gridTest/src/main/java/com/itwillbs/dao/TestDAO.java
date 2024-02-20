package com.itwillbs.dao;

import java.util.List;
import java.util.Map;

import javax.inject.Inject;

import org.apache.ibatis.session.SqlSession;
import org.springframework.stereotype.Repository;

@Repository
public class TestDAO {
	@Inject
	private SqlSession sqlSession;

	public List<Map<String, String>> getMember() {
		
		List<Map<String, String>> list = sqlSession.selectList("Test.proc");
//		System.out.println(list);
		return list;
	}
}
