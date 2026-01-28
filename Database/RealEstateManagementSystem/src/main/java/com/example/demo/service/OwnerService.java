package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Owner;

public interface OwnerService {

	void saveOwner(Owner owner);
	
	Owner getOwner(int id);
	
	List<Owner> getAllOwner(Owner owner);
	
	void deleteOwner(int id);
	
	void deleteAllOwners(Owner owner);
	
}
