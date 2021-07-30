/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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
@Table(name = "studentdb")
public class Student implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "fname")
	private String firstName;

	@Column(name = "lname")
	private String lastName;

	@Column(name = "test_score")
	private int testScore;

	/**
	 * @param firstName
	 * @param lastName
	 * @param testScore
	 */
	@Builder
	public Student(String firstName, String lastName, int testScore) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.testScore = testScore;
	}

}
