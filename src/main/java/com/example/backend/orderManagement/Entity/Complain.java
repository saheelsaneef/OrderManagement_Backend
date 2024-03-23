package com.example.backend.orderManagement.Entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "complain")
public class Complain {
    @Id
    private String id;
    private final String complainDetails;
    private String complainStatus;
    private String complainType;
    private String customerMail;
    private List<Image> images;


    public Complain(String id,String complainDetails, String complainStatus,String complainType,String customerMail,List<Image> images){
        this.id = id;
        this.complainDetails = complainDetails;
        this.complainStatus = complainStatus;
        this.complainType = complainType;
        this.customerMail = customerMail;
        this.images = images;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getComplainDetails() {
        return complainDetails;
    }


    public String getComplainStatus() {
        return complainStatus;
    }

    public void setComplainStatus(String complainStatus) {
        this.complainStatus = complainStatus;
    }

    public String getComplainType() {
        return complainType;
    }

    public void setComplainType(String complainType) {
        this.complainType = complainType;
    }

    public String getCustomerMail() {
        return customerMail;
    }

    public void setCustomerMail(String customerMail) {
        this.customerMail = customerMail;
    }

    public List<Image> getImages() {
        return images;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }
}
