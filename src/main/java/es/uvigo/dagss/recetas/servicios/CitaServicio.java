package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Cita;
import es.uvigo.dagss.recetas.daos.CitaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.Date;
import java.util.List;

@Service
public class CitaServicio {

    @Autowired
    private CitaRepositorio citaRepositorio;

    public List<Cita> buscarCitasPlanificadasPorMedicoYFecha(Long medicoId, Date fecha) {
        return citaRepositorio.buscarCitasPlanificadasPorMedicoYFecha(medicoId, fecha);
    }

    public boolean verificarDisponibilidad(Long medicoId, Date fecha) {
        return citaRepositorio.verificarDisponibilidad(medicoId, fecha).isEmpty();
    }

    public Cita crearCita(Cita cita) {
        return citaRepositorio.save(cita);
    }
}
