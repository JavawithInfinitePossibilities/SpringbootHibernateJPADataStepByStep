/**
 * 
 */
package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Optional;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.model.db.Product;
import com.sid.tutorials.springboot.hibernate.repositories.IProductRepo;

/**
 * @author Lenovo
 *
 */
@SpringBootTest(classes = Section05SimpleCURDOperation.class)
class Section05SimpleCURDOperationTest {
	@Autowired
	private IProductRepo iProductRepo;

	@Disabled
	@Test
	void test() {
		System.out.println("Spring boot JPA hibernate...");
	}

	@Disabled
	@Test
	public void testCreateProduct() {
		Product product = Product.builder().name("Iphone").description("Iphone Apple").price(1000d).build();
		Product saveProduct = iProductRepo.save(product);
		System.out.println(saveProduct);
	}

	@Disabled
	@Test
	public void testReadProduct() {
		Optional<Product> product = iProductRepo.findById(2);
		assertNotNull(product.get());
		assertEquals(product.get().getName(), "Iphone");
	}

	@Disabled
	@Test
	public void testUpdateProduct() {
		Optional<Product> productOptional = iProductRepo.findById(2);
		Product product = productOptional.get();
		assertNotNull(product);
		product.setPrice(1200);
		Product saveProduct = iProductRepo.save(product);
		assertNotNull(saveProduct);
		assertEquals(saveProduct.getPrice(), 1200);
	}

	@Disabled
	@Test
	public void testDeleteProduct() {
		Optional<Product> productOptional = iProductRepo.findById(22);
		Product product = productOptional.get();
		assertNotNull(product);
		iProductRepo.delete(product);
	}

	@Disabled
	@Test
	public void testDeleteExistProduct() {
		if (iProductRepo.existsById(23)) {
			Optional<Product> productOptional = iProductRepo.findById(23);
			Product product = productOptional.get();
			assertNotNull(product);
			iProductRepo.delete(product);
		}

	}
	
	@Test
	public void testDeleteCountProduct() {
		long count = iProductRepo.count();
		assertEquals(4, count);
	}
}
