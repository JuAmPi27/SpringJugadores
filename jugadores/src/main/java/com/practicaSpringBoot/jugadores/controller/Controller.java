
package com.practicaSpringBoot.jugadores.controller;

import com.practicaSpringBoot.jugadores.model.Jugador;
import com.practicaSpringBoot.jugadores.service.IJugadorService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
   
    @Autowired
    private IJugadorService jugServ;
    
    @PostMapping("/new/jugador")
    public void agregarJugador(@RequestBody Jugador jug) {
        jugServ.crearJugador(jug);
    }
    
    @GetMapping("/ver/jugadores")
    @ResponseBody
    public List<Jugador> verJugadores() {
       return jugServ.verJugadores();
    }
    
    @DeleteMapping("/borrar/jugador/{id}")
    public void borrarJugador(@PathVariable Long id) {
        jugServ.borrarJugador(id);
    }
    
}
