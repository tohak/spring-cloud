package com.spring.cloud.users.controllers;

import com.spring.cloud.users.model.CreateUserRequestModel;
import com.spring.cloud.users.model.CreateUserResponseModel;
import com.spring.cloud.users.service.UserService;
import com.spring.cloud.users.shared.UserDto;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;

@RestController
@RequestMapping("/users")
public class UsersController {
    private Environment env;

    public UsersController(Environment env) {
        this.env = env;
    }

    @Autowired
    private ModelMapper modelMapper;

    @Autowired
    private UserService userService;

    @GetMapping("/status/check")
    public String check() {
        return "user work" + env.getProperty("local.server.port");
    }

    @PostMapping(
            consumes = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE},
            produces = {MediaType.APPLICATION_JSON_VALUE, MediaType.APPLICATION_XML_VALUE})
    public ResponseEntity<CreateUserResponseModel> createUser(@RequestBody @Valid CreateUserRequestModel userDetails) {
        UserDto detail = modelMapper.map(userDetails, UserDto.class);
        UserDto createdUser = userService.createUser(detail);
        CreateUserResponseModel bodyResponse = modelMapper.map(createdUser, CreateUserResponseModel.class);
        return ResponseEntity.status(HttpStatus.CREATED).body(bodyResponse);
    }

}
