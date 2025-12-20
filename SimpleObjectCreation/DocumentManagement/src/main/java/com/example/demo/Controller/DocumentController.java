package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Service.DocumentService;
import com.example.demo.Service.PdfDocumentServiceImpl;
import com.example.demo.Service.excelDocumentServiceImpl;
import com.example.demo.Service.wordDocumentServiceImpl;

@RestController
public class DocumentController {
	
	@GetMapping("print/{type}")
	public String printInvoice(@PathVariable String type)
	{
		DocumentService ds = null;
		
		if(type.equals("pdf"))
		{
			ds = new PdfDocumentServiceImpl();
		}
		
		if(type.equals("word"))
		{
			ds = new wordDocumentServiceImpl();
		}
		if(type.equals("excel"))
		{
			ds = new excelDocumentServiceImpl();
			
		}
		
		
		ds.readData();
		ds.processData();
		return ds.printData();
		
		
	}

}
