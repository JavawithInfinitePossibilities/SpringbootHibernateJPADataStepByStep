/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.mongo.model.db;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Lenovo
 *
 */
@Setter
@Getter
@NoArgsConstructor
@Document
public class Product {

	@Id
	private String id;
	private String name;
	private double price;

}
