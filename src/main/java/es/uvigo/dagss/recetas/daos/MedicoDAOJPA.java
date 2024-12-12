package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Medico;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicoDAOJPA extends GenericoDAOJPA<Medico, Long> implements MedicoDAO {

    public MedicoDAOJPA() {
        super(Medico.class);
    }

    @Override
    public List<Medico> findByNombre(String nombre) {
        return entityManager.createQuery(
            "SELECT m FROM Medico m WHERE m.nombre LIKE :nombre", Medico.class)
            .setParameter("nombre", "%" + nombre + "%")
            .getResultList();
    }

    @Override
    public List<Medico> findByCentroDeSaludId(Long centroDeSaludId) {
        return entityManager.createQuery(
            "SELECT m FROM Medico m WHERE m.centroDeSalud.id = :centroDeSaludId", Medico.class)
            .setParameter("centroDeSaludId", centroDeSaludId)
            .getResultList();
    }
}
