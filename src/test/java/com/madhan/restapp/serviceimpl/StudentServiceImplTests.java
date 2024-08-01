package com.madhan.restapp.serviceimpl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.madhan.restapp.model.Student;

@SpringBootTest
class StudentServiceImplTests {

	@Autowired
	StudentServiceImpl ssi;
	
	@Test
	void testAddStudent() {
		Student obj = new Student(0,"Murthi","eee","Third Year",78,null);
		assertEquals("success", ssi.addStudent(obj));
	}

	@Test
	void testGetStudent() {
		assertNotNull(ssi.getStudent(11));
	}

	@Test
	void testGetAllStudent() {
		assertNotNull(ssi.getAllStudent());
	}

	@Test
	void testUpdateStudent() {
		Student obj = new Student(6,"geethaa","ece","Third Year",435,null);
		assertEquals("success", ssi.updateStudent(obj));
	}

//	@Test
//	void testDeleteStudent() {
//		assertEquals("deleted", ssi.deleteStudent(7));
//	}

}
