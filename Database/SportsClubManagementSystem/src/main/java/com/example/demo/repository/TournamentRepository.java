package com.example.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.Tournament;

public interface TournamentRepository extends JpaRepository<Tournament, Integer>{

}
