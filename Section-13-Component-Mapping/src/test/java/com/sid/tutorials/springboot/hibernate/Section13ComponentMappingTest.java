package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.model.db.componentMapping.Address;
import com.sid.tutorials.springboot.hibernate.model.db.componentMapping.Employee;
import com.sid.tutorials.springboot.hibernate.repositories.IEmployeeRepo;

@SpringBootTest(classes = Section13ComponentMapping.class)
class Section13ComponentMappingTest {

	@Autowired
	private IEmployeeRepo iEmployeeRepo;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testCreateemployee() {
		Address address = Address.builder().streetaddress("101").city("Bangalore").state("Karnatak").zipcode("560037")
				.country("India").build();
		Employee employee = Employee.builder().firstName("Sid").lastName("Sahu").address(address).build();
		Employee saveEmployee = iEmployeeRepo.save(employee);
		System.out.println(saveEmployee);
	}
}
