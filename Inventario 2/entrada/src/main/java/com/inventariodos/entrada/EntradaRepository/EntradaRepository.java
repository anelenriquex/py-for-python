package com.inventariodos.entrada.EntradaRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.inventariodos.entrada.EntradaEntities.EntradaEntities;

@Repository
public interface EntradaRepository extends JpaRepository<EntradaEntities, String>{

}
