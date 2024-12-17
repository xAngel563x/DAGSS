package es.uvigo.dagss.recetas.controladores;

import es.uvigo.dagss.recetas.servicios.MedicamentoServicio;
import es.uvigo.dagss.recetas.entidades.Medicamento;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoServicio medicamentoServicio;

    @GetMapping
    public ResponseEntity<List<Medicamento>> listarMedicamentos() {
        return ResponseEntity.ok(medicamentoServicio.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Medicamento> crearMedicamento(@RequestBody Medicamento med) {
        return ResponseEntity.ok(medicamentoServicio.guardarMedicamento(med));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarMedicamento(@PathVariable Long id) {
        medicamentoServicio.eliminarMedicamento(id);
        return ResponseEntity.noContent().build();
    }
}