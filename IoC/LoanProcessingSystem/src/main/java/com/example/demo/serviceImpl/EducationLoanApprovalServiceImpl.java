package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.LoanApprovalService;

@Service
public class EducationLoanApprovalServiceImpl implements LoanApprovalService{

	@Override
	public String approveLoan() {
		// TODO Auto-generated method stub
		return MessageConstants.EDU_APPROVE;
	}

	@Override
	public String rejectLoan() {
		// TODO Auto-generated method stub
		return MessageConstants.EDU_REJECT;
	}

	@Override
	public String verifyDocuments() {
		// TODO Auto-generated method stub
		return MessageConstants.EDU_DOC_VERIFY;
	}

}
