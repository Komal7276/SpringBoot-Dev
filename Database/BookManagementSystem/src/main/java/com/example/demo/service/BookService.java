package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Book;

public interface BookService {

	void saveBook(Book book);
	
	Book getBook(int id);

	List<Book> getAllBooks(Book book);

	void deleteBook(int id);
	
	void deleteAllBooks(Book book);
}
