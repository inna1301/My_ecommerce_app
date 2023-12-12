package com.example.my_ecommerce_app.repository;

import com.example.my_ecommerce_app.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CategoryRepository extends JpaRepository<Category, Integer> {
}
