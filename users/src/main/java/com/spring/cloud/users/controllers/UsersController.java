package com.spring.cloud.users.controllers;

import com.spring.cloud.users.model.CreateUserRequestModel;
import com.spring.cloud.users.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {
    private Environment env;

    public UsersController(Environment env) {
        this.env = env;
    }

    @GetMapping("/status/check")
    public String check() {
        return "user work"+env.getProperty("local.server.port");
    }

    @PostMapping
    public String createUser(@RequestBody @Valid CreateUserRequestModel createUserModel){

    }
}
