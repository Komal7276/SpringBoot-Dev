package com.example.demo.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.LoanApprovalService;

@Service
@Primary
public class HomeLoanApprovalServiceImpl implements LoanApprovalService{

	@Override
	public String approveLoan() {
		// TODO Auto-generated method stub
		return MessageConstants.HOME_APPROVE;
	}

	@Override
	public String rejectLoan() {
		// TODO Auto-generated method stub
		return MessageConstants.HOME_REJECT;
	}

	@Override
	public String verifyDocuments() {
		// TODO Auto-generated method stub
		return MessageConstants.HOME_REJECT;
	}

}
