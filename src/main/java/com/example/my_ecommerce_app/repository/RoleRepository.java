package com.example.my_ecommerce_app.repository;

import com.example.my_ecommerce_app.model.Role;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoleRepository extends JpaRepository<Role, Integer> {
}
