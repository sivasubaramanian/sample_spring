package com.example.sample.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.example.sample.model.Form;

public interface FormRepository extends MongoRepository<Form,String> {
    
}
