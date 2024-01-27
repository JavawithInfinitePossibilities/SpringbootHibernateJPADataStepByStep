/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

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
public class ClinicalData {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String component_name;
	private String component_value;
	@Temporal(TemporalType.DATE)
	private Date measuredDateTime;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "patientId", referencedColumnName = "id")
	private PatientDetails patientDetails;

	/**
	 * @param component_name
	 * @param component_value
	 * @param measuredDateTime
	 */
	@Builder
	public ClinicalData(String component_name, String component_value, Date measuredDateTime) {
		super();
		this.component_name = component_name;
		this.component_value = component_value;
		this.measuredDateTime = measuredDateTime;
	}

}
