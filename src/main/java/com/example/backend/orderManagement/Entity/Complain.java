package com.example.backend.orderManagement.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document
public class  Complain {
    @Id
    private String id;

    private String name;
}

