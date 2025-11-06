package com.codereviewer.userService.repository;

import com.codereviewer.userService.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, String> {
    Boolean existsByEmail(String email);
}