package com.sid.tutorials.springboot.hibernate;

import static org.junit.jupiter.api.Assertions.fail;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.sid.tutorials.springboot.hibernate.model.db.Image;
import com.sid.tutorials.springboot.hibernate.repositories.IMageDBRepo;

@SpringBootTest(classes = Section19SaveAndRetrieveFiles.class)
class Section19SaveAndRetrieveFilesTest {

	@Autowired
	private IMageDBRepo iMageDBRepo;

	@Disabled
	@Test
	void test() {
		fail("Not yet implemented");
	}

	@Disabled
	@Test
	public void testImageBLOB() throws IOException {
		File file = new File("D:\\Test\\prince_of_persia_the_two_thrones_large_9_1024.jpg");
		byte[] fileByte = new byte[(int) file.length()];
		Image image = Image.builder().name("prince_of_persia_the_two_thrones_large_9_1024.jpg").data(fileByte).build();
		iMageDBRepo.save(image);
	}

	/**
	 * 
	 * @throws IOException
	 * If the Image is to large and unable to retrieve from the DB then execute the below query in DB <br/>
	 * set global max_allowed_packet=32*1024*1024;
	 */
	@Test
	public void testReadImageBLOB() throws IOException {
		Image image = iMageDBRepo.findById(2).get();
		FileOutputStream outputStream = new FileOutputStream(new File("D:\\Test\\download\\" + image.getName()));
		outputStream.write(image.getData());
		outputStream.flush();
		outputStream.close();
	}
}
