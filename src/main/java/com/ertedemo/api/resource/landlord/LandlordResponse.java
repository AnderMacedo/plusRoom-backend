package com.ertedemo.api.resource.landlord;

import com.ertedemo.domain.model.entites.Landlord;
import lombok.Data;

@Data
public class LandlordResponse {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private Integer age;

    public LandlordResponse(Landlord landlord) {
        this.id = landlord.getId();
        this.name = landlord.getName();
        this.email = landlord.getEmail();
        this.phoneNumber = landlord.getPhoneNumber();
        this.age = landlord.getAge();
    }
}