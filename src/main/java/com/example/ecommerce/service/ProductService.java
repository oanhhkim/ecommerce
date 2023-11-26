package com.example.ecommerce.service;

import com.demo.models.Product;

import java.util.List;

public interface ProductService {

	List<Product> getAllProduct();

	Product getProductById(Long id);

	Product createProduct(Product Product);

	Product editProduct(Product Product, Long id);

	void deleteProduct(Product Product);

}
