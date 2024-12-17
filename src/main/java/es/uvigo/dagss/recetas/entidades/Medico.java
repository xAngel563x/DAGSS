package es.uvigo.dagss.recetas.entidades;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
@DiscriminatorValue(value = "MEDICO")
public class Medico extends Usuario {

    // Anadir atributos propios

    private String nombre;

    private String apellidos;

    private String dni;

    @Column(name = "NUMERO_COLEGIADO")
    private String numColegiado;

    @Column(name = "TELEFONO")
    private String tel;

    private String email;

    @JoinColumn(name = "CENTRO_SALUD_ASIGNADO")
    @ManyToOne
    private CentroSalud centroSaludAsignado;

    public Medico(){
        super(TipoUsuario.MEDICO);
    }
    
    public Medico(String nom, String ap, String dni, String numCol, String tel, String email, CentroSalud cen, String login, String passwd) {
        super(TipoUsuario.MEDICO,login,passwd);
        this.nombre = nom;
        this.apellidos = ap;
        this.dni = dni;
        this.numColegiado = numCol;
        this.tel = tel;
        this.email = email;
        this.centroSaludAsignado = cen;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNumColegiado() {
        return numColegiado;
    }

    public void setNumColegiado(String numColegiado) {
        this.numColegiado = numColegiado;
    }

    public String getTelefono() {
        return tel;
    }

    public void setTelefono(String tel) {
        this.tel = tel;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public CentroSalud getCentroSaludAsignado() {
        return centroSaludAsignado;
    }

    public void setCentroSaludAsignado(CentroSalud centroSaludAsignado) {
        this.centroSaludAsignado = centroSaludAsignado;
    }

    // Método toString para depuración
    @Override
    public String toString() {
        return "Medico{" +
                "nombre='" + nombre + '\'' +
                ", apellidos='" + apellidos + '\'' +
                ", dni='" + dni + '\'' +
                ", numColegiado='" + numColegiado + '\'' +
                ", telefono='" + tel + '\'' +
                ", email='" + email + '\'' +
                ", centroSaludAsignado=" + centroSaludAsignado +
                '}';
    }
}
