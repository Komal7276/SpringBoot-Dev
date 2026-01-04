package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Role;

public interface RoleService {

	void saveRole(Role role);
	
	Role getRole(int id);

	List<Role> getAllRoles(Role role);

	void deleteRole(int id);
	
	void deleteAllRoles(Role role);
}
