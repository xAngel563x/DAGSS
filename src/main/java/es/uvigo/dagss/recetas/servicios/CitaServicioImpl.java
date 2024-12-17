package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.CitaDAO;
import es.uvigo.dagss.recetas.entidades.Cita;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CitaServicioImpl implements CitaServicio {

    private final CitaDAO citaDAO;

    public CitaServicioImpl(CitaDAO citaDAO) {
        this.citaDAO = citaDAO;
    }

    @Override
    public List<Cita> listarTodas() {
        return citaDAO.findAll();
    }

    @Override
    public Cita buscarPorId(Long id) {
        return citaDAO.findById(id);
    }

    @Override
    public Cita guardarCita(Cita cita) {
        return citaDAO.save(cita);
    }

    @Override
    public void eliminarCita(Long id) {
        citaDAO.delete(id);
    }
}
