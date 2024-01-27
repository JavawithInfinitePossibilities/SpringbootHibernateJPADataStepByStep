/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.Payment;

/**
 * @author Lenovo
 *
 */
public interface IPaymentRepo extends CrudRepository<Payment, Integer> {

}
