package com.rahul.springBoot.Jdbc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.rahul.springBoot.Jdbc.dao.PersonDao;
import com.rahul.springBoot.Jdbc.entity.Person;

@Service
public class JdbcService {
	
	@Autowired
	private PersonDao personDao;

	public List<Person> findAllPerson() {
		// TODO Auto-generated method stub
		return personDao.findAll();
	}

	public Person findById(int id,String name) {
		// TODO Auto-generated method stub
		return personDao.findById(id,name);
	}

	public int deleteById(int id) {
		// TODO Auto-generated method stub
		return personDao.deleteById(id);
	}

}
