/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.tutorials.springboot.hibernate.model.db.Appointment;

/**
 * @author Lenovo
 *
 */
public interface AppointmentRepo extends JpaRepository<Appointment, Integer> {

}
