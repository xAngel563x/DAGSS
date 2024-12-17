package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Prescripcion;
import java.util.List;

public interface PrescripcionServicio {
    List<Prescripcion> listarTodas();
    Prescripcion buscarPorId(Long id);
    Prescripcion guardarPrescripcion(Prescripcion prescripcion);
    void eliminarPrescripcion(Long id);
}
