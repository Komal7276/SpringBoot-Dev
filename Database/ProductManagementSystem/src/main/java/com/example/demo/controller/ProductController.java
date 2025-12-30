package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.ElectronicProducts;
import com.example.demo.service.ProductService;

@RestController
@RequestMapping("product")
public class ProductController {

	@Autowired
	ProductService productService;
	
	@PostMapping("add")
	public String addProduct(@RequestBody ElectronicProducts eleProducts)
	{
		productService.saveProduct(eleProducts);
		return MessageConstants.ELE_ITEM_ADDED;
	}
	
	
	@GetMapping("get/{id}")
	ElectronicProducts getProduct(@PathVariable int id)
	{
		return productService.getProduct(id);
	}
	
	
	@GetMapping("getAll")
	List<ElectronicProducts> getAllProducts(@RequestBody ElectronicProducts eleProducts)
	{
		return productService.getAlProucts(eleProducts);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteProduct(@PathVariable int id)
	{
		productService.deleteProduct(id);
		return MessageConstants.ELE_ITEM_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllProducts(@RequestBody ElectronicProducts eleProducts)
	{
		productService.deleteAllProducts(eleProducts);
		return MessageConstants.ELE_ALL_ITEM_DELETED;
	}
}
