/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories.relassociation.manytomany;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.relassociation.manytomany.Programmer;

/**
 * @author Lenovo
 *
 */
public interface IProgrammerRepo extends CrudRepository<Programmer, Integer> {

}
