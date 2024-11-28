package es.uvigo.dagss.recetas.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ADMINISTRADOR")
public class Administrador extends Usuario {

    // Anadir atributos propios

    private String nombre;
    private String apellidos;
    private String email;

	
    public Administrador() {
        super(TipoUsuario.ADMINISTRADOR); 
    }



}
