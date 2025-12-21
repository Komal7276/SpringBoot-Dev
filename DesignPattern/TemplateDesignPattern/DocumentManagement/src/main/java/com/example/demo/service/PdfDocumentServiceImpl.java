package com.example.demo.service;

public class PdfDocumentServiceImpl extends DocumentServiceAB{

	@Override
	public void processData() {
		// TODO Auto-generated method stub
		System.out.println("Process Data for PDF");
		
	}

	@Override
	public String printData() {
		// TODO Auto-generated method stub
		System.out.println("Print Data  in PDF");
		return "PDF";
	}
	

}