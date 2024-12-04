package es.uvigo.dagss.recetas;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import es.uvigo.dagss.recetas.daos.FarmaciaRepositorio;
import es.uvigo.dagss.recetas.entidades.Farmacia;
import es.uvigo.dagss.recetas.entidades.Paciente;
import es.uvigo.dagss.recetas.servicios.FarmaciaServicio;
import es.uvigo.dagss.recetas.servicios.PacienteServicio;


@SpringBootApplication
public class RecetasApplication implements CommandLineRunner{

	@Autowired
	FarmaciaRepositorio repFarm;

	public static void main(String[] args) {
		SpringApplication.run(RecetasApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//crearInstancias(); ------------------ Errores al crear instancias
	}

	public void crearInstancias(){
		
		Farmacia f = new Farmacia("Farmacia Alo", "Pepe", "Alvarez", "32766735", 
			"986467498", "Calle Nuño de Ousende", "576294072", "farmaciaalo@gmail.com");
		repFarm.save(f);
	}

}
