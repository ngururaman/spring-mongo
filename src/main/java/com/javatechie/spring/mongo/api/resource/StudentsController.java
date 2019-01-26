package com.javatechie.spring.mongo.api.resource;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javatechie.spring.mongo.api.model.Students;
import com.javatechie.spring.mongo.api.repository.StudentsRepository;

@RestController
public class StudentsController {

	@Autowired
	private StudentsRepository repository;

	@PostMapping("/addStudent")
	public String saveStudent(@RequestBody Students student) {
		repository.save(student);
		return "Added student with id : " + student.getId();
	}

	@GetMapping("/findAllStudents")
	public List<Students> getStudents() {
		return repository.findAll();
	}

	@GetMapping("/findAllStudents/{id}")
	public Optional<Students> getStudent(@PathVariable int id) {
		return repository.findById(id);
	}

	@DeleteMapping("/delete/{id}")
	public String deleteStudent(@PathVariable int id) {
		repository.deleteById(id);
		return "Student deleted with id : " + id;
	}
}