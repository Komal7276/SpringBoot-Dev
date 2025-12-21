package com.example.demo.factory;

import com.example.demo.service.DocumentService;
import com.example.demo.service.ExcelDocumentServiceImpl;
import com.example.demo.service.PdfDocumentServiceImpl;
import com.example.demo.service.WordDocumentServiceImpl;

public class Factor
{
	public  static DocumentService CreateObject(String type)
	{
		if(type.equals("pdf"))
		{
			return new PdfDocumentServiceImpl();
		}
		if(type.equals("word"))
		{
			return new WordDocumentServiceImpl();
		}
		if(type.equals("excel"))
		{
			return new ExcelDocumentServiceImpl();
		}
		return null;
	}

}