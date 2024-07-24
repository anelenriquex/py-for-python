package com.inventario.salida.SalidaRepository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.inventario.salida.SalidaEntity.SalidaEntity;

public interface SalidaRepository extends JpaRepository <SalidaEntity, Integer>{

}
