package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.CentroSaludDAO;
import es.uvigo.dagss.recetas.entidades.CentroSalud;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CentroSaludServicioImpl implements CentroSaludServicio {

    private final CentroSaludDAO centroSaludDAO;

    public CentroSaludServicioImpl(CentroSaludDAO centroSaludDAO) {
        this.centroSaludDAO = centroSaludDAO;
    }

    @Override
    public List<CentroSalud> listarTodos() {
        return centroSaludDAO.findAll();
    }

    @Override
    public CentroSalud buscarPorId(Long id) {
        return centroSaludDAO.findById(id);
    }

    @Override
    public CentroSalud guardarCentroSalud(CentroSalud centroSalud) {
        return centroSaludDAO.save(centroSalud);
    }

    @Override
    public void eliminarCentroSalud(Long id) {
        centroSaludDAO.delete(id);
    }
}
