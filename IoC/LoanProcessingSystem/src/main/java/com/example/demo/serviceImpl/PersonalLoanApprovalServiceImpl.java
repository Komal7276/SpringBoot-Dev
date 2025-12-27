package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.LoanApprovalService;

@Service
public class PersonalLoanApprovalServiceImpl implements LoanApprovalService{

	@Override
	public String approveLoan() {
		// TODO Auto-generated method stub
		return MessageConstants.PERSONAL_APPROVE;
	}

	@Override
	public String rejectLoan() {
		// TODO Auto-generated method stub
		return MessageConstants.PERSONAL_REJECT;
	}

	@Override
	public String verifyDocuments() {
		// TODO Auto-generated method stub
		return MessageConstants.PERSONAL_DOC_VERIFY;
	}

}
