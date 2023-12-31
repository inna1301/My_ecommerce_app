package com.example.my_ecommerce_app.repository;

import com.example.my_ecommerce_app.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProductRepository extends JpaRepository<Product, Long> {
    public List<Product> findAllByCategory_Id(Integer id);
}
