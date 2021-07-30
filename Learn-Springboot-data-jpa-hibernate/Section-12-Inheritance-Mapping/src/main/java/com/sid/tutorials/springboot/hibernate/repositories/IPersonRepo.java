/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.Person;

/**
 * @author Lenovo
 *
 */
public interface IPersonRepo extends CrudRepository<Person, Integer> {

}
