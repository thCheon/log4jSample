package com.example.dao;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository("commonDAO")
@SuppressWarnings("unchecked")
public class CommonDAO extends AbstractDAO {

	Logger log = Logger.getLogger(this.getClass());
	
	//unchecked : 검증되지 않은 연산자 관련 경고 억제
	public List<Map<String, Object>> getList(Map<String, Object> map) {return (List<Map<String, Object>>)selectList("common.getList", map);}

}
