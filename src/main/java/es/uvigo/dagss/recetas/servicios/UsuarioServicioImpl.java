package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.UsuarioDAO;
import es.uvigo.dagss.recetas.entidades.Usuario;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioServicioImpl implements UsuarioServicio {

    private final UsuarioDAO usuarioDAO;

    public UsuarioServicioImpl(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    @Override
    public Usuario autenticarUsuario(String login, String password) {
        return usuarioDAO.findByLoginAndPassword(login, password);
    }

    @Override
    public Usuario buscarPorId(Long id) {
        return usuarioDAO.findById(id);
    }

    @Override
    public List<Usuario> listarTodos() {
        return usuarioDAO.findAll();
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    @Override
    public void eliminarUsuario(Long id) {
        usuarioDAO.delete(id);
    }
}
