/**
 * 
 */
package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.fail;

import java.util.List;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.test.annotation.Rollback;

import com.sid.tutorials.springboot.hibernate.model.db.Student;
import com.sid.tutorials.springboot.hibernate.model.dto.IStudentDTO;
import com.sid.tutorials.springboot.hibernate.model.dto.StudentDTO;
import com.sid.tutorials.springboot.hibernate.repositories.IStudentRepo;

/**
 * @author Lenovo
 *
 */
@SpringBootTest(classes = Section09JPQL.class)
class Section09JPQLTest {

	@Autowired
	private IStudentRepo iStudentRepo;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	public void testSaveStudent() {
		Student student = Student.builder().firstName("Susmita").lastName("Sahu").testScore(90).build();
		iStudentRepo.save(student);
	}

	@Disabled
	@Test
	public void testFindAllStudent() {
		List<Student> allStudent = iStudentRepo.findAllStudent();
		allStudent.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testFindAllFirstAndLastNameOfStudent() {
		List<Object[]> allStudent = iStudentRepo.findAllFirstAndLastNameOfStudent();
		allStudent.stream().forEach(s -> System.out.println("First Name :" + s[0] + "  Last Name:" + s[1]));
	}

	@Disabled
	@Test
	public void testFindAllStudentOfFirstName() {
		List<Student> allStudent = iStudentRepo.findAllStudentOfFirstName("sid");
		allStudent.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testFindAllStudentBetweenScores() {
		List<Student> allStudent = iStudentRepo.findAllStudentBetweenScores(50, 90);
		allStudent.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testFindAllStudentBetweenScoresUsingStudentDTO() {
		List<StudentDTO> allStudent = iStudentRepo.findAllStudentBetweenScoresUsingStudentDTO(50, 90);
		allStudent.stream().forEach(System.out::println);
	}

	@Disabled
	@Test
	public void testFindAllStudentBetweenScoresUsingStudentDTONativeSQL() {
		List<IStudentDTO> allStudent = iStudentRepo.findAllStudentBetweenScoresUsingStudentDTONativeSQL(50, 90);
		allStudent.stream().forEach(
				s -> System.out.println("First Name : " + s.getFirstName() + " Last Name : " + s.getLastName()));
	}

	/**
	 * @Rollback annotation is default true. which will make the insert or any DML
	 *           queries roll back if it is executed from JUnit test cases. To make
	 *           it permanent mark the roll back as false.
	 */
	
	@Disabled
	@Rollback(value = false)
	@Test
	public void testInsertStudent() {
		iStudentRepo.insertStudent("Welcome", "in Spring", 95);
	}
	 
	@Disabled
	@Test
	public void testfindAllStudentPageable() {
		List<Student> allStudentPageable = iStudentRepo
				.findAllStudentPageable(PageRequest.of(0, 5, Direction.DESC, "firstName").previousOrFirst());
		allStudentPageable.stream().forEach(System.out::println);
	}
	/*
	@Test
	public void testInsertStudentUsingJPQL() {
		iStudentRepo.insertStudentUsingJPQL("Welcome", "in Spring", 96);
	}*/
}
