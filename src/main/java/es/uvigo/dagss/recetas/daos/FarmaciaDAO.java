package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Farmacia;

import java.util.List;

public interface FarmaciaDAO extends GenericoDAO<Farmacia, Long> {
    List<Farmacia> findByNombreEstablecimiento(String nombre);
    List<Farmacia> findByLocalidad(String localidad);
}
