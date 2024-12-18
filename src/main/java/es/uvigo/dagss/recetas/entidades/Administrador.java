package es.uvigo.dagss.recetas.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "ADMINISTRADOR")
public class Administrador extends Usuario {

    // Anadir atributos propios

    private String nombre;
    
    private String email;

	
    public Administrador() {
        super(TipoUsuario.ADMINISTRADOR); 
    }

    public Administrador(String login, String passwd, String nom, String ap, String email){
        super(TipoUsuario.ADMINISTRADOR, login, passwd);
        this.nombre = nom;
        this.email = email;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
