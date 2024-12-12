package es.uvigo.dagss.recetas.controladores;

import es.uvigo.dagss.recetas.entidades.Cita;
import es.uvigo.dagss.recetas.servicios.CitaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/citas")
public class CitaController {

    @Autowired
    private CitaServicio citaServicio;

    @GetMapping
    public ResponseEntity<List<Cita>> listarCitas() {
        return ResponseEntity.ok(citaServicio.listarTodas());
    }

    @PostMapping
    public ResponseEntity<Cita> crearCita(@RequestBody Cita cita) {
        return ResponseEntity.ok(citaServicio.guardarCita(cita));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarCita(@PathVariable Long id) {
        citaServicio.eliminarCita(id);
        return ResponseEntity.noContent().build();
    }
}
