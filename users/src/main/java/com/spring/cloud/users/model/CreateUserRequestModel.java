package com.spring.cloud.users.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CreateUserRequestModel {

    @Size(min = 2)
    private String firstName;

    @Size(min = 2)
    private String lastName;

    @Size(min = 8, max = 16)
    @Pattern(regexp = "/(?=.*[0-9])(?=.*[A-Z])(?=.*[a-z])[0-9a-zA-Z]{8,}/g")
    private String password;

    @Email
    private String email;
}
