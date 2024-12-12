package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Paciente;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PacienteDAOJPA extends GenericoDAOJPA<Paciente, Long> implements PacienteDAO {

    public PacienteDAOJPA() {
        super(Paciente.class);
    }

    @Override
    public Paciente findByEmail(String email) {
        TypedQuery<Paciente> query = entityManager.createQuery(
            "SELECT p FROM Paciente p WHERE p.email = :email", Paciente.class);
        query.setParameter("email", email);
        return query.getResultStream().findFirst().orElse(null);
    }

    @Override
    public List<Paciente> findByNombre(String nombre) {
        return entityManager.createQuery(
            "SELECT p FROM Paciente p WHERE p.nombre LIKE :nombre", Paciente.class)
            .setParameter("nombre", "%" + nombre + "%")
            .getResultList();
    }

    @Override
    public List<Paciente> findByCentroSaludId(Long centroSaludId) {
        return entityManager.createQuery(
            "SELECT p FROM Paciente p WHERE p.centroSalud.id = :centroSaludId", Paciente.class)
            .setParameter("centroSaludId", centroSaludId)
            .getResultList();
    }
}
