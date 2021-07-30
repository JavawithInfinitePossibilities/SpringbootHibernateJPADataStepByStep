/**
 * 
 */
package com.sid.tutorials.springboot.hibernate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cache.annotation.EnableCaching;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @author Lenovo
 *
 */
@EnableCaching//Enable caching
@EnableAspectJAutoProxy(proxyTargetClass = true, exposeProxy = true)
@SpringBootApplication
public class Section17HibernateCacheMechanism {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		SpringApplication.run(Section17HibernateCacheMechanism.class, args);
	}

}
