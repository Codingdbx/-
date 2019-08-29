package com.cesgroup.zw.t04.trans.trans01.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.cesgroup.zw.t04.trans.trans01.dao.PersonDao;
import com.cesgroup.zw.t04.trans.trans01.entity.Person;

@Service
public class PersonService {

	@Autowired
	private PersonDao personDao;
	
	public void createTable() {
		 personDao.createTable();
	}
	
	@Transactional
	public int add(Person person) {
		
		return personDao.add(person); 	
	}
	
	@Transactional
	public int addException(Person person) {
		
		int rownum = personDao.add(person); 	
		
		int i =0,j=0;
		int k = i/j;
		
		return rownum;
	}	
	
	
}


