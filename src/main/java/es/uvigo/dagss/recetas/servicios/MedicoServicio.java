package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.MedicoDAO;
import es.uvigo.dagss.recetas.entidades.Medico;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicoServicio {

    private final MedicoDAO medicoDAO;

    public MedicoServicio(MedicoDAO medicoDAO) {
        this.medicoDAO = medicoDAO;
    }

    public Medico buscarPorId(Long id) {
        return medicoDAO.findById(id);
    }

    public List<Medico> listarTodos() {
        return medicoDAO.findAll();
    }

    public Medico guardarMedico(Medico medico) {
        return medicoDAO.save(medico);
    }

    public void eliminarMedico(Long id) {
        medicoDAO.delete(id);
    }

    public List<Medico> buscarPorNombre(String nombre) {
        return medicoDAO.findByNombre(nombre);
    }

    public List<Medico> buscarPorCentroSalud(Long centroSaludId) {
        return medicoDAO.findByCentroDeSaludId(centroSaludId);
    }
}
