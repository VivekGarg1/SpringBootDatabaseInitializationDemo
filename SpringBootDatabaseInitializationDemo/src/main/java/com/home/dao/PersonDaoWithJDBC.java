package com.home.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.home.model.Person;

@Repository
public class PersonDaoWithJDBC {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void createPerson(Person person) {
		String sql="insert into person(email,salary,person_name)values(?,?,?)";
		jdbcTemplate.update(sql, person.getEmail(),person.getSalary(),person.getPersonName());
	}

}
