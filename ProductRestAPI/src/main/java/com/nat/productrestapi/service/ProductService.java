package com.nat.productrestapi.service;

import java.util.List;
import java.util.Optional;

import com.nat.productrestapi.model.Product;



public interface ProductService {
	public Product createProduct(Product product);
	public Optional<Product> getProductById(int id);
	public void deleteProduct(int id);
	public Optional<List<Product>> getProducts();
	public Optional<List<Product>> getProductsByCategory(String cat);
}
