package es.uvigo.dagss.recetas.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "FARMACIA")
public class Farmacia extends Usuario {

    // Anadir atributos propios
    @Column(name = "NOMBRE_ESTABLECIMIENTO")
    private String nombreEstabl;

    @Column(name = "NOMBRE_FARMACEUTICO")
    private String nombreFarmaceutico;

    @Column(name = "APELLIDOS_FARMACEUTICO")
    private String apellidosFarmaceutico;

    private String nif;

    @Column(name = "NUM_COLEGIADO_FARMACEUTICO")
    private String numColegiadoFarmaceutico;

    private String direccion;

    @Column(name = "TELEFONO")
    private String tel;

    private String email;
    
	
    public Farmacia(String nom, String nomFarm, String ap, String nif, String numCol, String dir, String tel, String email) {
        super(TipoUsuario.FARMACIA);
        this.nombreEstabl = nom;
        this.nombreFarmaceutico = nomFarm;
        this.apellidosFarmaceutico = ap;
        this.nif = nif;
        this.numColegiadoFarmaceutico = numCol;
        this.direccion = dir;
        this.tel = tel;
        this.email = email;
    }
    
}
