package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;

import com.sid.tutorials.springboot.hibernate.model.db.Student;
import com.sid.tutorials.springboot.hibernate.repositories.IStudentRepo;

@SpringBootTest(classes = Section10PagingSortingWithJPQL.class)
class Section10PagingSortingWithJPQLTest {

	@Autowired
	private IStudentRepo iStudentRepo;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Test
	public void testfindAllStudentPageable() {
		List<Student> allStudentPageable = iStudentRepo
				.findAllStudentPageable(PageRequest.of(2, 5, Direction.DESC, "firstName").previousOrFirst());
		allStudentPageable.stream().forEach(System.out::println);
	}
}
