package com.sid.tutorials.springboot.hibernate.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.springboot.hibernate.model.db.Student;
import com.sid.tutorials.springboot.hibernate.model.dto.IStudentDTO;
import com.sid.tutorials.springboot.hibernate.model.dto.StudentDTO;

public interface IStudentRepo extends JpaRepository<Student, Long> {

	@Query("from Student")
	public List<Student> findAllStudent();

	@Query("from Student")
	public List<Student> findAllStudentPageable(Pageable pageable);

	@Query("select st.firstName, st.lastName from Student st")
	public List<Object[]> findAllFirstAndLastNameOfStudent();

	@Query("from Student st where st.firstName=:firstName")
	public List<Student> findAllStudentOfFirstName(String firstName);

	@Query("from Student st where st.testScore>=:minScore and st.testScore<=:maxScore")
	public List<Student> findAllStudentBetweenScores(@Param("minScore") int minScore, @Param("maxScore") int maxScore);

	/**
	 * 
	 * @param minScore
	 * @param maxScore
	 * @return List<StudentDTO> Always check the complete path of the DTO object.
	 */
	@Query("select new com.sid.tutorials.springboot.hibernate.model.dto.StudentDTO(st.firstName, st.lastName) from Student st where st.testScore>=:minScore and st.testScore<=:maxScore")
	public List<StudentDTO> findAllStudentBetweenScoresUsingStudentDTO(int minScore, int maxScore);

	@Query(value = "select st.fname as firstName, st.lname as lastName from studentdb st where st.test_score>=:minScore and st.test_score<=:maxScore", nativeQuery = true)
	public List<IStudentDTO> findAllStudentBetweenScoresUsingStudentDTONativeSQL(int minScore, int maxScore);

	@Transactional
	@Modifying
	@Query(value = "insert into studentdb(fname,lname,test_score) values(:firstName,:lastName,:score)", nativeQuery = true)
	public void insertStudent(String firstName, String lastName, int score);

	/*
	@Transactional
	@Modifying
	@Query(value = "insert into Student(firstName,lastName,testScore) VALUES(:firstName,:lastName,:score)")
	public void insertStudentUsingJPQL(@Param("firstName") String firstName, @Param("lastName") String lastName,
			@Param("score") int score);
	*/
}
