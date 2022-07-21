package com.swith.backend.domain.user.domain.repository;

import com.swith.backend.domain.user.domain.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long> { }
