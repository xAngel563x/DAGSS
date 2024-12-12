package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Medico;

import java.util.List;

public interface MedicoDAO extends GenericoDAO<Medico, Long> {
    List<Medico> findByNombre(String nombre);
    List<Medico> findByCentroDeSaludId(Long centroDeSaludId);
}
