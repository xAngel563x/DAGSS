package es.uvigo.dagss.recetas.entidades;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "FARMACIA")
public class Farmacia extends Usuario {

    // Anadir atributos propios
    private String nombreEstabl;
    private String nombreFarmaceutico;
    private String apellidosFarmaceutico;
    private String nif;
    private String numColegiadoFarmaceutico;
    private String direccion;
    private int tel;
    private String email;
    
	
    public Farmacia() {
        super(TipoUsuario.FARMACIA);
    }
    
}
