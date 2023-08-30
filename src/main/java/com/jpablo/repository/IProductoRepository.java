package com.jpablo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jpablo.model.Producto;

public interface IProductoRepository extends JpaRepository<Producto, Long>{

}
