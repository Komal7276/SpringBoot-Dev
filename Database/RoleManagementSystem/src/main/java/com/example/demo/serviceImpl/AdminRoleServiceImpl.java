package com.example.demo.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Role;
import com.example.demo.repository.RoleRepository;
import com.example.demo.service.RoleService;


@Primary
@Service
public class AdminRoleServiceImpl implements RoleService{

	@Autowired
	RoleRepository roleRepository;
	
	
	@Override
	public void saveRole(Role role) {
		// TODO Auto-generated method stub
		roleRepository.save(role);
	}

	@Override
	public Role getRole(int id) {
		// TODO Auto-generated method stub
		return roleRepository.findById(id).get();
	}

	@Override
	public List<Role> getAllRoles(Role role) {
		// TODO Auto-generated method stub
		return roleRepository.findAll();
	}

	@Override
	public void deleteRole(int id) {
		// TODO Auto-generated method stub
		roleRepository.deleteById(id);
	}

	@Override
	public void deleteAllRoles(Role role) {
		// TODO Auto-generated method stub
		roleRepository.deleteAll();
	}

}
