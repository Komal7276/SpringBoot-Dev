package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Contact;

public interface ContactService {

	void saveContact(Contact contact);
	
	Contact viewContact(int id);

	List<Contact> viewAllContacts(Contact contact);

	void deleteContact(int id);

	void deleteAllContact(Contact contact);

}
