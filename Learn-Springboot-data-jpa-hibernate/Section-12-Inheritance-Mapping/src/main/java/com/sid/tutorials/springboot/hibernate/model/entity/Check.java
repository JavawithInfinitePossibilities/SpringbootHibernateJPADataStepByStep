/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.entity;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

import com.sid.tutorials.springboot.hibernate.model.db.Payment;

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
@DiscriminatorValue(value = "CH")
public class Check extends Payment {

	private String checkNumber;

	/**
	 * @param id
	 * @param amount
	 * @param checkNumber
	 */
	@Builder
	public Check(double amount, String checkNumber) {
		super(amount);
		this.checkNumber = checkNumber;
	}
}
