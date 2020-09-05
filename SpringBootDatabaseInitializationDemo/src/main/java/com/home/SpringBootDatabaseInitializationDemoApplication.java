package com.home;

import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.home.dao.EmployeeDao;
import com.home.dao.PersonDaoWithJDBC;
import com.home.model.Employee;
import com.home.model.Person;

@SpringBootApplication
public class SpringBootDatabaseInitializationDemoApplication implements CommandLineRunner{
	
	@Autowired
	private EmployeeDao employeeDao;
	
	@Autowired
	private PersonDaoWithJDBC personDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDatabaseInitializationDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//createEmployee();
		//createPerson();
	}

	private void createEmployee() {
		Employee  employee=new Employee();
		employee.setEmpName("Vivek Garg");
		employee.setEmail("v@gmail.com");
		employee.setSalary(15000.0);
		employeeDao.save(employee);
	}
	
	private void createPerson() {
		Person  person=new Person();
		person.setPersonName("Prabhat Singh");
		person.setEmail("p@gmail.com");
		person.setSalary(16000.0);
		personDao.createPerson(person);
	}

}
