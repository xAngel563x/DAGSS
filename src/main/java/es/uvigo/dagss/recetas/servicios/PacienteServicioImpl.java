package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.PacienteDAO;
import es.uvigo.dagss.recetas.entidades.Paciente;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PacienteServicioImpl implements PacienteServicio {

    private final PacienteDAO pacienteDAO;

    public PacienteServicioImpl(PacienteDAO pacienteDAO) {
        this.pacienteDAO = pacienteDAO;
    }

    @Override
    public List<Paciente> listarTodos() {
        return pacienteDAO.findAll();
    }

    @Override
    public Paciente buscarPorId(Long id) {
        return pacienteDAO.findById(id);
    }

    @Override
    public Paciente guardarPaciente(Paciente paciente) {
        return pacienteDAO.save(paciente);
    }

    @Override
    public void eliminarPaciente(Long id) {
        pacienteDAO.delete(id);
    }
}
