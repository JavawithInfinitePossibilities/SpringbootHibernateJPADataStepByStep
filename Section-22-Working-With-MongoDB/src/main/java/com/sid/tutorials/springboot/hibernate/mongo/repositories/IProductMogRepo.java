/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.mongo.repositories;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.sid.tutorials.springboot.hibernate.mongo.model.db.Product;

/**
 * @author Lenovo
 *
 */
public interface IProductMogRepo extends MongoRepository<Product, String> {

}
