package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Contact;
import com.example.demo.repository.ContactRepository;
import com.example.demo.service.ContactService;

@Service
public class BusinessContactServiceImpl implements ContactService{

	
	@Autowired
	ContactRepository contactRepository;
	
	
	@Override
	public void saveContact(Contact contact) {
		// TODO Auto-generated method stub
		contactRepository.save(contact);
	}

	@Override
	public Contact viewContact(int id) {
		// TODO Auto-generated method stub
		return contactRepository.findById(id).get();
	}

	@Override
	public List<Contact> viewAllContacts(Contact contact) {
		// TODO Auto-generated method stub
		return contactRepository.findAll();
	}

	@Override
	public void deleteContact(int id) {
		// TODO Auto-generated method stub
		contactRepository.deleteById(id);
	}

	@Override
	public void deleteAllContact(Contact contact) {
		// TODO Auto-generated method stub
		contactRepository.deleteAll();
	}

}
