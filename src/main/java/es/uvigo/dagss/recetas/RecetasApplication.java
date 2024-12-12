package es.uvigo.dagss.recetas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "es.uvigo.dagss.recetas")
public class RecetasApplication {

    public static void main(String[] args) {
        SpringApplication.run(RecetasApplication.class, args);
    }
}


/*package es.uvigo.dagss.recetas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.uvigo.dagss.recetas.daos.FarmaciaDAO;
import es.uvigo.dagss.recetas.daos.PacienteDAO;
import es.uvigo.dagss.recetas.entidades.Farmacia;
import es.uvigo.dagss.recetas.entidades.Paciente;

@SpringBootApplication
public class RecetasApplication implements CommandLineRunner {

    @Autowired
    private FarmaciaDAO farmaciaDAO;

    @Autowired
    private PacienteDAO pacienteDAO;

    public static void main(String[] args) {
        SpringApplication.run(RecetasApplication.class, args);
    }

    @Override
    public void run(String... args) {
        try {
            crearInstancias();
        } catch (Exception e) {
            System.err.println("Error al crear instancias: " + e.getMessage());
        }
    }

    public void crearInstancias() {
        // Crear instancia de Farmacia
        Farmacia farmacia = new Farmacia();
        farmacia.setNombreEstablecimiento("Farmacia Alo");
        farmacia.setNombreFarmaceutico("Pepe");
        farmacia.setApellidosFarmaceutico("Alvarez");
        farmacia.setDni("32766735");
        farmacia.setTelefono("986467498");
        farmacia.setDireccion("Calle Nuño de Ousende");
        farmacia.setEmail("farmaciaalo@gmail.com");

        farmaciaDAO.save(farmacia);

        // Crear instancia de Paciente
        Paciente paciente = new Paciente();
        paciente.setNombre("Ana");
        paciente.setApellidos("Gomez");
        paciente.setDni("12345678A");
        paciente.setNumeroTarjetaSanitaria("1234567890");
        paciente.setTelefono("987654321");
        paciente.setEmail("ana.gomez@gmail.com");

        pacienteDAO.save(paciente);

        System.out.println("Instancias creadas correctamente.");
    }
}*/
