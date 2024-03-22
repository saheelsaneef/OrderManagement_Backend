package com.example.backend.orderManagement.Repository;

import com.example.backend.orderManagement.Entity.Complain;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface ComplainRepository extends MongoRepository<Complain, String> {
}
