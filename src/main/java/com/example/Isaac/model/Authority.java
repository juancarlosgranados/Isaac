package com.example.Isaac.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="authorities")

public class Authority {
    @Id
    public String username;
    public String authority;
}
