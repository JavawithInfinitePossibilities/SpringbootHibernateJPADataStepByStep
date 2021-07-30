/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services;

import com.sid.tutorials.springboot.hibernate.model.db.BankAccount;

/**
 * @author Lenovo
 *
 */
public interface IBankAccountService {
	public BankAccount save(BankAccount account);

	public void transactionAccount(BankAccount from, BankAccount to, int substract);
}
