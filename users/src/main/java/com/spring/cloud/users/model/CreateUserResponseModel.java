package com.spring.cloud.users.model;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

@Getter
@Setter
public class CreateUserResponseModel {
    private String firstName;
    private String lastName;
    private String userId;
    private String email;
}
