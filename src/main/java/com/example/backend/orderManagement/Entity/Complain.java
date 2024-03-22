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

    public String getId() {
        return id;
    }

    public String getAllComplains() {
        return complainDetails;
    }

    public String getComplainStatus() {
        return complainStatus;
    }

    public String getComplainType() {
        return complainType;
    }

    public List<Image> getImages() {
        return images;
    }


    public void setId(String id) {
        this.id = id;
    }

    public void getComplainDetails(String complainDetails) {
        this.complainDetails = complainDetails;
    }

    public void setComplainStatus(String complainStatus) {
        this.complainStatus = complainStatus;
    }


}

