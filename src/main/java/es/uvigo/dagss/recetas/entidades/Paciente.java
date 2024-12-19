package es.uvigo.dagss.recetas.entidades;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@DiscriminatorValue(value = "PACIENTE")
public class Paciente extends Usuario {

    // Anadir atributos propios
    private String nombre;

    private String apellidos;

    private String dni;

    @Column(name = "TARJETA_SANITARIA")
    private String tarjSanitaria;

    @Column(name = "NUMERO_SS")
    private String numSS;

    private String direccion;

    @Column(name = "TELEFONO")
    private String tel;

    private String email;

    @Column(name = "FECHA_NACIMIENTO")
    @Temporal(TemporalType.DATE)
    private Date fechaNac;

    @JoinColumn(name = "CENTRO_SALUD_ASIGNADO")
    @ManyToOne
    private CentroSalud centroSaludAsignado;

    @JoinColumn(name = "MEDICO_ASIGNADO")
    @ManyToOne
    private Medico medicoAsignado;

    public Paciente() {
        super(TipoUsuario.PACIENTE);
    }

    public Paciente(String nombre, String apellidos, String dni, String tarj, String numSS, String direcc, String tel,
            String email, Date fechaNac, CentroSalud centro, Medico medico, String login, String passwd) {
        super(TipoUsuario.PACIENTE, login, passwd);
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.dni = dni;
        this.tarjSanitaria = tarj;
        this.numSS = numSS;
        this.direccion = direcc;
        this.tel = tel;
        this.email = email;
        this.fechaNac = fechaNac;
        this.centroSaludAsignado = centro;
        this.medicoAsignado = medico;
    }

    // Getters y Setters
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

    public String getTarjSanitaria() {
        return tarjSanitaria;
    }

    public void setTarjSanitaria(String tarjSanitaria) {
        this.tarjSanitaria = tarjSanitaria;
    }

    public String getNumSS() {
        return numSS;
    }

    public void setNumSS(String numSS) {
        this.numSS = numSS;
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

    public Date getFechaNac() {
        return fechaNac;
    }

    public void setFechaNac(Date fechaNac) {
        this.fechaNac = fechaNac;
    }

    public CentroSalud getCentroSaludAsignado() {
        return centroSaludAsignado;
    }

    public void setCentroSaludAsignado(CentroSalud centroSaludAsignado) {
        this.centroSaludAsignado = centroSaludAsignado;
    }

    public Medico getMedicoAsignado() {
        return medicoAsignado;
    }

    public void setMedicoAsignado(Medico medicoAsignado) {
        this.medicoAsignado = medicoAsignado;
    }

}
