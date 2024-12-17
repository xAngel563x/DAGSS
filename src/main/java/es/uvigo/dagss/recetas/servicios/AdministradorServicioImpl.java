package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.AdministradorDAO;
import es.uvigo.dagss.recetas.entidades.Administrador;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class AdministradorServicioImpl implements AdministradorServicio {

    private final AdministradorDAO administradorDAO;

    public AdministradorServicioImpl(AdministradorDAO administradorDAO) {
        this.administradorDAO = administradorDAO;
    }

    @Override
    public List<Administrador> listarTodos() {
        return administradorDAO.findAll();
    }

    @Override
    public Administrador buscarPorId(Long id) {
        return administradorDAO.findById(id);
    }

    @Override
    public Administrador guardarAdministrador(Administrador administrador) {
        return administradorDAO.save(administrador);
    }

    @Override
    public void eliminarAdministrador(Long id) {
        administradorDAO.delete(id);
    }
}
