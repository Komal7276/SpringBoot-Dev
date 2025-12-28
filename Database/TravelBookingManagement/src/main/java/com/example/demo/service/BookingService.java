package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Booking;

public interface BookingService {

	void bookTicket(Booking booking);
	
	Booking getTicket(int id);
	
	List<Booking> getAllTickets(Booking booking);
	
	void deleteTicket(int id);
	
	void deleteAllTickets(Booking booking);
	
	
}
