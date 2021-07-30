package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.sid.tutorials.springboot.hibernate.model.dto.IStudentDTO;
import com.sid.tutorials.springboot.hibernate.repositories.IStudentRepo;

@SpringBootTest(classes = Section11NativeSQLQuery.class)
class Section11NativeSQLQueryTest {

	@Autowired
	private IStudentRepo iStudentRepo;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Disabled
	@Rollback(value = false)
	@Test
	public void testInsertStudent() {
		iStudentRepo.insertStudent("Welcome-back", "in Spring", 95);
	}

	@Test
	public void testFindAllStudentBetweenScoresUsingStudentDTONativeSQL() {
		List<IStudentDTO> allStudent = iStudentRepo.findAllStudentBetweenScoresUsingStudentDTONativeSQL(50, 90);
		allStudent.stream().forEach(
				s -> System.out.println("First Name : " + s.getFirstName() + " Last Name : " + s.getLastName()));
	}
}
