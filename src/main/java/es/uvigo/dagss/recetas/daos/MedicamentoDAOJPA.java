package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Medicamento;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class MedicamentoDAOJPA extends GenericoDAOJPA<Medicamento, Long> implements MedicamentoDAO {

    public MedicamentoDAOJPA() {
        super(Medicamento.class);
    }

    @Override
    public List<Medicamento> findByNombre(String nombre) {
        return entityManager.createQuery(
            "SELECT m FROM Medicamento m WHERE m.nombreComercial LIKE :nombre", Medicamento.class)
            .setParameter("nombre", "%" + nombre + "%")
            .getResultList();
    }

    @Override
    public List<Medicamento> findByPrincipioActivo(String principioActivo) {
        return entityManager.createQuery(
            "SELECT m FROM Medicamento m WHERE m.principioActivo LIKE :principioActivo", Medicamento.class)
            .setParameter("principioActivo", "%" + principioActivo + "%")
            .getResultList();
    }

    @Override
    public List<Medicamento> findByFabricante(String fabricante) {
        return entityManager.createQuery(
            "SELECT m FROM Medicamento m WHERE m.fabricante LIKE :fabricante", Medicamento.class)
            .setParameter("fabricante", "%" + fabricante + "%")
            .getResultList();
    }

    @Override
    public List<Medicamento> findByFamilia(String familia) {
        return entityManager.createQuery(
            "SELECT m FROM Medicamento m WHERE m.familia LIKE :familia", Medicamento.class)
            .setParameter("familia", "%" + familia + "%")
            .getResultList();
    }
}
