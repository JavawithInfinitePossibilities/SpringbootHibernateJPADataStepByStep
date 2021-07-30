/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.entity;

import javax.persistence.Entity;

import com.sid.tutorials.springboot.hibernate.model.db.Person;

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
public class Contractor extends Person {

	private String employeeNumber;
	private String managerNumber;

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 * @param managerNumber
	 */
	@Builder
	public Contractor(String firstName, String lastName, String employeeNumber, String managerNumber) {
		super(firstName, lastName);
		this.employeeNumber = employeeNumber;
		this.managerNumber = managerNumber;
	}
}
