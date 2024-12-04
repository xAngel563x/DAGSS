package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Prescripcion;
import es.uvigo.dagss.recetas.daos.PrescripcionRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PrescripcionServicio {

    @Autowired
    private PrescripcionRepositorio prescripcionRepositorio;

    public List<Prescripcion> encontrarPorPaciente(Long pacienteId) {
        return prescripcionRepositorio.encontrarPrescripcionesActivasPorPaciente(pacienteId);
    }

    public List<Prescripcion> encontrarPorMedico(Long medicoId) {
        return prescripcionRepositorio.encontrarPrescripcionesPorMedico(medicoId);
    }

    public Prescripcion crearPrescripcion(Prescripcion prescripcion) {
        return prescripcionRepositorio.save(prescripcion);
    }
}
