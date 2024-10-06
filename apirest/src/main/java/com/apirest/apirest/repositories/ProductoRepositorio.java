package com.apirest.apirest.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.apirest.apirest.entities.Producto;

public interface ProductoRepositorio extends JpaRepository<Producto, Long>{

}
