package com.rahul.springBoot.Jdbc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.rahul.springBoot.Jdbc.entity.Person;
import com.rahul.springBoot.Jdbc.service.JdbcService;

//restController
@RestController
public class JdbcRestController {		
	
	@Autowired
	private JdbcService jdbcService;
	
	
	@GetMapping("/getPersons")
	public List<Person> findAllPeron(){
		return jdbcService.findAllPerson();
	}
	
	@GetMapping("/getPersons/{id}/{name}")
	public Person findById(@PathVariable int id,@PathVariable String name) {
		return jdbcService.findById(id,name);
	}
	
	@DeleteMapping("/deletePerson/{id}")
	public int deleteById(@PathVariable int id) {
		return jdbcService.deleteById(id);
	}

}
