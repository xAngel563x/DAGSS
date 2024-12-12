package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.MedicamentoDAO;
import es.uvigo.dagss.recetas.entidades.Medicamento;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MedicamentoServicio {

    private final MedicamentoDAO medicamentoDAO;

    public MedicamentoServicio(MedicamentoDAO medicamentoDAO) {
        this.medicamentoDAO = medicamentoDAO;
    }

    public Medicamento buscarPorId(Long id) {
        return medicamentoDAO.findById(id);
    }

    public List<Medicamento> listarTodos() {
        return medicamentoDAO.findAll();
    }

    public Medicamento guardarMedicamento(Medicamento medicamento) {
        return medicamentoDAO.save(medicamento);
    }

    public void eliminarMedicamento(Long id) {
        medicamentoDAO.delete(id);
    }

    public List<Medicamento> buscarPorNombre(String nombre) {
        return medicamentoDAO.findByNombre(nombre);
    }

    public List<Medicamento> buscarPorPrincipioActivo(String principioActivo) {
        return medicamentoDAO.findByPrincipioActivo(principioActivo);
    }

    public List<Medicamento> buscarPorFabricante(String fabricante) {
        return medicamentoDAO.findByFabricante(fabricante);
    }

    public List<Medicamento> buscarPorFamilia(String familia) {
        return medicamentoDAO.findByFamilia(familia);
    }
}
