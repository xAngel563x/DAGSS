package es.uvigo.dagss.recetas.entidades;

import java.util.Date;

public class Cita {

    private int id;
    private Date fecha;
    private int duracion;
    private EstadoCita estado;

    private Medico medico;
    private Paciente pacienteCitado;


    public Cita(){

    }
}
