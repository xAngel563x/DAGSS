package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.CentroSalud;
import java.util.List;

public interface CentroSaludServicio {
    List<CentroSalud> listarTodos();
    CentroSalud buscarPorId(Long id);
    CentroSalud guardarCentroSalud(CentroSalud centroSalud);
    void eliminarCentroSalud(Long id);
}

