/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.Vehicle;

/**
 * @author Lenovo
 *
 */
public interface IVehicleRepo extends CrudRepository<Vehicle, Integer> {

}
