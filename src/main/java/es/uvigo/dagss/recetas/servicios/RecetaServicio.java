package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.EstadoReceta;
import es.uvigo.dagss.recetas.entidades.Receta;
import es.uvigo.dagss.recetas.daos.RecetaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecetaServicio {

    @Autowired
    private RecetaRepositorio recetaRepositorio;

    public List<Receta> buscarRecetasPlanificadasPorPaciente(Long pacienteId) {
        return recetaRepositorio.buscarRecetasPlanificadasPorPaciente(pacienteId);
    }

    public Receta actualizarEstado(Receta receta, EstadoReceta estado) {
        receta.setEstado(estado);
        return recetaRepositorio.save(receta);
    }
}
