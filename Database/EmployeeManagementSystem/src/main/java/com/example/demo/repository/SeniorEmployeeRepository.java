package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.SeniorEmployee;

public interface SeniorEmployeeRepository extends JpaRepository<SeniorEmployee, Integer>{

}
