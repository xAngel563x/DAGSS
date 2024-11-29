package es.uvigo.dagss.recetas.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Medicamento {

    @Id
    private int id;

    private String nombre;

    @Column(name = "PRINCIPIO_ACTIVO")
    private String principioActivo;

    private String fabricante;

    private String familia;

    @Column(name = "NUM_DOSIS")
    private int numDosis;
    
    private boolean activo;


    public Medicamento(){

    }
}
