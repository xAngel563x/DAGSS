package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Prescripcion;

import java.util.List;

public interface PrescripcionDAO extends GenericoDAO<Prescripcion, Long> {
    List<Prescripcion> findByPacienteId(Long pacienteId);
    List<Prescripcion> findByMedicoId(Long medicoId);
}
