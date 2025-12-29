package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Book;
import com.example.demo.repository.BookRepository;
import com.example.demo.service.BookService;

@Service
public class WarehouseBookServiceImpl implements BookService{

	@Autowired
	BookRepository bookRepository;
	
	@Override
	public void saveBook(Book book) {
		// TODO Auto-generated method stub
		bookRepository.save(book);
	}

	@Override
	public Book getBook(int id) {
		// TODO Auto-generated method stub
		return bookRepository.findById(id).get();
	}

	@Override
	public List<Book> getAllBooks(Book book) {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public void deleteBook(int id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);
	}

	@Override
	public void deleteAllBooks(Book book) {
		// TODO Auto-generated method stub
		bookRepository.deleteAll();
	}

}
