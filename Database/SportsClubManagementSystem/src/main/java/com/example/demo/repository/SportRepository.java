package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Sport;

public interface SportRepository extends JpaRepository<Sport, Integer>{

}
