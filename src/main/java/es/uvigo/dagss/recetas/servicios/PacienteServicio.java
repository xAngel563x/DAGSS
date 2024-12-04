package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Paciente;
import es.uvigo.dagss.recetas.daos.PacienteRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PacienteServicio {

    @Autowired
    private PacienteRepositorio pacienteRepositorio;

    public List<Paciente> buscarPorNombreOApellido(String nombre, String apellido) {
        return pacienteRepositorio.buscarPorNombreOApellido(nombre, apellido);
    }

    public Paciente crearPaciente(Paciente paciente) {
        return pacienteRepositorio.save(paciente);
    }
}
