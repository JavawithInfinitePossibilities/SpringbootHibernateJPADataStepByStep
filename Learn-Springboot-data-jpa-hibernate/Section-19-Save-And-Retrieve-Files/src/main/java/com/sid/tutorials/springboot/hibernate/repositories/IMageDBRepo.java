/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.Image;

/**
 * @author Lenovo
 *
 */
public interface IMageDBRepo extends CrudRepository<Image, Integer> {

}
