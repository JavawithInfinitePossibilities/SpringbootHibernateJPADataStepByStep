/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.springboot.hibernate.model.db.PatientDetails;
import com.sid.tutorials.springboot.hibernate.repositories.PatientRepo;
import com.sid.tutorials.springboot.hibernate.services.IPatientService;

/**
 * @author Lenovo
 *
 */
@Service
@Transactional
public class PatientServiceImpl implements IPatientService {

	@Autowired
	private PatientRepo patientRepo;

	@Override
	public PatientDetails save(PatientDetails patientDetails) {
		return patientRepo.save(patientDetails);
	}

	@Override
	public PatientDetails get(int patientId) {
		return patientRepo.findById(patientId).get();
	}

	@Override
	public PatientDetails getPatientByName(String firstName) {
		return patientRepo.getPatientDetailsByFirstName(firstName);
	}

	@Override
	public PatientDetails update(PatientDetails patientDetails) {
		return patientRepo.save(patientDetails);
	}

	@Override
	public List<PatientDetails> getAllPatient() {
		return patientRepo.findAll();
	}

}
