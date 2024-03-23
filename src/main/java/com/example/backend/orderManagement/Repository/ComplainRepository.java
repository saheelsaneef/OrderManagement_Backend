package com.example.backend.orderManagement.Repository;

import com.example.backend.orderManagement.Entity.Complain;

import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;

public interface ComplainRepository extends MongoRepository<Complain, String> {

    long countBy();

    long countByStatus(String status);
    List<Complain> findByComplainType(String complainType);

    List<Complain> findByCustomerMail(String customerMail);


}
