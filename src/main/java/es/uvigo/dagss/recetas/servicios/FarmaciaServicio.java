package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Farmacia;
import java.util.List;

public interface FarmaciaServicio {
    List<Farmacia> listarTodas();
    Farmacia buscarPorId(Long id);
    Farmacia guardarFarmacia(Farmacia farmacia);
    void eliminarFarmacia(Long id);
}
