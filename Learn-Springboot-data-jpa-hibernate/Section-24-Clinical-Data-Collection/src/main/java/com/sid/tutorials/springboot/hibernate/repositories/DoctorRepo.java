/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.tutorials.springboot.hibernate.model.db.DoctorDetails;

/**
 * @author Lenovo
 *
 */
public interface DoctorRepo extends JpaRepository<DoctorDetails, Integer> {

	public DoctorDetails getDoctorDetailsByFirstName(String firstName);

}
