package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Usuario;

public interface UsuarioDAO extends GenericoDAO<Usuario, Long> {
    Usuario findByLoginAndPassword(String login, String password);
}
