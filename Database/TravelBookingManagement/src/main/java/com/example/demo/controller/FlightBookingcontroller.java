package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Booking;
import com.example.demo.service.BookingService;


@RestController
@RequestMapping("flight")
public class FlightBookingcontroller {

	@Autowired
	BookingService bookingService;
	
	@PostMapping("book")
	public String confirmFlightBooking(@RequestBody Booking booking)
	{
		bookingService.bookTicket(booking);
		return MessageConstants.FLIGHT_BOOK;
	}
	
	@GetMapping("get/{id}")
	Booking getFlighTicket(@PathVariable int id)
	{
		return bookingService.getTicket(id);
	}
	
	
	@GetMapping("getAll")
	List<Booking> getAllFlightTickets(@RequestBody Booking booking)
	{
		return bookingService.getAllTickets(booking);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteTicket(@PathVariable int id)
	{
		bookingService.deleteTicket(id);
		return MessageConstants.FLIGHT_DELETE;
	}
	
	
	@DeleteMapping("deleteAll")
	String deleteAllTickets(@RequestBody Booking booking)
	{
		bookingService.deleteAllTickets(booking);
		return MessageConstants.FLIGHT_ALL_DELETE;
	}
	

	
}
