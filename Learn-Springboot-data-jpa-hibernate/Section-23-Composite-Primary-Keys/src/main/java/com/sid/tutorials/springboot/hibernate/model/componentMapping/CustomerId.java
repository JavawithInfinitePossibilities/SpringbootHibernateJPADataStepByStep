/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.componentMapping;

import java.io.Serializable;

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
public class CustomerId implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int id;
	private String email;

	/**
	 * @param id
	 * @param email
	 */
	@Builder
	public CustomerId(int id, String email) {
		super();
		this.id = id;
		this.email = email;
	}
}
