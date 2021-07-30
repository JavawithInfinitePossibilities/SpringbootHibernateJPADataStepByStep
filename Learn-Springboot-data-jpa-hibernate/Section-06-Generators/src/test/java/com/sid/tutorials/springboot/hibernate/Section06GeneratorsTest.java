package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.model.db.Address;
import com.sid.tutorials.springboot.hibernate.model.db.Employee;
import com.sid.tutorials.springboot.hibernate.repositories.IEmployeeRepo;

@SpringBootTest(classes = Section06Generators.class)
class Section06GeneratorsTest {

	@Autowired
	private IEmployeeRepo iEmployeeRepo;

	@Test
	public void testCreateemployee() {
		Address address = Address.builder().streetaddress("102").city("Bangalore").state("Karnatak").zipcode("560037")
				.country("India").build();
		Employee employee = Employee.builder().firstName("Siddhant").lastName("Sahu").address(address).build();
		Employee saveEmployee = iEmployeeRepo.save(employee);
		assertEquals(employee, saveEmployee);
	}
}
