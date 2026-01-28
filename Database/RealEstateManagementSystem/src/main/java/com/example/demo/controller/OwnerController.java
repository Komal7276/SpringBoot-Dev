package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.constants.MessageConstants;
import com.example.demo.entity.Owner;
import com.example.demo.service.OwnerService;

@RestController
@RequestMapping("owner")
public class OwnerController {
	
	@Autowired
	OwnerService ownerService;

	
	@PostMapping("add")
	public String addOwner(@RequestBody Owner owner)
	{
		ownerService.saveOwner(owner);
		return MessageConstants.OWNER_ADDED;
	}
	
	@GetMapping("get/{id}")
	Owner getOwner(@PathVariable int id)
	{
		return ownerService.getOwner(id);
	}
	
	@GetMapping("getAll")
	List<Owner> getAllOwners(@RequestBody Owner owner)
	{
		return ownerService.getAllOwner(owner);
	}
	
	@DeleteMapping("delete/{id}")
	public String deleteOwner(@PathVariable int id)
	{
		ownerService.deleteOwner(id);
		return MessageConstants.OWNER_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllOwners(@RequestBody Owner owner)
	{
		ownerService.deleteAllOwners(owner);
		return MessageConstants.ALL_OWNERS_DELETED;
	}
	
	
}
