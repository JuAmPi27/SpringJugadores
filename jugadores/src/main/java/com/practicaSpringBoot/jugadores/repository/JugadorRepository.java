
package com.practicaSpringBoot.jugadores.repository;

import com.practicaSpringBoot.jugadores.model.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JugadorRepository extends JpaRepository <Jugador, Long>{
    
    
    
}
