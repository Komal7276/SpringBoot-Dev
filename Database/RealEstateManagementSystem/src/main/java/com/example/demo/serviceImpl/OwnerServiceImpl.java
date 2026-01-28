package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Owner;
import com.example.demo.repository.OwnerRepository;
import com.example.demo.service.OwnerService;

@Service
public class OwnerServiceImpl implements OwnerService{

	@Autowired
	OwnerRepository ownerRepository;
	
	@Override
	public void saveOwner(Owner owner) {
		// TODO Auto-generated method stub
		ownerRepository.save(owner);
	}

	@Override
	public Owner getOwner(int id) {
		// TODO Auto-generated method stub
		return ownerRepository.findById(id).get();
	}

	@Override
	public List<Owner> getAllOwner(Owner owner) {
		// TODO Auto-generated method stub
		return ownerRepository.findAll();
	}


	@Override
	public void deleteOwner(int id) {
		// TODO Auto-generated method stub
		ownerRepository.deleteById(id);
	}

	@Override
	public void deleteAllOwners(Owner owner) {
		// TODO Auto-generated method stub
		ownerRepository.deleteAll();
	}

}
