package es.uvigo.dagss.recetas.entidades;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Cita {

    @Id
    private Long id;

    @Column(name = "FECHA_CITA")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;

    @Column(name = "DURECION_CITA")
    private int duracion;
    
    @Column(name = "ESTADO_CITA")
    private EstadoCita estado;


    @JoinColumn(name = "MEDICO_CONSULTOR")
    @ManyToOne
    private Medico medico;

    @JoinColumn(name = "PACIENTE_CITADO")
    @ManyToOne
    private Paciente pacienteCitado;


    public Cita(){

    }
}
