package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.FarmaciaDAO;
import es.uvigo.dagss.recetas.entidades.Farmacia;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmaciaServicio {

    private final FarmaciaDAO farmaciaDAO;

    public FarmaciaServicio(FarmaciaDAO farmaciaDAO) {
        this.farmaciaDAO = farmaciaDAO;
    }

    public Farmacia buscarPorId(Long id) {
        return farmaciaDAO.findById(id);
    }

    public List<Farmacia> listarTodas() {
        return farmaciaDAO.findAll();
    }

    public Farmacia guardarFarmacia(Farmacia farmacia) {
        return farmaciaDAO.save(farmacia);
    }

    public void eliminarFarmacia(Long id) {
        farmaciaDAO.delete(id);
    }

    public List<Farmacia> buscarPorNombreEstablecimiento(String nombre) {
        return farmaciaDAO.findByNombreEstablecimiento(nombre);
    }

    public List<Farmacia> buscarPorLocalidad(String localidad) {
        return farmaciaDAO.findByLocalidad(localidad);
    }
}
