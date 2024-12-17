package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Receta;
import java.util.List;

public interface RecetaServicio {
    List<Receta> listarTodas();
    Receta buscarPorId(Long id);
    Receta guardarReceta(Receta receta);
    void eliminarReceta(Long id);
}

