package com.demoapigateway.productservice.repository;

import com.demoapigateway.productservice.model.Product;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProductRepository extends MongoRepository<Product, String> {
}
