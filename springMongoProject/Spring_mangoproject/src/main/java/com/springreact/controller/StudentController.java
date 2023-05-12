package com.springreact.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.springreact.entity.Student;
import com.springreact.service.StudentService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/student")
@CrossOrigin(origins = "*")
public class StudentController {

	
	 private final StudentService studentser;

	   
	    public StudentController(StudentService studentService) {
	        this.studentser = studentService;
	    }

	@PostMapping("/save")
//	public String saveStudent( @RequestBody Student students) {
//
//		studentser.saveorUpdate(students);
//		return students.getId();
		public ResponseEntity<String> saveStudent(@RequestBody Student student) {
	        try {
	        	studentser.saveorUpdate(student);
	            return ResponseEntity.ok("Student saved successfully");
	        } catch (IllegalArgumentException e) {
	            return ResponseEntity.badRequest().body(e.getMessage());
	        }
	    
		
	}
//get all data
	@GetMapping("/getall")
	private List<Student> getStudents() {

		return studentser.listAll();
	}
	
	
	
	//find by id and update
	@PutMapping("/edit/{id}")
	private Student update(@RequestBody Student student, @PathVariable(name = "id") String id) {

		student.setId(id);
		studentser.saveorUpdate(student);
		return student;
	}
//Delete by id using id
	@DeleteMapping("/delete/{id}")

	private void DeleteStudent(@PathVariable("id") String id) {

		studentser.deleteStudent(id);
	}

	//find by id
	@RequestMapping("/student/{id}")
	private Student getstudent(@PathVariable(name = "id") String id) {
		return studentser.getstudentById(id);
	}
//find by name
	@GetMapping("/get/{name}")
	private List<Student> getStudentss( @PathVariable(name="name")String name){
		
		
		return studentser.getstudentbyname(name);
		
	}
	
	//get all data 
	@GetMapping("/dummy")
	private List<Student> dummylist(){
		return studentser.dummyall();

	}
	//post the data
	@PostMapping("/dummypost")
	private Student addstudent(@RequestBody Student students) {
		return studentser.addstudnet(students);
	}
	//update data
	@PutMapping("/dummyupdate")
	private Student updatestudent (@RequestBody Student studentss) {
		return studentser.updatesave(studentss);
	}
	//find by data using data ex add, name, mobile
	@GetMapping("/dummyex")
	private List<Student> getallEx(@RequestBody Student std){
		
		return studentser.getallEx(std);
	}
	//using by mongodb Query
	@GetMapping("/query")
	private List<Student> getbyquery(@RequestParam(name="add")String add){
		return studentser.getbyquerys(add);
	}
	
}
