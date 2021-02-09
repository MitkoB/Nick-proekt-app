package com.example.nick.model;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Exercise {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    @Column(length = 4000)
    private String description;

    @ManyToOne
    private Category category;
    @Column(length = 4000)
    private String imageFirst;
    @Column(length = 4000)
    private String imageSecond;
    private String repeat;

    public Exercise() {
    }

    public Exercise(String name, String description, Category category, String imageFirst, String imageSecond, String repeat) {
        this.name = name;
        this.description = description;
        this.category = category;
        this.imageFirst = imageFirst;
        this.imageSecond = imageSecond;
        this.repeat = repeat;
    }
}
