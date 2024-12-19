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
public class Prescripcion {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "DOSIS_DIARIA")
    private double dosisDiaria;

    private String indicaciones;

    @Column(name = "FECHA_INICIO")
    @Temporal(TemporalType.DATE)
    private Date fechaInicio;

    @Column(name = "FECHA_FIN")
    @Temporal(TemporalType.DATE)
    private Date fechaFin;

    private boolean activo;

    @JoinColumn(name = "MEDICAMENTO_PRESCRITO")
    @ManyToOne
    private Medicamento medicamentoPrescrito;

    @JoinColumn(name = "PACIENTE")
    @ManyToOne
    private Paciente paciente;

    @JoinColumn(name = "MEDICO_CREADOR")
    @ManyToOne
    private Medico medico;

    public Prescripcion() {

    }

    public Prescripcion(double dosis, String indicaciones, Date fechaIn, Date fechaFin, Medicamento m, Paciente p,
            Medico med) {
        this.activo = true;
        this.dosisDiaria = dosis;
        this.indicaciones = indicaciones;
        this.fechaFin = fechaFin;
        this.fechaInicio = fechaIn;
        this.medicamentoPrescrito = m;
        this.paciente = p;
        this.medico = med;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getDosisDiaria() {
        return dosisDiaria;
    }

    public void setDosisDiaria(double dosisDiaria) {
        this.dosisDiaria = dosisDiaria;
    }

    public String getIndicaciones() {
        return indicaciones;
    }

    public void setIndicaciones(String indicaciones) {
        this.indicaciones = indicaciones;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFin() {
        return fechaFin;
    }

    public void setFechaFin(Date fechaFin) {
        this.fechaFin = fechaFin;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    public Medicamento getMedicamentoPrescrito() {
        return medicamentoPrescrito;
    }

    public void setMedicamentoPrescrito(Medicamento medicamentoPrescrito) {
        this.medicamentoPrescrito = medicamentoPrescrito;
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public void setPaciente(Paciente paciente) {
        this.paciente = paciente;
    }

    public Medico getMedico() {
        return medico;
    }

    public void setMedico(Medico medico) {
        this.medico = medico;
    }

}
