/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories.relassociation.manytomany;

import org.springframework.data.repository.CrudRepository;

import com.sid.tutorials.springboot.hibernate.model.db.relassociation.manytomany.Project;

/**
 * @author Lenovo
 *
 */
public interface IProjectRepo extends CrudRepository<Project, Integer> {

}
