package es.uvigo.dagss.recetas.entidades;


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

    public CentroSalud(){
        
    }


    public CentroSalud(String nom, String email, String dir, String tel){
        this.nombre = nom;
        this.email = email;
        this.direccion = dir;
        this.tel = tel;
        this.activo = true;
    }

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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return tel;
    }

    public void setTelefono(String tel) {
        this.tel = tel;
    }

    public boolean isActivo() {
        return activo;
    }

    public void setActivo(boolean activo) {
        this.activo = activo;
    }

    // Método toString para depuración
    @Override
    public String toString() {
        return "CentroSalud{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", direccion='" + direccion + '\'' +
                ", email='" + email + '\'' +
                ", telefono='" + tel + '\'' +
                ", activo=" + activo +
                '}';
    }
}
