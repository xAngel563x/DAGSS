package es.uvigo.dagss.recetas.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "MEDICO")
public class Medico extends Usuario {

    // Anadir atributos propios

    private String nombre;
    private String apellidos;
    private String dni;
    private String numColegiado;
    private int tel;
    private String email;

    private CentroSalud centroSaludAsignado;
    
    public Medico() {
        super(TipoUsuario.MEDICO);
    }


}
