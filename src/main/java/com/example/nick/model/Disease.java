package com.example.nick.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Disease {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 5000)
    private String description;
    @Column(length = 3000)
    private String image;

    public Disease() {
    }

    public Disease(String name, String description, String image) {
        this.name = name;
        this.description = description;
        this.image = image;
    }
}
