package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Administrador;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class AdministradorDAOJPA extends GenericoDAOJPA<Administrador, Long> implements AdministradorDAO {

    public AdministradorDAOJPA() {
        super(Administrador.class);
    }

    @Override
    public List<Administrador> findByNombre(String nombre) {
        return entityManager.createQuery(
            "SELECT a FROM Administrador a WHERE a.nombre LIKE :nombre", Administrador.class)
            .setParameter("nombre", "%" + nombre + "%")
            .getResultList();
    }

    @Override
    public List<Administrador> findByEmail(String email) {
        return entityManager.createQuery(
            "SELECT a FROM Administrador a WHERE a.email LIKE :email", Administrador.class)
            .setParameter("email", "%" + email + "%")
            .getResultList();
    }
}
