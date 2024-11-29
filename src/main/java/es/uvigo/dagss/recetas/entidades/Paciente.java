package es.uvigo.dagss.recetas.entidades;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@DiscriminatorValue(value = "PACIENTE")
public class Paciente extends Usuario {

	// Anadir atributos propios
    private String nombre;

    private String apellidos;

    private String dni;

    @Column(name = "TARJETA_SANITARIA")
    private String tarjSanitaria;

    @Column(name = "NUMERO_SS")
    private String numSS;

    private String direccion;

    @Column(name = "TELEFONO")
    private int tel;

    private String email;
    
    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;
    

    @JoinColumn(name = "CENTRO_SALUD_ASIGNADO")
    @ManyToOne
    private CentroSalud centroSaludAsignado;

    @JoinColumn(name = "MEDICO_ASIGNADO")
    @ManyToOne
    private Medico medicoAsignado;
    
   

    public Paciente() {
        super(TipoUsuario.PACIENTE);        
    }

}
