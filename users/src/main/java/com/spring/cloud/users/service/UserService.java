package com.spring.cloud.users.service;

import com.spring.cloud.users.shared.UserDto;

public interface UserService {
    UserDto createUser(UserDto userDetails);
}
