package com.rahul.springBoot.Jdbc;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.rahul.springBoot.Jdbc.dao.PersonDao;

@SpringBootApplication
public class JdbcApplication{
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
					
	@Autowired
	private PersonDao personDao;

	public static void main(String[] args) {
		SpringApplication.run(JdbcApplication.class, args);
	}

	/*
	 * @Override public void run(String... args) throws Exception { // TODO
	 * Auto-generated method stub
	 * logger.info("All person ->{}",personDao.findAll());
	 * 
	 * }
	 */
}
