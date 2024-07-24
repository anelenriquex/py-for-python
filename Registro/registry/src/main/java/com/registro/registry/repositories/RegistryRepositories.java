package com.registro.registry.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.registro.registry.entities.RegistryEntities;

@Repository
public interface RegistryRepositories<registry> extends JpaRepository<RegistryEntities, Integer>{

}
