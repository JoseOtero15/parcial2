package com.example.parcial2.repository;

import com.example.parcial2.model.Parcial2;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface RepositoryParcial2 extends JpaRepository <Parcial2, Long> {

    @Query( value = "SELECT validar_correo(:correo) FROM dual", nativeQuery = true)
    String validarCorreo( String correo );

    @Query( value = "SELECT multiploDeTres(:num) FROM dual", nativeQuery = true)
    String multiploDeTres( int num );

}
