package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.CentroSaludDAO;
import es.uvigo.dagss.recetas.entidades.CentroSalud;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CentroSaludServicio {

    private final CentroSaludDAO centroSaludDAO;

    public CentroSaludServicio(CentroSaludDAO centroSaludDAO) {
        this.centroSaludDAO = centroSaludDAO;
    }

    public CentroSalud buscarPorId(Long id) {
        return centroSaludDAO.findById(id);
    }

    public List<CentroSalud> listarTodos() {
        return centroSaludDAO.findAll();
    }

    public CentroSalud guardarCentroSalud(CentroSalud centroSalud) {
        return centroSaludDAO.save(centroSalud);
    }

    public void eliminarCentroSalud(Long id) {
        centroSaludDAO.delete(id);
    }

    public List<CentroSalud> buscarPorNombre(String nombre) {
        return centroSaludDAO.findByNombre(nombre);
    }

    public List<CentroSalud> buscarPorLocalidad(String localidad) {
        return centroSaludDAO.findByLocalidad(localidad);
    }
}
