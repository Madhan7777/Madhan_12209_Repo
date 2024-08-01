package com.madhan.restapp.serviceimpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.madhan.restapp.model.Student;
import com.madhan.restapp.repository.StudentRepo;

@Service
public class StudentServiceImpl {

	@Autowired
	StudentRepo repo;
	
	public String addStudent(Student stud) {
		return(repo.save(stud));
		
	}

	public Student getStudent(int id) {
		return repo.findById(id);
	}

	public List<Student> getAllStudent() {
		return repo.findAll();
	}

	public String updateStudent(Student stud) {
		return(repo.update(stud));
		
	}

	public String deleteStudent(int id) {
		return(repo.deleteById(id));
	}

}
