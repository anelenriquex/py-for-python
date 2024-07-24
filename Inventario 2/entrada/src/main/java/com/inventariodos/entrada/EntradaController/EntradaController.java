package com.inventariodos.entrada.EntradaController;

import org.springframework.web.bind.annotation.RestController;

import com.inventariodos.entrada.EntradaEntities.EntradaEntities;
import com.inventariodos.entrada.EntradaRepository.EntradaRepository;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class EntradaController {

    private final EntradaRepository EntradaRepository;

    public EntradaController(EntradaRepository EntradaRepository){

        this.EntradaRepository = EntradaRepository;
    }

    @GetMapping("/users")
    public List <EntradaEntities>users(){
        return EntradaRepository.findAll();
    }
    

}
