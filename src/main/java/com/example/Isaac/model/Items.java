package com.example.Isaac.model;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Items {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    private String descrip;
    @OneToMany(mappedBy = "items", cascade = CascadeType.ALL)
    private List<ItemsPersonajes> itemsPersonajes;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getDescrip() {
        return descrip;
    }

    public void setDescrip(String descrip) {
        this.descrip = descrip;
    }

    public List<ItemsPersonajes> getItemsPersonajes() {
        return itemsPersonajes;
    }

    public void setItemsPersonajes(List<ItemsPersonajes> itemsPersonajes) {
        this.itemsPersonajes = itemsPersonajes;
    }
}
