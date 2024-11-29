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

    public Administrador(String login, String passwd, String nom, String ap, String email){
        super(TipoUsuario.ADMINISTRADOR, login, passwd);
        this.nombre = nom;
        this.apellidos = ap;
        this.email = email;
    }



}
