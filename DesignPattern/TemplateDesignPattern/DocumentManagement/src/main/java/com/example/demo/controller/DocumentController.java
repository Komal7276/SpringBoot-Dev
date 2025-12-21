package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.factory.Factor;
import com.example.demo.service.DocumentService;


@RestController
public class DocumentController {
	
	@GetMapping("/print/{type}")
	public String printInvoice(@PathVariable String type)
	{
		
		DocumentService DS = Factor.CreateObject(type);
		
		DS.readData();
		DS.processData();
		return DS.printData();	
	}
}