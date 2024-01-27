/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.model.entity;

import javax.persistence.Entity;
import javax.persistence.PrimaryKeyJoinColumn;

import com.sid.tutorials.springboot.hibernate.model.db.Vehicle;

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
@PrimaryKeyJoinColumn(name = "id")
public class Vehicle4Wheeler extends Vehicle {

	private String vehicleType;
	private String vehileBrand;

	/**
	 * @param vahicleNumber
	 * @param vahicleCategory
	 * @param vehicleType
	 * @param vehileBrand
	 */
	@Builder
	public Vehicle4Wheeler(String vahicleNumber, String vahicleCategory, String vehicleType, String vehileBrand) {
		super(vahicleNumber, vahicleCategory);
		this.vehicleType = vehicleType;
		this.vehileBrand = vehileBrand;
	}

}
