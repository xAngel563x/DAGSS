package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.FarmaciaDAO;
import es.uvigo.dagss.recetas.entidades.Farmacia;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class FarmaciaServicioImpl implements FarmaciaServicio {

    private final FarmaciaDAO farmaciaDAO;

    public FarmaciaServicioImpl(FarmaciaDAO farmaciaDAO) {
        this.farmaciaDAO = farmaciaDAO;
    }

    @Override
    public List<Farmacia> listarTodas() {
        return farmaciaDAO.findAll();
    }

    @Override
    public Farmacia buscarPorId(Long id) {
        return farmaciaDAO.findById(id);
    }

    @Override
    public Farmacia guardarFarmacia(Farmacia farmacia) {
        return farmaciaDAO.save(farmacia);
    }

    @Override
    public void eliminarFarmacia(Long id) {
        farmaciaDAO.delete(id);
    }
}
