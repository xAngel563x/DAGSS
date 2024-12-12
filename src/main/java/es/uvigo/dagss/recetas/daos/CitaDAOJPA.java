package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Cita;
import es.uvigo.dagss.recetas.entidades.EstadoCita;
import org.springframework.stereotype.Repository;

import java.time.LocalDate;
import java.util.List;

@Repository
public class CitaDAOJPA extends GenericoDAOJPA<Cita, Long> implements CitaDAO {

    public CitaDAOJPA() {
        super(Cita.class);
    }

    @Override
    public List<Cita> findByPacienteId(Long pacienteId) {
        return entityManager.createQuery(
            "SELECT c FROM Cita c WHERE c.paciente.id = :pacienteId", Cita.class)
            .setParameter("pacienteId", pacienteId)
            .getResultList();
    }

    @Override
    public List<Cita> findByMedicoId(Long medicoId) {
        return entityManager.createQuery(
            "SELECT c FROM Cita c WHERE c.medico.id = :medicoId", Cita.class)
            .setParameter("medicoId", medicoId)
            .getResultList();
    }

    @Override
    public List<Cita> findByEstado(EstadoCita estado) {
        return entityManager.createQuery(
            "SELECT c FROM Cita c WHERE c.estado = :estado", Cita.class)
            .setParameter("estado", estado)
            .getResultList();
    }

    @Override
    public List<Cita> findByMedicoIdAndFecha(Long medicoId, LocalDate fecha) {
        return entityManager.createQuery(
            "SELECT c FROM Cita c WHERE c.medico.id = :medicoId AND c.fecha = :fecha", Cita.class)
            .setParameter("medicoId", medicoId)
            .setParameter("fecha", fecha)
            .getResultList();
    }
}
