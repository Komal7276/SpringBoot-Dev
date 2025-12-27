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
@RequestMapping("loan/approve")
public class LoanApprovalController {

	
	@Autowired
	ApplicationContext applicationContext;
	
	@Autowired
	LoanApprovalService loanApprovalService;
	
	
	
	@GetMapping("/{type}")
	public String approveLoan(@PathVariable String type)
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
		
		return loanApprovalService.approveLoan();
		
	}
	
	
}
