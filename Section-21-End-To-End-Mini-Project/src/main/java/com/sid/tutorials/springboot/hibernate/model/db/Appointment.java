/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import java.sql.Timestamp;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 *
 */
@Data
@NoArgsConstructor
@Entity
public class Appointment {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
	private Timestamp appointmentTime;
	private boolean strat;
	private boolean end;
	private String reason;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patientId", referencedColumnName = "id")
	private PatientDetails patientDetails;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "doctorId", referencedColumnName = "id")
	private DoctorDetails doctorDetails;

	/**
	 * @param appointmentTime
	 * @param strat
	 * @param end
	 * @param reason
	 */
	@Builder
	public Appointment(Timestamp appointmentTime, boolean strat, boolean end, String reason) {
		super();
		this.appointmentTime = appointmentTime;
		this.strat = strat;
		this.end = end;
		this.reason = reason;
	}
}
