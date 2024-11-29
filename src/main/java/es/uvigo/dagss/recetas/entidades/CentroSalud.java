package es.uvigo.dagss.recetas.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CentroSalud {

    @Id
    private Long id;

    private String nombre;

    private String email;

    private String direccion;

    @Column(name = "TELEFONO")
    private int tel;
    
    private boolean activo = true;




    public CentroSalud(){

    }
}
