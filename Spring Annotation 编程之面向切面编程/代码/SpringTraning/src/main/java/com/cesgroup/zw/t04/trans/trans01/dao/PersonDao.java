package com.cesgroup.zw.t04.trans.trans01.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cesgroup.zw.t04.trans.trans01.entity.Person;

@Repository
public class PersonDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createTable() {
		 jdbcTemplate.execute("CREATE TABLE IF NOT EXISTS  Person (id integer, name varchar(100))"); 
		 jdbcTemplate.execute("truncate table Person ");
	}
	
	public int add(Person person) {
		return jdbcTemplate.update("INSERT INTO Person VALUES(?, ?)", new Object[] {person.getId(), person.getName()});  
	}
	
}
