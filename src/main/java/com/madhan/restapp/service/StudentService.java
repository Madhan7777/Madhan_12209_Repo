package com.madhan.restapp.service;

import java.util.List;

import com.madhan.restapp.model.Student;

public interface StudentService {

	public String addStudent(Student stud);


	public Student getStudent(int id);


	public List<Student> getAllStudent();


	public String updateStudent(Student stud);


	public void deleteStudent(int id);
}
