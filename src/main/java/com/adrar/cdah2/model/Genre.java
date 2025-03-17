package com.adrar.cdah2.model;


import jakarta.persistence.*;

@Entity
@Table(name = "genre")
public class Genre {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id_genre;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    // Constructeurs :

    public Genre() {};
    public Genre(Integer id, String name) {
        this.id_genre = id;
        this.name = name;
    }
    // Getters et Setters


    public Integer getId() {
        return id_genre;
    }

    public void setId(Integer id) {
        this.id_genre = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Méthodes
}
