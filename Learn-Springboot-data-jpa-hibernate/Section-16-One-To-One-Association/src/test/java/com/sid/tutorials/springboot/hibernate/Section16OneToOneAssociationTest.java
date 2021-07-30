package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetoone.Driver;
import com.sid.tutorials.springboot.hibernate.model.db.relassociation.onetoone.License;
import com.sid.tutorials.springboot.hibernate.repositories.relassociation.onetoone.ILicenseRepo;

@SpringBootTest(classes = Section16OneToOneAssociation.class)
class Section16OneToOneAssociationTest {

	@Autowired
	private ILicenseRepo iLicenseRepo;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

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
}
