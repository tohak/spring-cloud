package com.spring.cloud.users.repository;

import com.spring.cloud.users.data.UserEntity;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<Long, UserEntity> {
}
