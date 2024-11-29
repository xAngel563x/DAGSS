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
public class Prescripcion {

    @Id
    private int id;

    @Column(name = "DOSIS_DIARIA")
    private double dosisDiaria;

    private String indicaciones;

    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    private boolean activo = true;

    

    @JoinColumn(name = "MEDICAMENTO_PRESCRITO")
    @ManyToOne
    private Medicamento medicamentoPrescrito;

    @JoinColumn(name = "PACIENTE")
    @ManyToOne
    private Paciente paciente;

    @JoinColumn(name = "MEDICO_CREADOR")
    @ManyToOne
    private Medico medico;


    public Prescripcion(){

    }
}
