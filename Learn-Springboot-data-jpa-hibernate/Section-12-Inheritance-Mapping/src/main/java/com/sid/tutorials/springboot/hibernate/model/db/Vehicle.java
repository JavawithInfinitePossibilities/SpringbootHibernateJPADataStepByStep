/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;

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
@Inheritance(strategy = InheritanceType.JOINED)
public class Vehicle {

	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String vahicleNumber;
	private String vahicleCategory;

	/**
	 * @param vahicleNumber
	 * @param vahicleCategory
	 */
	public Vehicle(String vahicleNumber, String vahicleCategory) {
		this.vahicleNumber = vahicleNumber;
		this.vahicleCategory = vahicleCategory;
	}

}
