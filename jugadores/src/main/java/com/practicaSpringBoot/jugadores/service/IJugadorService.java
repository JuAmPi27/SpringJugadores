
package com.practicaSpringBoot.jugadores.service;

import com.practicaSpringBoot.jugadores.model.Jugador;
import java.util.List;


public interface IJugadorService {
    
    public List<Jugador> verJugadores();
    
    public void crearJugador(Jugador jug);
    
    public void borrarJugador(Long id);
    
    public Jugador buscarJugador(Long id);
    
}
