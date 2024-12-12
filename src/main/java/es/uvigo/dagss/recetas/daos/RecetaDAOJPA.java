package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Receta;
import es.uvigo.dagss.recetas.entidades.EstadoReceta;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RecetaDAOJPA extends GenericoDAOJPA<Receta, Long> implements RecetaDAO {

    public RecetaDAOJPA() {
        super(Receta.class);
    }

    @Override
    public List<Receta> findByPrescripcionId(Long prescripcionId) {
        return entityManager.createQuery(
            "SELECT r FROM Receta r WHERE r.prescripcion.id = :prescripcionId", Receta.class)
            .setParameter("prescripcionId", prescripcionId)
            .getResultList();
    }

    @Override
    public List<Receta> findByPacienteId(Long pacienteId) {
        return entityManager.createQuery(
            "SELECT r FROM Receta r WHERE r.prescripcion.paciente.id = :pacienteId", Receta.class)
            .setParameter("pacienteId", pacienteId)
            .getResultList();
    }

    @Override
    public List<Receta> findByEstado(EstadoReceta estado) {
        return entityManager.createQuery(
            "SELECT r FROM Receta r WHERE r.estado = :estado", Receta.class)
            .setParameter("estado", estado)
            .getResultList();
    }
}
