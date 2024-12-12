package es.uvigo.dagss.recetas.controladores;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import es.uvigo.dagss.recetas.entidades.Medicamento;
import es.uvigo.dagss.recetas.servicios.MedicamentoServicio;

@RestController
@RequestMapping("/api/medicamentos")
public class MedicamentoController {

    @Autowired
    private MedicamentoServicio medicamentoservicio;

    @GetMapping
    public ResponseEntity<List<Medicamento>> listarFarmacias() {
        return ResponseEntity.ok(medicamentoservicio.listarTodos());
    }

    @PostMapping
    public ResponseEntity<Medicamento> crearFarmacia(@RequestBody Medicamento medicamento) {
        return ResponseEntity.ok(medicamentoservicio.guardarMedicamento(medicamento));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFarmacia(@PathVariable Long id) {
        medicamentoservicio.eliminarMedicamento(id);
        return ResponseEntity.noContent().build();
    }
}
