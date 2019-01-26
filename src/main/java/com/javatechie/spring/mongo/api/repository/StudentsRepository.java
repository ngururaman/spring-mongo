package com.javatechie.spring.mongo.api.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.javatechie.spring.mongo.api.model.Students;

public interface StudentsRepository extends MongoRepository<Students, Integer>{

}
