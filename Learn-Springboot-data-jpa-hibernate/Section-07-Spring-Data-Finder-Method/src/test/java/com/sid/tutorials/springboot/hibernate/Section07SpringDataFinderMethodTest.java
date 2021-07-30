package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.sid.tutorials.springboot.hibernate.model.db.Product;
import com.sid.tutorials.springboot.hibernate.repositories.IProductRepo;

@SpringBootTest(classes = Section07SpringDataFinderMethod.class)
class Section07SpringDataFinderMethodTest {
	@Autowired
	private IProductRepo iProductRepo;

	@Disabled
	@Test
	public void testfiindByNameProduct() {
		List<Product> products = iProductRepo.findByName("Iphone");
		products.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testfiindByNameAndDescriptionProduct() {
		List<Product> products = iProductRepo.findByNameAndDescription("Iphone", "Iphone Apple");
		products.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testfindByPriceGreaterThanEqualProduct() {
		List<Product> products = iProductRepo.findByPriceGreaterThanEqual(1000d);
		products.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testCustomFindByNameProduct() {
		List<Product> products = iProductRepo.findByNameContains("samsung");
		products.stream().forEach(System.out::println);
	}

	@Test
	public void testCustomPagableFindByNameProduct() {
		List<Product> products = iProductRepo.findByNameLike("%samsung%",
				PageRequest.of(2, 1, Direction.DESC, "price"));
		products.stream().forEach(System.out::println);
	}

}
