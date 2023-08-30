package com.jpablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpablo.model.Ciudad;

public interface ICiudadRepository extends JpaRepository<Ciudad, Long>{

}