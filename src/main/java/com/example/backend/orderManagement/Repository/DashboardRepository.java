package com.example.backend.orderManagement.Repository;

import com.example.backend.orderManagement.Entity.Dashboard;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface DashboardRepository extends MongoRepository<Dashboard, String> {
}
