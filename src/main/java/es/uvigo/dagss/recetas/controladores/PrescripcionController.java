package es.uvigo.dagss.recetas.controladores;

import es.uvigo.dagss.recetas.entidades.Prescripcion;
import es.uvigo.dagss.recetas.servicios.PrescripcionServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/prescripciones")
public class PrescripcionController {

    @Autowired
    private PrescripcionServicio prescripcionServicio;

    @GetMapping
    public ResponseEntity<List<Prescripcion>> listarPrescripciones() {
        return ResponseEntity.ok(prescripcionServicio.listarTodas());
    }

    @PostMapping
    public ResponseEntity<Prescripcion> crearPrescripcion(@RequestBody Prescripcion prescripcion) {
        return ResponseEntity.ok(prescripcionServicio.guardarPrescripcion(prescripcion));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarPrescripcion(@PathVariable Long id) {
        prescripcionServicio.eliminarPrescripcion(id);
        return ResponseEntity.noContent().build();
    }
}
