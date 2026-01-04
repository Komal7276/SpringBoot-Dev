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
import com.example.demo.entity.Role;
import com.example.demo.service.RoleService;

@RestController
@RequestMapping("role/manager")
public class ManagerController {

	@Autowired
	RoleService roleService;
	
	@PostMapping("add")
	public String addRole(@RequestBody Role role)
	{
		roleService.saveRole(role);
		return MessageConstants.MANAGER_ROLE_ADDED;
	}
	
	@GetMapping("get/{id}")
	Role getRole(@PathVariable int id)
	{
		return roleService.getRole(id);
	}
	
	
	@GetMapping("getAll")
	List<Role> getAllUsers(@RequestBody Role role)
	{
		return roleService.getAllRoles(role);
	}
	
	
	@DeleteMapping("delete/{id}")
	public String deleteUser(@PathVariable int id) 
	{
		roleService.deleteRole(id);
		return MessageConstants.MANAGER_DELETED;
	}
	
	@DeleteMapping("deleteAll")
	public String deleteAllRoles(@RequestBody Role role)
	{
		roleService.deleteAllRoles(role);
		return MessageConstants.ALL_MANAGERS_DELETED;
	}
	
}
