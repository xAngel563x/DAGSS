package es.uvigo.dagss.recetas.entidades;

import java.util.Date;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "PACIENTE")
public class Paciente extends Usuario {

	// Anadir atributos propios
    private String nombre;
    private String apellidos;
    private String dni;
    private String tarjSanitaria;
    private String numSS;
    private String direccion;
    private int tel;
    private String email;
    private Date fechaNac;
    
    private CentroSalud centroSaludAsignado;
    private Medico medicoAsignado;
    
   

    public Paciente() {
        super(TipoUsuario.PACIENTE);        
    }

}
