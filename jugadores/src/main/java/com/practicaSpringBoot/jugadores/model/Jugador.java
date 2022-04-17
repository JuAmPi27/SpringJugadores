
package com.practicaSpringBoot.jugadores.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter
@Entity
public class Jugador {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    Long id;
    
   private String Nombre;
   private String apellido;
   private String edad;
   private String nacionalidad;
   private String club;

    public Jugador() {
    }

    public Jugador(Long id, String Nombre, String apellido, String edad, String nacionalidad, String club) {
        this.id = id;
        this.Nombre = Nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacionalidad = nacionalidad;
        this.club = club;
    }
    
    
    
}
