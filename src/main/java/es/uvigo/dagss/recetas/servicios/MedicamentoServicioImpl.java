package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.daos.MedicamentoDAO;
import es.uvigo.dagss.recetas.entidades.Medicamento;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class MedicamentoServicioImpl implements MedicamentoServicio {

    private final MedicamentoDAO medicamentoDAO;

    public MedicamentoServicioImpl(MedicamentoDAO medicamentoDAO) {
        this.medicamentoDAO = medicamentoDAO;
    }

    @Override
    public List<Medicamento> listarTodos() {
        return medicamentoDAO.findAll();
    }

    @Override
    public Medicamento buscarPorId(Long id) {
        return medicamentoDAO.findById(id);
    }

    @Override
    public Medicamento guardarMedicamento(Medicamento medicamento) {
        return medicamentoDAO.save(medicamento);
    }

    @Override
    public void eliminarMedicamento(Long id) {
        medicamentoDAO.delete(id);
    }
}
