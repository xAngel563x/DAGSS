package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Medico;
import java.util.List;

public interface MedicoServicio {
    List<Medico> listarTodos();
    Medico buscarPorId(Long id);
    Medico guardarMedico(Medico medico);
    void eliminarMedico(Long id);
}
