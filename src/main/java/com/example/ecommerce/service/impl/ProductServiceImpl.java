package com.example.ecommerce.service.impl;

import com.demo.models.Category;
import com.demo.models.Product;
import com.demo.repository.CategoryRepository;
import com.demo.repository.ProductRepository;
import com.demo.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;

	@Override
	public List<Product> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id).get();
	}

	@Override
	public Product createProduct(Product Product) {
		Category category = categoryRepository.findById(Product.getCategory().getId()).get();
		Product.setCategory(category);
		return productRepository.save(Product);
	}


	@Override
	public void deleteProduct(Product Product) {
		productRepository.delete(Product);
	}
	
	
	
}
