package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.ElectronicProducts;

public interface ProductService {

	void saveProduct(ElectronicProducts eleProducts);
	
	ElectronicProducts getProduct(int id);
	
	List<ElectronicProducts> getAlProucts(ElectronicProducts eleProducts);
	
	void deleteProduct(int id);

	void deleteAllProducts(ElectronicProducts eleProducts);
}
