/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetomany;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Lenovo
 *
 */
@Getter
@Setter
@NoArgsConstructor
@Entity
public class PhoneNumber {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String number;
	private String type;

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "clientId")
	private Client client;

	/**
	 * @param number
	 * @param type
	 * @param client
	 */
	@Builder
	public PhoneNumber(String number, String type) {
		super();
		this.number = number;
		this.type = type;
	}
}
