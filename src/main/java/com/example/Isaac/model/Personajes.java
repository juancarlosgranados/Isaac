package com.example.Isaac.model;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Personajes {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;
    @ManyToOne
    @JoinColumn(name = "Items_id")
    private Items items;
    @OneToMany(mappedBy = "personaje", cascade = CascadeType.ALL)
    private List<ItemsPersonajes> ItemsPersonajes;
    public Personajes(Long id, String nom, Items items) {
        this.id = id;
        this.nom = nom;
        this.items = items;
    }

    public Personajes() {

    }

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

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public List<com.example.Isaac.model.ItemsPersonajes> getItemsPersonajes() {
        return ItemsPersonajes;
    }

    public void setItemsPersonajes(List<com.example.Isaac.model.ItemsPersonajes> itemsPersonajes) {
        ItemsPersonajes = itemsPersonajes;
    }
}
