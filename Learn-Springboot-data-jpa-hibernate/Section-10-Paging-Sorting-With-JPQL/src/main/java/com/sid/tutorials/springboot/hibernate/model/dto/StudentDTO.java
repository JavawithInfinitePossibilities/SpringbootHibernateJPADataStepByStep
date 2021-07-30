/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.dto;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 *
 */
@Data
@NoArgsConstructor
public class StudentDTO implements IStudentDTO {
	private String firstName;
	private String lastName;

	/**
	 * @param firstName
	 * @param lastName
	 */
	@Builder
	public StudentDTO(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
}
