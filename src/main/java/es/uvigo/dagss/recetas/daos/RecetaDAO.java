package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Receta;
import es.uvigo.dagss.recetas.entidades.EstadoReceta;

import java.util.List;

public interface RecetaDAO extends GenericoDAO<Receta, Long> {
    List<Receta> findByPrescripcionId(Long prescripcionId);
    List<Receta> findByPacienteId(Long pacienteId);
    List<Receta> findByEstado(EstadoReceta estado);
}
