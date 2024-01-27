/**
 * 
 */
package com.sid.tutorials.springboot.hibernate.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.springboot.hibernate.model.db.Appointment;
import com.sid.tutorials.springboot.hibernate.repositories.AppointmentRepo;
import com.sid.tutorials.springboot.hibernate.services.IAppointmentService;

/**
 * @author Lenovo
 *
 */
@Service
@Transactional
public class AppointmentServicesImpl implements IAppointmentService {

	@Autowired
	private AppointmentRepo appointmentRepo;

	@Override
	public Appointment save(Appointment doctorDetails) {
		return appointmentRepo.save(doctorDetails);
	}

	@Override
	public Appointment get(int appointmentId) {
		return appointmentRepo.findById(appointmentId).get();
	}

	@Override
	public Appointment update(Appointment doctorDetails) {
		return appointmentRepo.save(doctorDetails);
	}

}
