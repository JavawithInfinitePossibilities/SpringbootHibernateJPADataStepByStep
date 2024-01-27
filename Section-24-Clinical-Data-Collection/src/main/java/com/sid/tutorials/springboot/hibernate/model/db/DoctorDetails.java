/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Lenovo
 * I have removed the @Data annotation and added only @Setter and @Getter annotation.
 * @Data annotation has @EqualsAndHashCode and @ToString which is causing the issue.
 * Or an alternate to this we can add below 2 tags. This will exclude the @EqualsAndHashCode and @ToString
 * @EqualsAndHashCode.Exclude
 * @ToString.Exclude
 *
 */
@Setter
@Getter
@NoArgsConstructor
@Entity(name = "doctors")
public class DoctorDetails {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String firstName;
	private String lastName;
	private String specility;

	@ManyToMany(mappedBy = "doctorDetails")
	private Set<PatientDetails> patientDetails;

	@OneToMany(mappedBy = "doctorDetails", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<Appointment> appointments;

	/**
	 * @param firstName
	 * @param lastName
	 * @param specility
	 */
	@Builder
	public DoctorDetails(String firstName, String lastName, String specility) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.specility = specility;
	}
}
