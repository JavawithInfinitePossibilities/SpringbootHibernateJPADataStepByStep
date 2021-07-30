/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db.componentMapping;

import javax.persistence.Embeddable;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 *
 */
@Data
@NoArgsConstructor
@Embeddable
public class Address {

	private String streetaddress;
	private String city;
	private String state;
	private String zipcode;
	private String country;

	/**
	 * @param streetaddress
	 * @param city
	 * @param state
	 * @param zipcode
	 * @param country
	 */
	@Builder
	public Address(String streetaddress, String city, String state, String zipcode, String country) {
		super();
		this.streetaddress = streetaddress;
		this.city = city;
		this.state = state;
		this.zipcode = zipcode;
		this.country = country;
	}
}
