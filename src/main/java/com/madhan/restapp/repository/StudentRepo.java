package com.madhan.restapp.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.madhan.restapp.model.Student;

@Repository
public interface StudentRepo {

	String save(Student stud);

	Student findById(int id);

	List<Student> findAll();

	String update(Student stud);

	String deleteById(int id);
}
