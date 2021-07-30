/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories.relassociation.onetomany;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetomany.PhoneNumber;

/**
 * @author Lenovo
 *
 */
public interface IPhoneNumberRepo extends CrudRepository<PhoneNumber, Integer> {

}
