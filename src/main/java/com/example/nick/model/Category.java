package com.example.nick.model;
import lombok.Data;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
@Data
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;

    private String description;

    private String firstImage;

    private String secondImage;

    public Category(){}

    public Category(String name,String description, String firstImage, String secondImage){
        this.name=name;
        this.description=description;
        this.firstImage=firstImage;
        this.secondImage=secondImage;
    }

    public Long getId() {
        return id;
    }
    public String getFirstImage(){
        return firstImage;
    }
    public String getSecondImage() {
        return secondImage;
    }
    public String getDescription(){
        return description;
    }
    public String getName(){
        return name;
    }
}
