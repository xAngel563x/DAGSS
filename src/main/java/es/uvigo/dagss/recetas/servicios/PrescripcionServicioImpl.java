package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.PrescripcionDAO;
import es.uvigo.dagss.recetas.entidades.Prescripcion;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class PrescripcionServicioImpl implements PrescripcionServicio {

    private final PrescripcionDAO prescripcionDAO;

    public PrescripcionServicioImpl(PrescripcionDAO prescripcionDAO) {
        this.prescripcionDAO = prescripcionDAO;
    }

    @Override
    public List<Prescripcion> listarTodas() {
        return prescripcionDAO.findAll();
    }

    @Override
    public Prescripcion buscarPorId(Long id) {
        return prescripcionDAO.findById(id);
    }

    @Override
    public Prescripcion guardarPrescripcion(Prescripcion prescripcion) {
        return prescripcionDAO.save(prescripcion);
    }

    @Override
    public void eliminarPrescripcion(Long id) {
        prescripcionDAO.delete(id);
    }
}
