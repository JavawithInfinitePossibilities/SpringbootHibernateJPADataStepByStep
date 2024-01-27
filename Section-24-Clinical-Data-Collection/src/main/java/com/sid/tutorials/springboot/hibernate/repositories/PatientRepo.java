/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.sid.tutorials.springboot.hibernate.model.db.PatientDetails;
import com.sid.tutorials.springboot.hibernate.model.dto.PatientDetailsDTO;

/**
 * @author Lenovo
 *
 */
public interface PatientRepo extends JpaRepository<PatientDetails, Integer> {

	public PatientDetails getPatientDetailsByFirstName(String firstName);

	@Query(value = "Select id as id,first_name as firstName,last_name as lastName,phone as phone,age as age "
			+ "from patients where last_name=:lastName", nativeQuery = true)
	public List<PatientDetailsDTO> getPatientDetailsByLastName(@Param("lastName") String lastName);

}
