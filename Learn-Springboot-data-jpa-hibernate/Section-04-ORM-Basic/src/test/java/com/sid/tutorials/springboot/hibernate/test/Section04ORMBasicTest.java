package com.sid.tutorials.springboot.hibernate.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.Section04ORMBasic;

@SpringBootTest(classes = Section04ORMBasic.class)
public class Section04ORMBasicTest {

	@Test
	void test() {
		System.out.println("Welcome to Spring boot hibernate tutorials");
	}

}
