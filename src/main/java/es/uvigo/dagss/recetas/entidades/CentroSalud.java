package es.uvigo.dagss.recetas.entidades;

import java.util.List;

import jakarta.persistence.Id;

public class CentroSalud {

    @Id
    private Long id;

    private String nombre;
    private String email;
    private String direccion;
    private int tel;
    private boolean activo = true;




    public CentroSalud(){

    }
}
