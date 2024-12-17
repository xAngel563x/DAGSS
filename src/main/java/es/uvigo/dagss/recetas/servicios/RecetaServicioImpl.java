package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.RecetaDAO;
import es.uvigo.dagss.recetas.entidades.Receta;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class RecetaServicioImpl implements RecetaServicio {

    private final RecetaDAO recetaDAO;

    public RecetaServicioImpl(RecetaDAO recetaDAO) {
        this.recetaDAO = recetaDAO;
    }

    @Override
    public List<Receta> listarTodas() {
        return recetaDAO.findAll();
    }

    @Override
    public Receta buscarPorId(Long id) {
        return recetaDAO.findById(id);
    }

    @Override
    public Receta guardarReceta(Receta receta) {
        return recetaDAO.save(receta);
    }

    @Override
    public void eliminarReceta(Long id) {
        recetaDAO.delete(id);
    }
}
