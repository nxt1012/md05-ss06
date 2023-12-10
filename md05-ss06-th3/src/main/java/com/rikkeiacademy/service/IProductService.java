package com.rikkeiacademy.service;

import com.rikkeiacademy.model.Product;

import java.util.Optional;

public interface IProductService {
    Iterable<Product> findAll();
    Optional<Product> findById(Long id);
}