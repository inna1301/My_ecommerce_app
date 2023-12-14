package com.example.my_ecommerce_app.repository;

import com.example.my_ecommerce_app.model.User;
import org.springframework.data.domain.Example;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    public Optional<User> findUserByEmail(String email);
}
