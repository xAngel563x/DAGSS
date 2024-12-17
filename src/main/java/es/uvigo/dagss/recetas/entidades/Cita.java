package es.uvigo.dagss.recetas.entidades;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Cita {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
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


    public Cita(Date fecha, int dur, Medico med, Paciente pac){
        this.fecha = fecha;
        this.duracion = dur;
        this.estado = EstadoCita.PLANIFICADA;
        this.medico = med;
        this.pacienteCitado = pac;
    }
}
