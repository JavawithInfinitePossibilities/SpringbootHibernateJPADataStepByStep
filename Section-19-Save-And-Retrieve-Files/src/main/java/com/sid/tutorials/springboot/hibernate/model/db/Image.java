/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.db;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;

import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author Lenovo
 *
 */
@Data
@NoArgsConstructor
@Entity
public class Image {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	@Lob
	private byte[] data;

	/**
	 * @param name
	 * @param data
	 */
	@Builder
	public Image(String name, byte[] data) {
		super();
		this.name = name;
		this.data = data;
	}
}
