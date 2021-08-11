package com.gerenciamento.personapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.gerenciamento.personapi.entity.Person;

public interface PersonRepository extends JpaRepository<Person, Long>{

}
