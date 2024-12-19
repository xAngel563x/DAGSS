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

    public Medicamento() {

    }

    public Medicamento(String nom, String prin, String fabr, String familia, int numDos) {
        this.nombre = nom;
        this.principioActivo = prin;
        this.fabricante = fabr;
        this.familia = familia;
        this.numDosis = numDos;
        this.activo = true;
    }

    // Getters y Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPrincipioActivo() {
        return principioActivo;
    }

    public void setPrincipioActivo(String principioActivo) {
        this.principioActivo = principioActivo;
    }

    public String getFabricante() {
        return fabricante;
    }

    public void setFabricante(String fabricante) {
        this.fabricante = fabricante;
    }

    public String getFamilia() {
        return familia;
    }

    public void setFamilia(String familia) {
        this.familia = familia;
    }

    public int getNumDosis() {
        return numDosis;
    }

    public void setNumDosis(int numDosis) {
        this.numDosis = numDosis;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

}
