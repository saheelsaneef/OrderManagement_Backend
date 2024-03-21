package com.example.backend.orderManagement.Repository;

import com.example.backend.orderManagement.Entity.Order;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface OrderRepository extends MongoRepository<Order, String> {
}
