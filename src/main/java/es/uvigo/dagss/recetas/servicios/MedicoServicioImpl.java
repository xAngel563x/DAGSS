package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.MedicoDAO;
import es.uvigo.dagss.recetas.entidades.Medico;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicoServicioImpl implements MedicoServicio {

    private final MedicoDAO medicoDAO;

    public MedicoServicioImpl(MedicoDAO medicoDAO) {
        this.medicoDAO = medicoDAO;
    }

    @Override
    public List<Medico> listarTodos() {
        return medicoDAO.findAll();
    }

    @Override
    public Medico buscarPorId(Long id) {
        return medicoDAO.findById(id);
    }

    @Override
    public Medico guardarMedico(Medico medico) {
        return medicoDAO.save(medico);
    }

    @Override
    public void eliminarMedico(Long id) {
        medicoDAO.delete(id);
    }
}
