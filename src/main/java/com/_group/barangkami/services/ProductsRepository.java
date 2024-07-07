package com._group.barangkami.services;

import org.springframework.data.jpa.repository.JpaRepository;

import com._group.barangkami.models.Product;

public interface ProductsRepository extends JpaRepository<Product, Integer> {

}
