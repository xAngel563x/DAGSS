package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Receta;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RecetaRepositorio extends JpaRepository<Receta, Integer> {

    @Query("SELECT r FROM Receta r WHERE r.prescripcion.paciente.id = :pacienteId AND r.estado = EstadoReceta.PLANIFICADA ORDER BY r.fechaInicial")
    List<Receta> buscarRecetasPlanificadasPorPaciente(@Param("pacienteId") Long pacienteId);
}
