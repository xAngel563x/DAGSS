package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Paciente;
import java.util.List;

public interface PacienteServicio {
    List<Paciente> listarTodos();
    Paciente buscarPorId(Long id);
    Paciente guardarPaciente(Paciente paciente);
    void eliminarPaciente(Long id);
}
