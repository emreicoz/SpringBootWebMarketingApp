package com.example.springbootwebmarketingapp.model;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "items")
public class Item {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(length = 50)
    private String image;

    @Column(length = 25)
    private String name;

    @Column(length = 25)
    private String color;

    @Column()
    private Integer price;

    @ManyToMany(mappedBy = "items", cascade = CascadeType.ALL)
    private List<User> users;

    public Item() {
    }

    public Item(Long id, String image, String name, String color, Integer price) {
        this.id = id;
        this.image = image;
        this.name = name;
        this.color = color;
        this.price = price;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public String getImagePath() {
        return "C:/Users/emre1/IdeaProjects/SpringBootWebMarketingApp/src/main/resources/static/Pictures/" + id + "/" + image;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
