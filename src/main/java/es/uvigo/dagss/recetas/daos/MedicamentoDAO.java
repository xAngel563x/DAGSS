package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Medicamento;

import java.util.List;

public interface MedicamentoDAO extends GenericoDAO<Medicamento, Long> {
    List<Medicamento> findByNombre(String nombre);
    List<Medicamento> findByPrincipioActivo(String principioActivo);
    List<Medicamento> findByFabricante(String fabricante);
    List<Medicamento> findByFamilia(String familia);
}
