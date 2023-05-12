package com.springreact.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.springreact.entity.Student;
import com.springreact.repository.StudentRepository;

@Service
public class StudentService {
	
	
 
StudentRepository studentrepo;

public StudentService(StudentRepository studentRepo) {
    this.studentrepo = studentRepo;
}
	
	public Student saveorUpdate(Student students) {
		
		if(students.getName()==null || students.getName().isEmpty()) {
			
			throw new IllegalArgumentException("please enter the name");
		}
			if(students.getAdd()==null || students.getAdd().isEmpty()) {
				throw new  IllegalArgumentException("please enter the add");
			
		}
			if(students.getMobile()==null || students.getMobile().isEmpty());
			
			else {
				studentrepo.save(students);
		}
		return students;
	}



	public List<Student> listAll() {	

		
	return this.studentrepo.findAll();
	}
	
	
	
	


	public void deleteStudent(String id) {

		studentrepo.deleteById(id);
	}



	public Student getstudentById(String id) {

		
		return studentrepo.findById(id).get();
	}



	public List<Student> getstudentbyname(String name) {

		return studentrepo.getStudentByName(name);
	}

	
	
	public List<Student> dummyall() { //find the all data
		
		return studentrepo.findAll();
	} 

	public Student addstudnet(Student students) {  
	
		return studentrepo.insert(students);  //add the data
	}

	public Student updatesave(Student studentss) {
		
	return studentrepo.save(studentss);  //update the data
	}

	public List<Student> getallEx(Student std) {
		Example<Student> e = Example.of(std);
		return studentrepo.findAll(e);   //finding the data using ex add,name ,mobile
	}

	public List<Student> getbyquerys(String add) {
		
		return studentrepo.abc(add);    //using mongo query
	}
	
	

}
