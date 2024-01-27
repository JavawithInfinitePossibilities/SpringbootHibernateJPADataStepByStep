/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services;

import java.util.List;

import com.sid.tutorials.springboot.hibernate.model.db.PatientDetails;
import com.sid.tutorials.springboot.hibernate.model.dto.PatientDetailsDTO;

/**
 * @author Lenovo
 *
 */
public interface IPatientService {

	public PatientDetails save(PatientDetails patientDetails);

	public PatientDetails get(int patientId);

	public PatientDetails getPatientByName(String firstName);

	public PatientDetailsDTO getPatientByLast(String lastName);

	public PatientDetails update(PatientDetails patientDetails);

	public List<PatientDetails> getAllPatient();
}
