package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Product;
import com.example.demo.repository.ProductRepository;
import com.example.demo.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	@Autowired
	ProductRepository productRepository;
	
	
	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(int id, Product product) {
		// TODO Auto-generated method stub
		return productRepository.save(product);
	}

	@Override
	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return productRepository.findAll();
	}

	@Override
	public Product getProductById(int id) {
		// TODO Auto-generated method stub
		return productRepository.findById(id).get();
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		productRepository.deleteById(id);
	}

	@Override
	public List<Product> searchByName(String name) {
		// TODO Auto-generated method stub
		return productRepository.findByNameContainingIgnoreCase(name);
	}

	@Override
	public String checkStockStatus(int quantity) {
		// TODO Auto-generated method stub
		
		if(quantity > 0)
		{
			return MessageConstants.IN_STOCK;
		}
		else
		{
			return MessageConstants.OUT_OF_STOCK;
		}
	}

	@Override
	public double calculateTotalInventoryValue() {
		// TODO Auto-generated method stub
		
		List<Product> products = productRepository.findAll();
		
		double total = 0;
		
		for(int i=0; i<products.size(); i++)
		{
			total = total + products.get(i).getPrice() * products.get(i).getQuantity();
		}
		
		return total;
	}

	@Override
	public List<Product> getProductByCategory(String category) {
		// TODO Auto-generated method stub
		return productRepository.findByNameContainingIgnoreCase(category);
	}

}
