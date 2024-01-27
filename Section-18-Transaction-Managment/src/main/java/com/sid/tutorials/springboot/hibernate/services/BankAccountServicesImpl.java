/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.springboot.hibernate.model.db.BankAccount;
import com.sid.tutorials.springboot.hibernate.repositories.IBankAccountRepo;

/**
 * @author Lenovo
 *
 */
@Service
public class BankAccountServicesImpl implements IBankAccountService {

	@Autowired
	private IBankAccountRepo iBankAccountRepo;

	@Override
	public BankAccount save(BankAccount account) {
		return iBankAccountRepo.save(account);
	}

	/**
	 * A Transaction is a do all or nothing will happen. <br/> 
	 * All the communication to database in one transaction is treated as one transaction.
	 */
	@Override
	@Transactional
	public void transactionAccount(BankAccount from, BankAccount to, int substract) {
		from.setBalance(from.getBalance() - substract);
		iBankAccountRepo.save(from);
		/*if (true) {
			throw new RuntimeException();
		}*/
		to.setBalance(to.getBalance() + substract);
		iBankAccountRepo.save(to);
	}
}
