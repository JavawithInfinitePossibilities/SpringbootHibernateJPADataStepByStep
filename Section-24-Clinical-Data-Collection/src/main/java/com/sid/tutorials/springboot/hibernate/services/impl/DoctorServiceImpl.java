/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.springboot.hibernate.model.db.DoctorDetails;
import com.sid.tutorials.springboot.hibernate.repositories.DoctorRepo;
import com.sid.tutorials.springboot.hibernate.services.IDoctorServices;

/**
 * @author Lenovo
 *
 */
@Service
@Transactional
public class DoctorServiceImpl implements IDoctorServices {

	@Autowired
	private DoctorRepo doctorRepo;

	
	@Override
	public DoctorDetails save(DoctorDetails doctorDetails) {
		return doctorRepo.save(doctorDetails);
	}

	@Override
	public DoctorDetails get(int doctorId) {
		return doctorRepo.findById(doctorId).get();
	}

	@Override
	public DoctorDetails getDoctorByName(String firstName) {
		return doctorRepo.getDoctorDetailsByFirstName(firstName);
	}

	@Override
	public DoctorDetails update(DoctorDetails doctorDetails) {
		return doctorRepo.save(doctorDetails);
	}

}
