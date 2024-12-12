package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Paciente;

import java.util.List;

public interface PacienteDAO extends GenericoDAO<Paciente, Long> {
    Paciente findByEmail(String email);
    List<Paciente> findByNombre(String nombre);
    List<Paciente> findByCentroSaludId(Long centroSaludId);
}
