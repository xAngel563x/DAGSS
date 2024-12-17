package es.uvigo.dagss.recetas.controladores;

import es.uvigo.dagss.recetas.entidades.Farmacia;
import es.uvigo.dagss.recetas.servicios.FarmaciaServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/farmacias")
public class FarmaciaController {

    @Autowired
    private FarmaciaServicio farmaciaServicio;

    @GetMapping
    public ResponseEntity<List<Farmacia>> listarFarmacias() {
        return ResponseEntity.ok(farmaciaServicio.listarTodas());
    }

    @PostMapping
    public ResponseEntity<Farmacia> crearFarmacia(@RequestBody Farmacia farmacia) {
        return ResponseEntity.ok(farmaciaServicio.guardarFarmacia(farmacia));
    }
    
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> eliminarFarmacia(@PathVariable Long id) {
        farmaciaServicio.eliminarFarmacia(id);
        return ResponseEntity.noContent().build();
    }
}
