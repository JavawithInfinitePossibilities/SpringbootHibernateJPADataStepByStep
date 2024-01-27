/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories.relassociation.onetoone;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetoone.License;

/**
 * @author Lenovo
 *
 */
public interface ILicenseRepo extends CrudRepository<License, Integer> {

}
