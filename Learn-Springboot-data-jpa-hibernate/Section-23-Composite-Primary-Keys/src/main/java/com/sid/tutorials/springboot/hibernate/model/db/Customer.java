/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;

import com.sid.tutorials.springboot.hibernate.model.componentMapping.CustomerId;

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
public class Customer {

	@EmbeddedId
	private CustomerId customerId;
	private String name;

	/**
	 * @param customerId
	 * @param name
	 */
	@Builder
	public Customer(CustomerId customerId, String name) {
		super();
		this.customerId = customerId;
		this.name = name;
	}

}
