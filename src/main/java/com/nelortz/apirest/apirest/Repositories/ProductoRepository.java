package com.nelortz.apirest.apirest.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nelortz.apirest.apirest.Entities.Producto;

public interface ProductoRepository extends JpaRepository<Producto, Long>{

    

}
