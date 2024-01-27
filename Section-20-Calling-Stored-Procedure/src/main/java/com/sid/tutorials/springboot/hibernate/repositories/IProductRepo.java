/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.repositories;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import com.sid.tutorials.springboot.hibernate.model.db.Product;

/**
 * @author Lenovo
 *
 */
public interface IProductRepo extends CrudRepository<Product, Integer> {

	public List<Product> findByName(String name);

	public List<Product> findByNameAndDescription(String name, String description);

	public List<Product> findByPriceGreaterThanEqual(double price);

	public List<Product> findByNameLike(String name, Pageable pageable);

	@Query(value = "CALL GetAllProducts", nativeQuery = true)
	public List<Product> getAllProduct();

	@Query(value = "CALL GetAllProductsByPrice(:price)", nativeQuery = true)
	public List<Product> getAllProductsByPrice(@Param("price") int price);

	@Query(value = "CALL GetAllProductCountByPrice(:price)", nativeQuery = true)
	public int getAllProductCountByPrice(@Param("price") int price);
}
