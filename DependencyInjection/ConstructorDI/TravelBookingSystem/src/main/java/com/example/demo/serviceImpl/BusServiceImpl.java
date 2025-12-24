package com.example.demo.serviceImpl;

import org.springframework.stereotype.Service;

import com.example.demo.constants.MessageConstants;
import com.example.demo.service.TravelService;


@Service
public class BusServiceImpl implements TravelService{

	@Override
	public String searchTicket() {
		// TODO Auto-generated method stub
		return MessageConstants.BUS_TICKET_SEARCHING;
	}

	@Override
	public String bookTicket() {
		// TODO Auto-generated method stub
		return MessageConstants.BUS_TICKET_BOOKING;
	}

	@Override
	public String confirmBooking() {
		// TODO Auto-generated method stub
		return MessageConstants.CONFIRM_BUS_BOOKING;
	}

	@Override
	public String cancelBooking() {
		// TODO Auto-generated method stub
		return MessageConstants.CANCEL_BUS_BOOKING;
	}

}
