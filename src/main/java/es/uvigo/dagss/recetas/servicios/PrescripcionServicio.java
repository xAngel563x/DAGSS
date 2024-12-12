package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.PrescripcionDAO;
import es.uvigo.dagss.recetas.entidades.Prescripcion;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescripcionServicio {

    private final PrescripcionDAO prescripcionDAO;

    public PrescripcionServicio(PrescripcionDAO prescripcionDAO) {
        this.prescripcionDAO = prescripcionDAO;
    }

    public Prescripcion buscarPorId(Long id) {
        return prescripcionDAO.findById(id);
    }

    public List<Prescripcion> listarTodas() {
        return prescripcionDAO.findAll();
    }

    public Prescripcion guardarPrescripcion(Prescripcion prescripcion) {
        return prescripcionDAO.save(prescripcion);
    }

    public void eliminarPrescripcion(Long id) {
        prescripcionDAO.delete(id);
    }

    public List<Prescripcion> buscarPorPaciente(Long pacienteId) {
        return prescripcionDAO.findByPacienteId(pacienteId);
    }

    public List<Prescripcion> buscarPorMedico(Long medicoId) {
        return prescripcionDAO.findByMedicoId(medicoId);
    }
}
