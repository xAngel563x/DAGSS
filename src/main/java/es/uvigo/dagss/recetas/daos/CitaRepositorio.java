package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Cita;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Date;
import java.util.List;

@Repository
public interface CitaRepositorio extends JpaRepository<Cita, Integer> {

    @Query("SELECT c FROM Cita c WHERE c.medico.id = :medicoId AND c.fecha = :fecha AND c.estado = EstadoCita.PLANIFICADA")
    List<Cita> buscarCitasPlanificadasPorMedicoYFecha(@Param("medicoId") Long medicoId, @Param("fecha") Date fecha);

    @Query("SELECT c FROM Cita c WHERE c.medico.id = :medicoId AND c.fecha = :fecha AND c.estado = EstadoCita.PLANIFICADA")
    List<Cita> verificarDisponibilidad(@Param("medicoId") Long medicoId, @Param("fecha") Date fecha);
}
