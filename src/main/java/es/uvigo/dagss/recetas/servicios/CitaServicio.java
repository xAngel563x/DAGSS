package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.CitaDAO;
import es.uvigo.dagss.recetas.entidades.Cita;
import es.uvigo.dagss.recetas.entidades.EstadoCita;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class CitaServicio {

    private final CitaDAO citaDAO;

    public CitaServicio(CitaDAO citaDAO) {
        this.citaDAO = citaDAO;
    }

    public Cita buscarPorId(Long id) {
        return citaDAO.findById(id);
    }

    public List<Cita> listarTodas() {
        return citaDAO.findAll();
    }

    public Cita guardarCita(Cita cita) {
        return citaDAO.save(cita);
    }

    public void eliminarCita(Long id) {
        citaDAO.delete(id);
    }

    public List<Cita> buscarPorPaciente(Long pacienteId) {
        return citaDAO.findByPacienteId(pacienteId);
    }

    public List<Cita> buscarPorMedico(Long medicoId) {
        return citaDAO.findByMedicoId(medicoId);
    }

    public List<Cita> buscarPorEstado(EstadoCita estado) {
        return citaDAO.findByEstado(estado);
    }

    public List<Cita> buscarPorMedicoYFecha(Long medicoId, LocalDate fecha) {
        return citaDAO.findByMedicoIdAndFecha(medicoId, fecha);
    }
}
