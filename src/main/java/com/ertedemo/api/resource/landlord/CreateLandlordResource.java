package com.ertedemo.api.resource.landlord;

import lombok.Data;

@Data
public class CreateLandlordResource {
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Integer age;
}