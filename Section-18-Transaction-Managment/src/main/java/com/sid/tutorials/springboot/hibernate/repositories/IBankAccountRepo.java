/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.BankAccount;

/**
 * @author Lenovo
 *
 */
public interface IBankAccountRepo extends CrudRepository<BankAccount, Integer> {

}
