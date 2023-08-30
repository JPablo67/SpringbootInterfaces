package com.jpablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpablo.model.Tienda;

public interface ITiendaRepository extends JpaRepository<Tienda, Long>{

}