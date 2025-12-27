package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.LoanApprovalService;
import com.example.demo.serviceImpl.EducationLoanApprovalServiceImpl;
import com.example.demo.serviceImpl.HomeLoanApprovalServiceImpl;
import com.example.demo.serviceImpl.PersonalLoanApprovalServiceImpl;

@RestController
@RequestMapping("loan/verify")
public class DocumentVerifyController {

	/*ApplicationContext is the Spring IoC container that creates, manages, and provides all beans.
	 * It is injected into the controller to access Spring-managed objects at runtime.
	 * getBean() is used to fetch the required LoanApprovalService implementation from the IoC container.
	 * Based on the loan type, the controller dynamically selects the appropriate 
	 * service without using the new keyword.*/
	
	
	
	@Autowired
	ApplicationContext applicationContext;
	
	@Autowired
	LoanApprovalService loanApprovalService;
	
	
	@GetMapping("/{type}")
	public String verifyDocuments(@PathVariable String type)
	{
		if(type.equals("education"))
		{
			loanApprovalService = (LoanApprovalService) applicationContext.getBean(EducationLoanApprovalServiceImpl.class);
		}
		
		else if(type.equals("home"))
		{
			loanApprovalService = (LoanApprovalService) applicationContext.getBean(HomeLoanApprovalServiceImpl.class);
		}
		
		else if(type.equals("personal"))
		{
			loanApprovalService = (LoanApprovalService) applicationContext.getBean(PersonalLoanApprovalServiceImpl.class);
		}
		
		else
		{
			return "Invalid Loan Type";
		}
		
		
		return loanApprovalService.verifyDocuments();
		
	}
}
