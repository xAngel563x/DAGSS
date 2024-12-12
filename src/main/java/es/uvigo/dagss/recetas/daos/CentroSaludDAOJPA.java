package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.CentroSalud;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CentroSaludDAOJPA extends GenericoDAOJPA<CentroSalud, Long> implements CentroSaludDAO {

    public CentroSaludDAOJPA() {
        super(CentroSalud.class);
    }

    @Override
    public List<CentroSalud> findByNombre(String nombre) {
        return entityManager.createQuery(
            "SELECT c FROM CentroSalud c WHERE c.nombre LIKE :nombre", CentroSalud.class)
            .setParameter("nombre", "%" + nombre + "%")
            .getResultList();
    }

    @Override
    public List<CentroSalud> findByLocalidad(String localidad) {
        return entityManager.createQuery(
            "SELECT c FROM CentroSalud c WHERE c.direccion.localidad LIKE :localidad", CentroSalud.class)
            .setParameter("localidad", "%" + localidad + "%")
            .getResultList();
    }
}
