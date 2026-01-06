package com.example.springapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springapi.model.Person;
@Repository
public interface PersonRepository  extends JpaRepository<Person, Long> {
 
} 