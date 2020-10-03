package com.rahul.springBoot.Jdbc.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import com.rahul.springBoot.Jdbc.entity.Person;

@Repository
public class PersonDao {
	
	private Logger logger=LoggerFactory.getLogger(this.getClass());
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	class PersonRowMapper implements RowMapper<Person>{
		@Override
		public Person mapRow(ResultSet rs, int rowNum) throws SQLException {
			Person Person=new Person();
			Person.setId(rs.getInt("id"));
			Person.setName(rs.getString("name"));
			Person.setLocation(rs.getString("location"));
			Person.setBirthDate(rs.getTimestamp("birth_Date"));
			return Person;
		}	
	}
	
	public List<Person> findAll(){
		List<Person> l=jdbcTemplate.query("select * from person", new PersonRowMapper());
		logger.info("All person ---> {}",l);
		return l;
	}
	
	public Person findById(int id,String name){
		Person l=jdbcTemplate.queryForObject("select * from person where id=? and name=?",new Object[] {id,name},new PersonRowMapper());
		//logger.info("All person ---> {}",l);
		return l;
	}
	
	
	public int deleteById(int id){
		return jdbcTemplate.update("delete from person where id=?",new Object[] {id},new PersonRowMapper());
		//logger.info("All person ---> {}",l);
		
	}


	

}
