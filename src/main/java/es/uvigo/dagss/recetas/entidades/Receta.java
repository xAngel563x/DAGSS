package es.uvigo.dagss.recetas.entidades;

import java.util.Date;

public class Receta {

    private Date fechaInicial;
    private Date fechaFinal;
    private int numUnidadesMedicamento;
    private EstadoReceta estado;

    private Prescripcion prescripcion;
    private Farmacia farmacia;


    public Receta(){

    }
}
