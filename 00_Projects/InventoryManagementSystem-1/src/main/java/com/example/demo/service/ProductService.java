package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Product;

public interface ProductService {

	Product addProduct(Product product);

	Product updateProduct(int id, Product product);

	List<Product> getAllProducts();
	
	Product getProductById(int id);
	
	void deleteProduct(int id);
	
	List<Product> searchByName(String name);
	
	String checkStockStatus(int quantity);
	
	double calculateTotalInventoryValue();
	
	List<Product> getProductByCategory(String category);
	
	
}
