package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Prescripcion;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PrescripcionRepositorio extends JpaRepository<Prescripcion, Integer> {

    @Query("SELECT p FROM Prescripcion p WHERE p.paciente.id = :pacienteId AND p.activo = true")
    List<Prescripcion> encontrarPrescripcionesActivasPorPaciente(@Param("pacienteId") Long pacienteId);

    @Query("SELECT p FROM Prescripcion p WHERE p.medico.id = :medicoId")
    List<Prescripcion> encontrarPrescripcionesPorMedico(@Param("medicoId") Long medicoId);
}
