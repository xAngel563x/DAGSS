package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Medicamento;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MedicamentoRepositorio extends JpaRepository<Medicamento, Integer> {

    @Query("SELECT m FROM Medicamento m WHERE LOWER(m.nombre) LIKE LOWER(CONCAT('%', :nombre, '%'))")
    List<Medicamento> buscarPorNombreComercial(@Param("nombre") String nombre);

    @Query("SELECT m FROM Medicamento m WHERE LOWER(m.principioActivo) LIKE LOWER(CONCAT('%', :principio, '%'))")
    List<Medicamento> buscarPorPrincipioActivo(@Param("principio") String principio);

    @Query("SELECT m FROM Medicamento m WHERE LOWER(m.fabricante) LIKE LOWER(CONCAT('%', :fabricante, '%'))")
    List<Medicamento> buscarPorFabricante(@Param("fabricante") String fabricante);

    @Query("""
        SELECT m FROM Medicamento m
        WHERE LOWER(m.nombre) LIKE LOWER(CONCAT('%', :criterio, '%'))
           OR LOWER(m.principioActivo) LIKE LOWER(CONCAT('%', :criterio, '%'))
           OR LOWER(m.fabricante) LIKE LOWER(CONCAT('%', :criterio, '%'))
    """)
    List<Medicamento> buscarPorCriterioGeneral(@Param("criterio") String criterio);
}
