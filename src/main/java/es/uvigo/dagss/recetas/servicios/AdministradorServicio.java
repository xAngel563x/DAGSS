package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.AdministradorDAO;
import es.uvigo.dagss.recetas.entidades.Administrador;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AdministradorServicio {

    private final AdministradorDAO administradorDAO;

    public AdministradorServicio(AdministradorDAO administradorDAO) {
        this.administradorDAO = administradorDAO;
    }

    public Administrador buscarPorId(Long id) {
        return administradorDAO.findById(id);
    }

    public List<Administrador> listarTodos() {
        return administradorDAO.findAll();
    }

    public Administrador guardarAdministrador(Administrador administrador) {
        return administradorDAO.save(administrador);
    }

    public void eliminarAdministrador(Long id) {
        administradorDAO.delete(id);
    }

    public List<Administrador> buscarPorNombre(String nombre) {
        return administradorDAO.findByNombre(nombre);
    }

    public List<Administrador> buscarPorEmail(String email) {
        return administradorDAO.findByEmail(email);
    }
}
