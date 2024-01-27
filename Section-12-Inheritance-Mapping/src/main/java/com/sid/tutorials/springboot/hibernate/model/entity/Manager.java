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
public class Manager extends Person {

	private String employeeNumber;

	/**
	 * @param firstName
	 * @param lastName
	 * @param employeeNumber
	 */
	@Builder
	public Manager(String firstName, String lastName, String employeeNumber) {
		super(firstName, lastName);
		this.employeeNumber = employeeNumber;
	}

}
