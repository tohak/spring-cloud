package com.spring.cloud.users.service;

import com.spring.cloud.users.shared.UserDto;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class UserServiceImp implements UserService {
    @Override
    public UserDto createUser(UserDto userDetails) {
        userDetails.setUserId(UUID.randomUUID().toString());
        return null;
    }
}
