package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Prescripcion;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PrescripcionDAOJPA extends GenericoDAOJPA<Prescripcion, Long> implements PrescripcionDAO {

    public PrescripcionDAOJPA() {
        super(Prescripcion.class);
    }

    @Override
    public List<Prescripcion> findByPacienteId(Long pacienteId) {
        return entityManager.createQuery(
            "SELECT p FROM Prescripcion p WHERE p.paciente.id = :pacienteId", Prescripcion.class)
            .setParameter("pacienteId", pacienteId)
            .getResultList();
    }

    @Override
    public List<Prescripcion> findByMedicoId(Long medicoId) {
        return entityManager.createQuery(
            "SELECT p FROM Prescripcion p WHERE p.medico.id = :medicoId", Prescripcion.class)
            .setParameter("medicoId", medicoId)
            .getResultList();
    }
}
