package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.model.componentMapping.CustomerId;
import com.sid.tutorials.springboot.hibernate.model.db.Customer;
import com.sid.tutorials.springboot.hibernate.repositories.ICustomerRepo;

@SpringBootTest(classes = Section23CompositePrimaryKeys.class)
class Section23CompositePrimaryKeysTest {

	@Autowired
	private ICustomerRepo iCustomerRepo;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testSaveCustomer() {
		CustomerId id = CustomerId.builder().id(1).email("abc@gmail.com").build();
		Customer customer = Customer.builder().customerId(id).name("ZYX").build();
		Customer saveCustomer = iCustomerRepo.save(customer);
	}
}
