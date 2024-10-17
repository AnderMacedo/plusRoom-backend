package com.ertedemo.domain.model.entites;

import com.ertedemo.api.resource.landlord.CreateLandlordResource;
import com.ertedemo.api.resource.landlord.UpdateLandlordResource;
import com.ertedemo.api.resource.tenant.CreateTenantResource;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "landlords")

public class Landlord {
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
    // Other fields related to Landlords

    public Landlord() {
    }
    public Landlord(CreateLandlordResource resource) {
        this.name = resource.getName();
        this.email = resource.getEmail();
        this.phoneNumber = resource.getPhoneNumber();
        this.password = resource.getPassword();
        this.age = resource.getAge();
    }

    public void updateLandlord(UpdateLandlordResource resource) {
        this.name = resource.getName();
        this.phoneNumber = resource.getPhoneNumber();
        this.age = resource.getAge();
    }

}
