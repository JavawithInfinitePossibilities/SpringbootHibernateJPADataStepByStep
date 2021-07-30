/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.Employee;

/**
 * @author Lenovo
 *
 */
public interface IEmployeeRepo extends CrudRepository<Employee, Integer> {

}
