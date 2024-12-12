package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Cita;
import es.uvigo.dagss.recetas.entidades.EstadoCita;

import java.time.LocalDate;
import java.util.List;

public interface CitaDAO extends GenericoDAO<Cita, Long> {
    List<Cita> findByPacienteId(Long pacienteId);
    List<Cita> findByMedicoId(Long medicoId);
    List<Cita> findByEstado(EstadoCita estado);
    List<Cita> findByMedicoIdAndFecha(Long medicoId, LocalDate fecha);
}
