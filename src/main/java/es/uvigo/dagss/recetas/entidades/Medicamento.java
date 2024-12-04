package es.uvigo.dagss.recetas.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Medicamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    @Column(name = "PRINCIPIO_ACTIVO")
    private String principioActivo;

    private String fabricante;

    private String familia;

    @Column(name = "NUM_DOSIS")
    private int numDosis;
    
    private boolean activo;


    public Medicamento(String nom,String prin, String fabr, String familia, int numDos){
        this.nombre = nom;
        this.principioActivo = prin;
        this.fabricante = fabr;
        this.familia = familia;
        this.numDosis = numDos;
        this.activo = true;
    }
}
