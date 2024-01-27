/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetomany;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

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
public class Client {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int clientId;
	private String name;

	@OneToMany(mappedBy = "client", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
	private Set<PhoneNumber> phoneNumbers;

	/**
	 * @param name
	 */
	@Builder
	public Client(String name) {
		super();
		this.name = name;
	}

	/**
	 * @param name
	 * @param phoneNumber
	 */
	@Builder
	public Client(String name, Set<PhoneNumber> phoneNumber) {
		super();
		this.name = name;
		this.phoneNumbers = phoneNumber;
	}

	/** 
	 * This will help us to add the cascading to the client
	 */
	public void addPhoneNumber(PhoneNumber phoneNumber) {
		if (phoneNumber != null) {
			if (phoneNumbers == null) {
				phoneNumbers = new HashSet<PhoneNumber>();
			}
			phoneNumbers.add(phoneNumber);
			phoneNumber.setClient(this);
		}
	}

	/*
	 * We can not include the toString method as it cause the cyclic dependency which will lead to stackoverflow issue
	 */
}
