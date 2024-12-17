package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Medicamento;
import java.util.List;

public interface MedicamentoServicio {
    List<Medicamento> listarTodos();
    Medicamento buscarPorId(Long id);
    Medicamento guardarMedicamento(Medicamento medicamento);
    void eliminarMedicamento(Long id);
}
