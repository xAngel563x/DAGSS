package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Cita;
import java.util.List;

public interface CitaServicio {
    List<Cita> listarTodas();
    Cita buscarPorId(Long id);
    Cita guardarCita(Cita cita);
    void eliminarCita(Long id);
}
