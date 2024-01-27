/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.componentMapping.CustomerId;
import com.sid.tutorials.springboot.hibernate.model.db.Customer;

/**
 * @author Lenovo
 *
 */
public interface ICustomerRepo extends CrudRepository<Customer, CustomerId> {

}
