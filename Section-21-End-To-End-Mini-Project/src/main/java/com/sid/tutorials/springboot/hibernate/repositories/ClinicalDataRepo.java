/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.tutorials.springboot.hibernate.model.db.ClinicalData;

/**
 * @author Lenovo
 *
 */
public interface ClinicalDataRepo extends JpaRepository<ClinicalData, Integer> {

}
