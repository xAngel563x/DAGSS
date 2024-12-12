package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.RecetaDAO;
import es.uvigo.dagss.recetas.entidades.Receta;
import es.uvigo.dagss.recetas.entidades.EstadoReceta;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetaServicio {

    private final RecetaDAO recetaDAO;

    public RecetaServicio(RecetaDAO recetaDAO) {
        this.recetaDAO = recetaDAO;
    }

    public Receta buscarPorId(Long id) {
        return recetaDAO.findById(id);
    }

    public List<Receta> listarTodas() {
        return recetaDAO.findAll();
    }

    public Receta guardarReceta(Receta receta) {
        return recetaDAO.save(receta);
    }

    public void eliminarReceta(Long id) {
        recetaDAO.delete(id);
    }

    public List<Receta> buscarPorPrescripcion(Long prescripcionId) {
        return recetaDAO.findByPrescripcionId(prescripcionId);
    }

    public List<Receta> buscarPorPaciente(Long pacienteId) {
        return recetaDAO.findByPacienteId(pacienteId);
    }

    public List<Receta> buscarPorEstado(EstadoReceta estado) {
        return recetaDAO.findByEstado(estado);
    }
}
