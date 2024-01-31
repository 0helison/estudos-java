package com.dev.commerce.services;

import com.dev.commerce.dto.ProductDTO;
import com.dev.commerce.entities.Product;
import com.dev.commerce.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class ProductService {

    @Autowired
    private ProductRepository repository;

    public ProductDTO findById(Long id) {
        Optional<Product> result = repository.findById(id);
        Product product = result.get();
        

    }
}
