package com.example.demo.Service;

public class excelDocumentServiceImpl implements DocumentService{

	@Override
	public void readData() {
		// TODO Auto-generated method stub
		System.out.println("Reading data from Database");
	}

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process data for Excel");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		return "Excel";
	}

}
