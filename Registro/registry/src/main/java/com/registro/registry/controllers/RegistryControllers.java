package com.registro.registry.controllers;
import org.springframework.web.bind.annotation.RestController;

import com.registro.registry.entities.RegistryEntities;
import com.registro.registry.repositories.RegistryRepositories;
import java.util.List;

//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;


@RestController     
public class RegistryControllers {
 
    private final RegistryRepositories<RegistryEntities> registryRepositories;

            
            public RegistryControllers (RegistryRepositories<RegistryEntities> registryRepositories){ 
                    this.registryRepositories = registryRepositories;
        }

                @GetMapping("/users")   
                public List<RegistryEntities>users(){
                 return registryRepositories.findAll();
        }
        
    }
