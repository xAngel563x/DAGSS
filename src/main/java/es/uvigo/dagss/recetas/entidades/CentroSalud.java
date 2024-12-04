package es.uvigo.dagss.recetas.entidades;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class CentroSalud {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;

    private String email;

    private String direccion;

    @Column(name = "TELEFONO")
    private String tel;
    
    private boolean activo;


    public CentroSalud(String nom, String email, String dir, String tel){
        this.nombre = nom;
        this.email = email;
        this.direccion = dir;
        this.tel = tel;
        this.activo = true;
    }
}
