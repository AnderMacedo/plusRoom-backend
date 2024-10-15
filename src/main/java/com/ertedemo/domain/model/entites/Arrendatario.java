package com.ertedemo.domain.model.entites;

import com.ertedemo.api.resource.users.CreateUserResource;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "arrendatarios")
public class Arrendatario extends User {
    public Arrendatario() {
        super();
    }

    public Arrendatario(CreateUserResource resource) {
        super(resource);
    }
}