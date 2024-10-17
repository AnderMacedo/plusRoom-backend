package com.ertedemo.api.resource.tenant;

import com.ertedemo.domain.model.entites.Tenant;
import lombok.Data;

@Data
public class TenantResponse {
    private Long id;
    private String name;
    private String email;
    private String phoneNumber;
    private Integer age;

    public TenantResponse(Tenant tenant) {
        this.id = tenant.getId();
        this.name = tenant.getName();
        this.email = tenant.getEmail();
        this.phoneNumber = tenant.getPhoneNumber();
        this.age = tenant.getAge();
    }
}