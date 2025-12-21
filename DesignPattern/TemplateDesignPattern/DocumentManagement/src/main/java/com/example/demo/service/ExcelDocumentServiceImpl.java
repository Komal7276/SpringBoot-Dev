package com.example.demo.service;

public class ExcelDocumentServiceImpl extends DocumentServiceAB {

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data For the Excel");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print Data in Excel ");
		return "Excel";
	}

}