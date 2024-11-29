package es.uvigo.dagss.recetas.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
@DiscriminatorValue(value = "MEDICO")
public class Medico extends Usuario {

    // Anadir atributos propios

    private String nombre;

    private String apellidos;

    private String dni;

    @Column(name = "NUMERO_COLEGIADO")
    private String numColegiado;

    @Column(name = "TELEFONO")
    private int tel;

    private String email;

    @JoinColumn(name = "CENTRO_SALUD_ASIGNADO")
    @ManyToOne
    private CentroSalud centroSaludAsignado;
    
    public Medico() {
        super(TipoUsuario.MEDICO);
    }


}
