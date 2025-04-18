package com.bright.pagingdemo.repository;


import com.bright.pagingdemo.model.Product;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Optional<Product> findByName(String name);//find a product by name
    Page<Product> findByCategory(String category, Pageable pageable);
}
