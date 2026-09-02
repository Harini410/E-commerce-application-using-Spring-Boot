package com.example.ecommerce.repository;

import com.example.ecommerce.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

// Repository for product database operations
public interface ProductRepository extends JpaRepository<Product, Long> {
}
