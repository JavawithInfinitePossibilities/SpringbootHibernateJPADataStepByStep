/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services;

import com.sid.tutorials.springboot.hibernate.model.db.Appointment;

/**
 * @author Lenovo
 *
 */
public interface IAppointmentService {

	public Appointment save(Appointment doctorDetails);

	public Appointment get(int appointmentId);

	public Appointment update(Appointment doctorDetails);
}
