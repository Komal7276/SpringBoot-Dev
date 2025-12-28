package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Booking;
import com.example.demo.repository.BookingRepository;
import com.example.demo.service.BookingService;

@Primary
@Service
public class TrainBookingServiceImpl implements BookingService{

	@Autowired
	BookingRepository bookingRepository;
	
	
	@Override
	public void bookTicket(Booking booking) {
		// TODO Auto-generated method stub
		bookingRepository.save(booking);
	}

	@Override
	public Booking getTicket(int id) {
		// TODO Auto-generated method stub
	 	return bookingRepository.findById(id).get();
	}

	@Override
	public List<Booking> getAllTickets(Booking booking) {
		// TODO Auto-generated method stub
		return bookingRepository.findAll();
	}

	@Override
	public void deleteTicket(int id) {
		// TODO Auto-generated method stub
		bookingRepository.deleteById(id);
	}

	@Override
	public void deleteAllTickets(Booking booking) {
		// TODO Auto-generated method stub
		bookingRepository.deleteAll();
	}

}
