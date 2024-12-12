package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Farmacia;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class FarmaciaDAOJPA extends GenericoDAOJPA<Farmacia, Long> implements FarmaciaDAO {
    public FarmaciaDAOJPA() {
        super(Farmacia.class);
    }

    @Override
    public List<Farmacia> findByNombreEstablecimiento(String nombre) {
        return entityManager.createQuery(
            "SELECT f FROM Farmacia f WHERE f.nombreEstablecimiento LIKE :nombre", Farmacia.class)
            .setParameter("nombre", "%" + nombre + "%")
            .getResultList();
    }

    @Override
    public List<Farmacia> findByLocalidad(String localidad) {
        return entityManager.createQuery(
            "SELECT f FROM Farmacia f WHERE f.direccion.localidad LIKE :localidad", Farmacia.class)
            .setParameter("localidad", "%" + localidad + "%")
            .getResultList();
    }
}
