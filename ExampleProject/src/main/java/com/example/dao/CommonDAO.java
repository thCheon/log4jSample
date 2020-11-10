package com.example.dao;

import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository("commonDAO")
public class CommonDAO extends AbstractDAO {

	Logger log = Logger.getLogger(this.getClass());
	
	public List<Map<String, Object>> getList(Map<String, Object> map) {return (List<Map<String, Object>>)selectList("common.getList", map);}

}
