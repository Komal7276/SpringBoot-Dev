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
import com.example.demo.entity.Book;
import com.example.demo.service.BookService;

@RestController
@RequestMapping("book/library")
public class LibraryBookController {

	@Autowired
	BookService bookService;
	
	@PostMapping("add")
	public String addBook(@RequestBody Book book)
	{
		bookService.saveBook(book);
		return MessageConstants.BOOK_ADDED_LIBRARY;
	}
	
	@GetMapping("getBook/{id}")
	Book getBook(@PathVariable int id)
	{
		return bookService.getBook(id);
	}
	
	@GetMapping("getAllBooks")
	List<Book> getAllBooks(@RequestBody Book book)
	{
		return bookService.getAllBooks(book);
	}
	
	@DeleteMapping("delteBook/{id}")
	public String deleteBook(@PathVariable int id)
	{
		bookService.deleteBook(id);
		return MessageConstants.BOOK_DELETE_LIBRARY;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllBooks(@RequestBody Book book)
	{
		bookService.deleteAllBooks(book);
		return MessageConstants.ALL_BOOKS_DELETED_LIBRARY;
	}
	
}
