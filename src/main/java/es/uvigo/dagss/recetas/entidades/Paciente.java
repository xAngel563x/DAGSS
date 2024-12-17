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
    private String tel;

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

    public Paciente(String nombre, String apellidos, String dni, String tarj, String numSS, String direcc, String tel, String email, Date fechaNac, CentroSalud centro, Medico medico, String login, String passwd){
        super(TipoUsuario.PACIENTE,login,passwd);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tarjSanitaria = tarj;
        this.numSS= numSS;
        this.direccion = direcc;
        this.tel = tel;
        this.email = email;
        this.fechaNac = fechaNac;
        this.centroSaludAsignado = centro;
        this.medicoAsignado = medico;
    }

}
