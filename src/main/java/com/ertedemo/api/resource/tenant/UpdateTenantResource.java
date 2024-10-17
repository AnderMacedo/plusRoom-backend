package com.ertedemo.api.resource.tenant;

import lombok.Data;

@Data
public class UpdateTenantResource {
    private String name;
    private String phoneNumber;
    private Integer age;
}