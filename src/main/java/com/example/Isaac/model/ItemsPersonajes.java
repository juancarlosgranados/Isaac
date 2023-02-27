package com.example.Isaac.model;
import jakarta.persistence.*;
@Entity
@Table(name ="Items_personajes")
public class ItemsPersonajes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name ="Items_id")
    private Items items;

    @ManyToOne
    @JoinColumn(name ="Personajes_id")
    private Personajes personaje;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Items getItems() {
        return items;
    }

    public void setItems(Items items) {
        this.items = items;
    }

    public Personajes getPersonaje() {
        return personaje;
    }

    public void setPersonaje(Personajes personaje) {
        this.personaje = personaje;
    }
}
