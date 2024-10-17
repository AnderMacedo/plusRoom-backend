package com.ertedemo.api.resource.tenant;

import lombok.Data;

@Data
public class CreateTenantResource {
    private String name;
    private String email;
    private String phoneNumber;
    private String password;
    private Integer age;
}