package com.example.parcial2.controller;


import com.example.parcial2.repository.RepositoryParcial2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class Controller {

    @Autowired
    private RepositoryParcial2 repo;

    @GetMapping()
    public String pruebaConexion() {
        return "CONECTADO";
    };

    @GetMapping("/validarCorreo/{correo}")
    public String validacion( @PathVariable String correo ){
        return repo.validarCorreo( correo );
    }

    @GetMapping("/multiploDeTres/{num}")
    public String multiploTres( @PathVariable int num ){
        System.out.println( num );
        System.out.println( repo.multiploDeTres( num ) );
        return repo.multiploDeTres( num );

    }


}
