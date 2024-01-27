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
@DiscriminatorValue(value = "CC")
public class CreditCard extends Payment {

	private String creditCardNumber;

	/**
	 * @param id
	 * @param amount
	 * @param creditCardNumber
	 */
	@Builder
	public CreditCard(double amount, String creditCardNumber) {
		super(amount);
		this.creditCardNumber = creditCardNumber;
	}

}
