package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.model.db.Product;
import com.sid.tutorials.springboot.hibernate.repositories.IProductRepo;

@SpringBootTest(classes = Section20CallingStoredProcedure.class)
class Section20CallingStoredProcedureTest {

	@Autowired
	private IProductRepo iProductRepo;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	public void testGetAllProduct() {
		List<Product> saveProduct = iProductRepo.getAllProduct();
		System.out.println(saveProduct);
	}

	@Disabled
	@Test
	public void testReadProduct() {
		List<Product> product = iProductRepo.getAllProductsByPrice(4000);
		System.out.println(product);
	}

	@Test
	public void testUpdateProduct() {
		System.out.println(iProductRepo.getAllProductCountByPrice(4000));
	}
}
