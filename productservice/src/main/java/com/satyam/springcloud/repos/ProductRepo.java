package com.satyam.springcloud.repos;

import org.springframework.data.jpa.repository.JpaRepository;

import com.satyam.springcloud.model.Product;

public interface ProductRepo extends JpaRepository<Product, Long> {

}