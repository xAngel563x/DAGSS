package es.uvigo.dagss.recetas.controladores;

import es.uvigo.dagss.recetas.entidades.Receta;
import es.uvigo.dagss.recetas.servicios.RecetaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/recetas")
public class RecetaController {

    @Autowired
    private RecetaServicio recetaServicio;

    @GetMapping
    public ResponseEntity<List<Receta>> listarRecetas() {
        return ResponseEntity.ok(recetaServicio.listarTodas());
    }

    @PostMapping
    public ResponseEntity<Receta> crearReceta(@RequestBody Receta receta) {
        return ResponseEntity.ok(recetaServicio.guardarReceta(receta));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarReceta(@PathVariable Long id) {
        recetaServicio.eliminarReceta(id);
        return ResponseEntity.noContent().build();
    }
}

