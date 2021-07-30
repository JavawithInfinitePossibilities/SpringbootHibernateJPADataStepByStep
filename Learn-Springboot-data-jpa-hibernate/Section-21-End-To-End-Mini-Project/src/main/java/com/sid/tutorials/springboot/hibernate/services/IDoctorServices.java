/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services;

import com.sid.tutorials.springboot.hibernate.model.db.DoctorDetails;

/**
 * @author Lenovo
 *
 */
public interface IDoctorServices {

	public DoctorDetails save(DoctorDetails doctorDetails);

	public DoctorDetails get(int doctorId);

	public DoctorDetails getDoctorByName(String firstName);

	public DoctorDetails update(DoctorDetails doctorDetails);
}
