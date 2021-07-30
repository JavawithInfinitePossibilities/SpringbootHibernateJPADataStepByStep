package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetoone.Driver;
import com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetoone.License;
import com.sid.tutorials.springboot.hibernate.repositories.relassociation.onetoone.ILicenseRepo;

@SpringBootTest(classes = Section17HibernateCacheMechanism.class)
class Section17HibernateCacheMechanismTest {

	@Autowired
	private ILicenseRepo iLicenseRepo;

	@Autowired
	private EntityManager entityManager;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	public void testOneToOneDriverlicense() throws ParseException {
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd");
		License license = License.builder().type("Bike").validFrom(format.parse(LocalDate.of(2010, 01, 01).toString()))
				.validTo(format.parse(LocalDate.now().toString())).build();
		Driver driver = Driver.builder().firstName("Sid").lastName("Sahu").age(33).build();
		license.setDriver(driver);
		driver.setLicense(license);
		License LicenseSave = iLicenseRepo.save(license);
		assertEquals(license, LicenseSave);
	}

	@Test
	@Transactional
	public void testSelectOneToOneDriverlicense() {
		Session session = entityManager.unwrap(Session.class);
		License license = iLicenseRepo.findById(1).get();

		iLicenseRepo.findById(1);
		session.evict(license);
		iLicenseRepo.findById(1);
	}
}
