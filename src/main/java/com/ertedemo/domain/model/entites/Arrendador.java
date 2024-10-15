package com.ertedemo.domain.model.entites;

import com.ertedemo.api.resource.users.CreateUserResource;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "arrendadores")
public class Arrendador extends User {
    public Arrendador() {
        super();
    }

    public Arrendador(CreateUserResource resource) {
        super(resource);
    }
}