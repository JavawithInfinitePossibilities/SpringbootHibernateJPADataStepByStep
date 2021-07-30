package com.sid.tutorials.springboot.hibernate;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;

import com.sid.tutorials.springboot.hibernate.model.db.Product;
import com.sid.tutorials.springboot.hibernate.repositories.IProductRepo;

@SpringBootTest(classes = Section08PagingAndSorting.class)
class Section08PagingAndSortingTest {

	@Autowired
	private IProductRepo iProductRepo;

	@Disabled
	@Test
	public void testCustomPagableFindByNameProduct() {
		List<Product> products = iProductRepo.findByNameLike("%samsung%", PageRequest.of(1, 2).previousOrFirst());
		products.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testPagingFindAllProduct() {
		iProductRepo.findAll(PageRequest.of(2, 2).previousOrFirst()).forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testSortFindAllProduct() {
		iProductRepo.findAll(Sort.by(Direction.DESC, "price", "name")).forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testSortOrderFindAllProduct() {
		iProductRepo.findAll(Sort.by(new Sort.Order(Direction.DESC, "price"), new Sort.Order(Direction.ASC, "name")))
				.forEach(System.out::println);
	}

	@Test
	public void testPageSortOrderFindAllProduct() {
		iProductRepo.findAll(PageRequest.of(2, 2, Direction.DESC, "price").previousOrFirst())
				.forEach(System.out::println);
	}

}
