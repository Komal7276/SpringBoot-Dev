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
@RequestMapping("bus")
public class BusBookingController {

	
	@Autowired
	BookingService bookingService;
	
	
	@PostMapping("book")
	public String confirmBusBooking(@RequestBody Booking booking)
	{
		bookingService.bookTicket(booking);
		return MessageConstants.BUS_BOOK;
	}
	
	
	@GetMapping("get/{id}")
	Booking getBusTicket(@PathVariable int id)
	{
		return bookingService.getTicket(id);

	}
	
	
	@GetMapping("getAll")
	List<Booking> getAllBusBookings(@RequestBody Booking booking)
	{
		return bookingService.getAllTickets(booking);
	}
	
	
	@DeleteMapping("delete/{id}")
	public String deleteBusBooking(@PathVariable int id)
	{
		bookingService.deleteTicket(id);
		return MessageConstants.BUS_DELETE;
	}
	
	
	@DeleteMapping("deleteAll")
	public String deleteAllBusBookings()
	{
		bookingService.deleteAllTickets(null);
		return MessageConstants.BUS_ALL_DELETE;
	}
}
