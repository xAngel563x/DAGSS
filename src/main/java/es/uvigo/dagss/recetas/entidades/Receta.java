package es.uvigo.dagss.recetas.entidades;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
public class Receta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "FECHA_INICIAL")
    @Temporal(TemporalType.DATE)
    private Date fechaInicial;

    @Column(name = "FECHA_FINAL")
    @Temporal(TemporalType.DATE)
    private Date fechaFinal;

    @Column(name = "NUM_UNIDADES_MEDICAMENTO")
    private int numUnidadesMedicamento;

    @Column(name = "ESTADO_RECETA")
    @Enumerated(EnumType.STRING)
    private EstadoReceta estado;


    @JoinColumn(name = "PRESCRIPCION")
    @ManyToOne
    private Prescripcion prescripcion;

    @JoinColumn(name = "FARMACIA")
    @ManyToOne
    private Farmacia farmacia;

    public Receta(){
        
    }

    public Receta(Date fechaIn, Date fechaFin, int numUni, Prescripcion pres, Farmacia f){
        this.estado = EstadoReceta.PLANIFICADA;
        this.fechaFinal = fechaFin;
        this.fechaInicial=fechaIn;
        this.numUnidadesMedicamento= numUni;
        this.prescripcion = pres;
        this.farmacia = f;
    }

    public void setEstado(EstadoReceta es){
        this.estado = es;
    }
}
