package com.wasim.rest.api.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.wasim.rest.api.entity.Student;
import com.wasim.rest.api.service.StudentService;

@RestController
@RequestMapping("/api/")
public class StudentController {

	@Autowired
	private StudentService studentService;
	
	@PostMapping("/saveStudent")
	public ResponseEntity<Student> createStudent(@RequestBody Student student) {
		
		return new ResponseEntity<Student>(studentService.createStudent(student), HttpStatus.CREATED);
	}
	
	@GetMapping("/getAllStudent")
	public ResponseEntity<List<Student>> getAllStudent(){
		
		return new ResponseEntity<List<Student>>(studentService.getAllStudent(), HttpStatus.OK);
	}
	
	@PutMapping("/editStudent/{id}")
	public ResponseEntity<Student> updateStudent(@PathVariable("id") long id, @RequestBody Student student){
		return new ResponseEntity<Student>(studentService.updateStudent(id, student), HttpStatus.OK);
	}
	
	@DeleteMapping("/deleteStudent/{id}")
	public ResponseEntity<HttpStatus> deleteStudent(@PathVariable("id") long id){
		studentService.deleteStudent(id);
		return new ResponseEntity<HttpStatus>(HttpStatus.OK);
	}
}
