/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import java.io.Serializable;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 *
 */
@Data
@NoArgsConstructor
@Entity(name = "employee")
@Table
public class Employee implements Serializable {

	/**	
	 * 
	 */
	private static final long serialVersionUID = 1L;

	/*
	 * @TableGenerator(name = "employee_gen", table = "id_gen", pkColumnName =
	 * "gen_Name", valueColumnName = "gen_Val", allocationSize = 100)
	 * 
	 * @GeneratedValue(strategy = GenerationType.TABLE, generator = "employee_gen")
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private long id;

	private String firstName;
	private String lastName;

	@Embedded
	private Address address;

	/**
	 * @param firstName
	 * @param lastName
	 * @param address
	 */
	@Builder
	public Employee(String firstName, String lastName, Address address) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
	}
}
