package com.wasim.rest.api.service;

import java.util.List;

import com.wasim.rest.api.entity.Student;

public interface StudentService {
	
	public Student createStudent(Student student);
	
	public List<Student> getAllStudent();
	
	public Student updateStudent(long id, Student student);
	
	public void deleteStudent(long id);

}
