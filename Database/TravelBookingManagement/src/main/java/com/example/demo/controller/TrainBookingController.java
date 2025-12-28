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
@RequestMapping("train")
public class TrainBookingController {

	@Autowired
	BookingService bookingService;
	
	@PostMapping("book")
	public String confirmTrainBooking(@RequestBody Booking booking)
	{
		bookingService.bookTicket(booking);
		return MessageConstants.TRAIN_BOOK;
	}
	
	@GetMapping("get/{id}")
	Booking getTrainTicket(@PathVariable int id)
	{
		return bookingService.getTicket(id);
	}
	
	
	@GetMapping("getAll")
	List<Booking> getAllTrainTickets(@RequestBody Booking booking)
	{
		return bookingService.getAllTickets(booking);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteTicket(@PathVariable int id)
	{
		bookingService.deleteTicket(id);
		return MessageConstants.TRAIN_DELETE;
	}
	
	
	@DeleteMapping("deleteAll")
	String deleteAllTickets(@RequestBody Booking booking)
	{
		bookingService.deleteAllTickets(booking);
		return MessageConstants.TRAIN_ALL_DELETE;
	}
	
}
