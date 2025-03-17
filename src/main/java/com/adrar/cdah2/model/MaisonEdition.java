package com.adrar.cdah2.model;

import jakarta.persistence.*;

@Entity
@Table(name = "maison_edition")
public class MaisonEdition {


@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private Integer id;

@Column(name = "libele", nullable = false, length = 50)
private String libele;

@Column(name = "description", nullable = true, length = 255)
private String description;

// Constructeurs:

    public MaisonEdition() {};

    public MaisonEdition(String libele, String description) {
        this.libele = libele;
        this.description = description;
    }



// Getters et Setters
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
