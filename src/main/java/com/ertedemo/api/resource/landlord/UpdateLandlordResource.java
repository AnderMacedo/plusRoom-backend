package com.ertedemo.api.resource.landlord;

import lombok.Data;

@Data
public class UpdateLandlordResource {
    private String name;
    private String phoneNumber;
    private Integer age;
}