package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.PacienteDAO;
import es.uvigo.dagss.recetas.entidades.Paciente;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {

    private final PacienteDAO pacienteDAO;

    public PacienteServicio(PacienteDAO pacienteDAO) {
        this.pacienteDAO = pacienteDAO;
    }

    public Paciente buscarPorId(Long id) {
        return pacienteDAO.findById(id);
    }

    public List<Paciente> listarTodos() {
        return pacienteDAO.findAll();
    }

    public Paciente guardarPaciente(Paciente paciente) {
        return pacienteDAO.save(paciente);
    }

    public void eliminarPaciente(Long id) {
        pacienteDAO.delete(id);
    }

    public List<Paciente> buscarPorNombre(String nombre) {
        return pacienteDAO.findByNombre(nombre);
    }

    public List<Paciente> buscarPorCentroSalud(Long centroSaludId) {
        return pacienteDAO.findByCentroSaludId(centroSaludId);
    }
}

