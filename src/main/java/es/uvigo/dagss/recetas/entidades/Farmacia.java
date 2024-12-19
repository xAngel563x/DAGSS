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

    public Farmacia() {
        super(TipoUsuario.FARMACIA);
    }

    public Farmacia(String nom, String nomFarm, String ap, String nif, String numCol, String dir, String tel,
            String email, String login, String passwd) {
        super(TipoUsuario.FARMACIA, login, passwd);
        this.nombreEstabl = nom;
        this.nombreFarmaceutico = nomFarm;
        this.apellidosFarmaceutico = ap;
        this.nif = nif;
        this.numColegiadoFarmaceutico = numCol;
        this.direccion = dir;
        this.tel = tel;
        this.email = email;
    }

    // Getters y Setters
    public String getNombreEstabl() {
        return nombreEstabl;
    }

    public void setNombreEstabl(String nombreEstabl) {
        this.nombreEstabl = nombreEstabl;
    }

    public String getNombreFarmaceutico() {
        return nombreFarmaceutico;
    }

    public void setNombreFarmaceutico(String nombreFarmaceutico) {
        this.nombreFarmaceutico = nombreFarmaceutico;
    }

    public String getApellidosFarmaceutico() {
        return apellidosFarmaceutico;
    }

    public void setApellidosFarmaceutico(String apellidosFarmaceutico) {
        this.apellidosFarmaceutico = apellidosFarmaceutico;
    }

    public String getNif() {
        return nif;
    }

    public void setNif(String nif) {
        this.nif = nif;
    }

    public String getNumColegiadoFarmaceutico() {
        return numColegiadoFarmaceutico;
    }

    public void setNumColegiadoFarmaceutico(String numColegiadoFarmaceutico) {
        this.numColegiadoFarmaceutico = numColegiadoFarmaceutico;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

}
