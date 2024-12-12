package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.CentroSalud;

import java.util.List;

public interface CentroSaludDAO extends GenericoDAO<CentroSalud, Long> {
    List<CentroSalud> findByNombre(String nombre);
    List<CentroSalud> findByLocalidad(String localidad);
}
