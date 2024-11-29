package es.uvigo.dagss.recetas;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import es.uvigo.dagss.recetas.entidades.Administrador;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

@SpringBootApplication
public class RecetasApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecetasApplication.class, args);
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("mapeo_PU");
        EntityManager em;
		em = emf.createEntityManager();
		crearInstancias(emf.createEntityManager());

		em.close();
		emf.close();
	}

	public static void crearInstancias(EntityManager em){

		em.getTransaction().begin();

    try {
        // Crear instancias de las entidades
        Administrador admin1 = new Administrador("logAAA", "paswdAAA", "Angel", "Alonso","aaa@gmail.com");
        Administrador admin2 = new Administrador("logBBB", "paswdBBB", "Barras", "Barou","bbb@gmail.com");

        // Persistir las instancias en la base de datos
        em.persist(admin1);
        em.persist(admin2);

        // Confirma la transacción
        em.getTransaction().commit();
    } catch (Exception e) {
        // Si ocurre un error, realiza un rollback
        em.getTransaction().rollback();
        e.printStackTrace();
    }

	}

}
