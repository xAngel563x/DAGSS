package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Usuario;
import jakarta.persistence.TypedQuery;
import org.springframework.stereotype.Repository;

@Repository
public class UsuarioDAOJPA extends GenericoDAOJPA<Usuario, Long> implements UsuarioDAO {
    public UsuarioDAOJPA() {
        super(Usuario.class);
    }

    @Override
    public Usuario findByLoginAndPassword(String login, String password) {
        TypedQuery<Usuario> query = entityManager.createQuery(
            "SELECT u FROM Usuario u WHERE u.login = :login AND u.password = :password", Usuario.class);
        query.setParameter("login", login);
        query.setParameter("password", password);
        return query.getResultStream().findFirst().orElse(null);
    }
}
