/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

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
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int accountNo;

	private String name;
	private int balance;

	/**
	 * @param name
	 * @param balance
	 */
	@Builder
	public BankAccount(String name, int balance) {
		super();
		this.name = name;
		this.balance = balance;
	}
}
