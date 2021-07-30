/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories.relassociation.onetoone;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetoone.Driver;

/**
 * @author Lenovo
 *
 */
public interface IDriverRepo extends CrudRepository<Driver, Integer> {

}
