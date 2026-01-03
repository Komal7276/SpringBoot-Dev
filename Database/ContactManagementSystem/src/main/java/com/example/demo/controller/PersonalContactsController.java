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
import com.example.demo.entity.Contact;
import com.example.demo.service.ContactService;

@RestController
@RequestMapping("personal")
public class PersonalContactsController {

	@Autowired
	ContactService contactService;
	
	
	@PostMapping("add")
	public String addContact(@RequestBody Contact contact)
	{
		contactService.saveContact(contact);
		return MessageConstants.PERSONAL_CONTACT_ADDED;
	}
	
	@GetMapping("get/{id}")
	Contact getContact(@PathVariable int id)
	{
		return contactService.viewContact(id);
	}
	
	
	@GetMapping("getAll")
	List<Contact> getAllContact(Contact contact)
	{
		return contactService.viewAllContacts(contact);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteContact(@PathVariable int id)
	{
		contactService.deleteContact(id);
		return MessageConstants.PERSONAL_CONTACT_DELETED;
	}
	
	
	@DeleteMapping("deleteAll")
	public String deleteAllContacts(Contact contact)
	{
		contactService.deleteAllContact(contact);
		return MessageConstants.ALL_PERSONAL_DELETED;
	}
}
