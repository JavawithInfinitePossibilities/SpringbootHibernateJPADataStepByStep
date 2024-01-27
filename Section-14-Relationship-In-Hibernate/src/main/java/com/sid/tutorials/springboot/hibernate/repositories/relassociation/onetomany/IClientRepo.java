/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories.relassociation.onetomany;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetomany.Client;

/**
 * @author Lenovo
 *
 */
public interface IClientRepo extends CrudRepository<Client, Integer> {

}
