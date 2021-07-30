/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import com.sid.tutorials.springboot.hibernate.model.db.Product;

/**
 * @author Lenovo
 *
 */
public interface IProductRepo extends JpaRepository<Product, Integer> {

	public List<Product> findByName(String name);

	public List<Product> findByNameAndDescription(String name, String description);

	public List<Product> findByPriceGreaterThanEqual(double price);

	public List<Product> findByNameLike(String name, Pageable pageable);

	public List<Product> findByNameContains(String string);
}
