package com.ertedemo.domain.model.entites;

import com.ertedemo.api.resource.tenant.CreateTenantResource;
import com.ertedemo.api.resource.tenant.UpdateTenantResource;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "tenants")
public class Tenant {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "email", unique = true, nullable = false)
    private String email;

    @Column(name = "phone_number")
    private String phoneNumber;

    @Column(name = "password", nullable = false)
    private String password;

    @Column(name = "age", nullable = false)
    private Integer age;
    // Other fields related to Tenants

    public Tenant() {
    }
    public Tenant(CreateTenantResource resource) {
        this.name = resource.getName();
        this.email = resource.getEmail();
        this.phoneNumber = resource.getPhoneNumber();
        this.password = resource.getPassword();
        this.age = resource.getAge();
    }
    public void updateTenant(UpdateTenantResource resource) {
        this.name = resource.getName();
        this.phoneNumber = resource.getPhoneNumber();
        this.age = resource.getAge();
    }
}
