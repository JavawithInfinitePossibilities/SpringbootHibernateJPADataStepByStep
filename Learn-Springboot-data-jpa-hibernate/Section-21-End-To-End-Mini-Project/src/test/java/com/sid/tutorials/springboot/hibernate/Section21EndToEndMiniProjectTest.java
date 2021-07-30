package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Timestamp;
import java.text.ParseException;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.model.db.Appointment;
import com.sid.tutorials.springboot.hibernate.model.db.DoctorDetails;
import com.sid.tutorials.springboot.hibernate.model.db.PatientDetails;
import com.sid.tutorials.springboot.hibernate.model.dto.Insurance;
import com.sid.tutorials.springboot.hibernate.services.IAppointmentService;
import com.sid.tutorials.springboot.hibernate.services.IDoctorServices;
import com.sid.tutorials.springboot.hibernate.services.IPatientService;

@SpringBootTest(classes = Section21EndToEndMiniProject.class)
class Section21EndToEndMiniProjectTest {

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	Random random = new Random();

	@Autowired
	private IDoctorServices iDoctorServices;

	@Disabled
	@Test
	void testLoadDoctor() {
		int count = 2;
		while (count < 6) {
			count++;
			DoctorDetails doctorDetails = DoctorDetails.builder().firstName("Doctor-First-" + random.nextInt(10))
					.lastName("Doctor-last-" + random.nextInt(10)).specility("Doctor-Specility-" + random.nextInt(10))
					.build();
			iDoctorServices.save(doctorDetails);
		}
	}

	@Autowired
	private IPatientService iPatientService;

	@Disabled
	@Test
	public void testLoadPatient() {
		int count = 2;
		while (count < 11) {
			count++;
			Insurance insurance = Insurance.builder().providerName("Insurance-" + random.nextInt(10)).copay(10d)
					.build();
			PatientDetails patientDetails = PatientDetails.builder().firstName("Patient-First-" + random.nextInt(10))
					.lastName("Patient-Last-" + random.nextInt(10)).phone("1230645789").insurance(insurance)
					.age(random.nextInt(50)).build();
			DoctorDetails doctorDetail = iDoctorServices.get(20);
			Set<DoctorDetails> doctorDetails = new HashSet<DoctorDetails>();
			doctorDetails.add(doctorDetail);
			patientDetails.setDoctorDetails(doctorDetails);
			iPatientService.save(patientDetails);
		}
	}

	@Autowired
	private IAppointmentService iAppointmentService;

	@Test
	public void testLoadAppointment() throws ParseException {
		Timestamp date = Timestamp.valueOf(LocalDateTime.now());
		Appointment appointment = Appointment.builder().appointmentTime(date).strat(true).end(true)
				.reason("cardiac arrest").build();
		DoctorDetails doctorDetail = iDoctorServices.get(20);
		PatientDetails patientDetails = iPatientService.get(15);

		appointment.setDoctorDetails(doctorDetail);
		appointment.setPatientDetails(patientDetails);
		iAppointmentService.save(appointment);
	}
}
