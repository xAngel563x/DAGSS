package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.UsuarioDAO;
import es.uvigo.dagss.recetas.entidades.Usuario;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UsuarioServicio {

    private final UsuarioDAO usuarioDAO;

    public UsuarioServicio(UsuarioDAO usuarioDAO) {
        this.usuarioDAO = usuarioDAO;
    }

    public Usuario autenticarUsuario(String login, String password) {
        return usuarioDAO.findByLoginAndPassword(login, password);
    }

    public Usuario buscarPorId(Long id) {
        return usuarioDAO.findById(id);
    }

    public List<Usuario> listarTodos() {
        return usuarioDAO.findAll();
    }

    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioDAO.save(usuario);
    }

    public void eliminarUsuario(Long id) {
        usuarioDAO.delete(id);
    }
}
