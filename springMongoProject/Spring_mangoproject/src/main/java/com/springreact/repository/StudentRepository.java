package com.springreact.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.springreact.entity.Student;

public interface StudentRepository extends MongoRepository<Student, String> {

	public List<Student> getStudentByName(String name);

	// find by Query 
	@Query(value="{'add':{$hyd}}")
	public List<Student> abc(String add);


	public List<Student> findByName(String string);
}
