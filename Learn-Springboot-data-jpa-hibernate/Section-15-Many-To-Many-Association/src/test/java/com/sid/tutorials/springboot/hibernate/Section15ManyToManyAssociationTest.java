package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.fail;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.transaction.annotation.Transactional;

import com.sid.tutorials.springboot.hibernate.model.db.relassociation.manytomany.Programmer;
import com.sid.tutorials.springboot.hibernate.model.db.relassociation.manytomany.Project;
import com.sid.tutorials.springboot.hibernate.repositories.relassociation.manytomany.IProgrammerRepo;

@SpringBootTest(classes = Section15ManyToManyAssociation.class)
class Section15ManyToManyAssociationTest {

	@Autowired
	private IProgrammerRepo iProgrammer;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	public void testMtoMProgrammerProjectNumber() {
		Programmer programmer = Programmer.builder().name("sid sahu").salary(1000).build();
		Project project = Project.builder().name("IMOS-1").build();
		Project project2 = Project.builder().name("ETD-1").build();
		programmer.addProject(project);
		programmer.addProject(project2);
		iProgrammer.save(programmer);
	}

	@Test
	@Transactional
	public void testMtoMSelectProgrammerProjectNumber() {
		Programmer programmerSelect = iProgrammer.findById(3).get();
		assertEquals(programmerSelect.getName(), "sid sahu");
		System.out.println(programmerSelect);
	}
}
