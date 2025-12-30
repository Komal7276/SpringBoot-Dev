package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.ElectronicProducts;
import com.example.demo.repository.ElectronicRepository;
import com.example.demo.service.ProductService;

@Service
public class ElectronicProductServiceImpl implements ProductService{

	@Autowired
	ElectronicRepository eleRepository;
	
	@Override
	public void saveProduct(ElectronicProducts eleProducts) {
		// TODO Auto-generated method stub
	eleRepository.save(eleProducts);	
	}

	@Override
	public ElectronicProducts getProduct(int id) {
		// TODO Auto-generated method stub
		return eleRepository.findById(id).get();
	}

	@Override
	public List<ElectronicProducts> getAlProucts(ElectronicProducts eleProducts) {
		// TODO Auto-generated method stub
		return eleRepository.findAll();
	}

	@Override
	public void deleteProduct(int id) {
		// TODO Auto-generated method stub
		eleRepository.deleteById(id);
	}

	@Override
	public void deleteAllProducts(ElectronicProducts eleProducts) {
		// TODO Auto-generated method stub
		eleRepository.deleteAll();
	}

}
