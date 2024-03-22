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

    public String getComplainDetails() {
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

    public void setComplainDetails(String complainDetails) {
        this.complainDetails = complainDetails;
    }

    public void setComplainStatus(String complainStatus) {
        this.complainStatus = complainStatus;
    }

    public void setComplainType(String complainType) {
        this.complainType = complainType;
    }

    public void setImages(List<Image> images) {
        this.images = images;
    }

}

