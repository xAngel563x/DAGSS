package es.uvigo.dagss.recetas.controladores;

import es.uvigo.dagss.recetas.daos.CentroSaludDAO;
import es.uvigo.dagss.recetas.entidades.CentroSalud;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/centros-salud")
public class CentroSaludController {

    @Autowired
    private CentroSaludDAO centroSaludDAO;

    @GetMapping
    public List<CentroSalud> getAllCentrosSalud() {
        return centroSaludDAO.findAll();
    }

    @PostMapping
    public CentroSalud createCentroSalud(@Valid @RequestBody CentroSalud centroSalud) {
        return centroSaludDAO.save(centroSalud);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateCentroSalud(@PathVariable Long id, @Valid @RequestBody CentroSalud details) {
        CentroSalud centro = centroSaludDAO.findById(id);
        if (centro != null) {
            centro.setNombre(details.getNombre());
            centro.setDireccion(details.getDireccion());
            centro.setEmail(details.getEmail());
            centroSaludDAO.save(centro);
            return ResponseEntity.ok(centro);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteCentroSalud(@PathVariable Long id) {
        CentroSalud centro = centroSaludDAO.findById(id);
        if (centro != null) {
            centro.setActivo(false);
            centroSaludDAO.save(centro);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
