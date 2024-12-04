package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Medicamento;
import es.uvigo.dagss.recetas.daos.MedicamentoRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoServicio {

    @Autowired
    private MedicamentoRepositorio medicamentoRepositorio;

    public List<Medicamento> buscarPorNombre(String nombre) {
        return medicamentoRepositorio.buscarPorNombreComercial(nombre);
    }

    public List<Medicamento> buscarPorCriterioGeneral(String criterio) {
        return medicamentoRepositorio.buscarPorCriterioGeneral(criterio);
    }
}
