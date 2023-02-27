package com.example.Isaac.model;
import jakarta.persistence.*;

import java.util.List;
@Entity
public class Boses {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nom;

    private  String desc;

}
