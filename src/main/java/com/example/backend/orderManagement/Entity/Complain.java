package com.example.backend.orderManagement.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.List;


@Document(collection = "complain")
public class  Complain {
    @Id
    private String id;
    private String complainDetails;
    private String complainStatus;
    private String complainType;
    private List<Image> images;

}

