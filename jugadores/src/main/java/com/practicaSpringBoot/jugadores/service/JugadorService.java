
package com.practicaSpringBoot.jugadores.service;

import com.practicaSpringBoot.jugadores.model.Jugador;
import com.practicaSpringBoot.jugadores.repository.JugadorRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class JugadorService implements IJugadorService {

    @Autowired
    public JugadorRepository jugRepo;
    
    
    @Override
    public List<Jugador> verJugadores() {
        return jugRepo.findAll();
    }

    @Override
    public void crearJugador(Jugador jug) {
        jugRepo.save(jug);
    }

    @Override
    public void borrarJugador(Long id) {
        jugRepo.deleteById(id);
    }

    @Override
    public Jugador buscarJugador(Long id) {
        return jugRepo.findById(id).orElse(null);
    }
    
}
