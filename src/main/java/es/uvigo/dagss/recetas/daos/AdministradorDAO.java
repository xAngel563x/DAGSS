package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Administrador;

import java.util.List;

public interface AdministradorDAO extends GenericoDAO<Administrador, Long> {
    List<Administrador> findByNombre(String nombre);
    List<Administrador> findByEmail(String email);
}
