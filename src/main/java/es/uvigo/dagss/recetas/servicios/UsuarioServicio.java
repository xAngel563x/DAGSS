package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Usuario;
import java.util.List;

public interface UsuarioServicio {
    Usuario autenticarUsuario(String login, String password);
    Usuario buscarPorId(Long id);
    List<Usuario> listarTodos();
    Usuario guardarUsuario(Usuario usuario);
    void eliminarUsuario(Long id);
}

