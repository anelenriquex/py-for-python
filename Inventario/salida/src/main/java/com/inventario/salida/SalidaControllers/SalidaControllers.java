package com.inventario.salida.SalidaControllers;

import org.springframework.web.bind.annotation.RestController;

import com.inventario.salida.SalidaEntity.SalidaEntity;
import com.inventario.salida.SalidaRepository.SalidaRepository;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class SalidaControllers {

    private final SalidaRepository salidaRepository;

    public SalidaControllers(SalidaRepository salidaRepository){
        this.salidaRepository = salidaRepository;

    }

    @GetMapping("/users")
    public List<SalidaEntity>users () {
        return salidaRepository.findAll();
    }
    

}
