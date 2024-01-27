/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import com.sid.tutorials.springboot.hibernate.model.dto.Insurance;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 *
 */
@Data
@NoArgsConstructor
@Entity(name = "patients")
public class PatientDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String phone;
	@Embedded
	private Insurance insurance;
	private int age;

	@ManyToMany
	@JoinTable(name = "doctor_patient", joinColumns = @JoinColumn(name = "patientId", referencedColumnName = "id"), inverseJoinColumns = @JoinColumn(name = "doctorId", referencedColumnName = "id"))
	private Set<DoctorDetails> doctorDetails;
	
	@OneToMany(mappedBy = "patientDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Appointment> appointments;

	@OneToMany(mappedBy = "patientDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private List<ClinicalData> clinicalDatas;
	
	/**
	 * @param id
	 * @param firstName
	 * @param lastName
	 * @param phone
	 * @param insurance
	 */
	@Builder
	public PatientDetails(String firstName, String lastName, String phone, Insurance insurance, int age) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.phone = phone;
		this.insurance = insurance;
		this.age = age;
	}

}
