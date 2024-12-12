package es.uvigo.dagss.recetas.controladores;

import es.uvigo.dagss.recetas.daos.MedicoDAO;
import es.uvigo.dagss.recetas.entidades.Medico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/medicos")
public class MedicoController {

    @Autowired
    private MedicoDAO medicoDAO;

    @GetMapping
    public List<Medico> getAllMedicos() {
        return medicoDAO.findAll();
    }

    @PostMapping
    public Medico createMedico(@Valid @RequestBody Medico medico) {
        return medicoDAO.save(medico);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateMedico(@PathVariable Long id, @Valid @RequestBody Medico details) {
        Medico medico = medicoDAO.findById(id);
        if (medico != null) {
            medico.setNombre(details.getNombre());
            medico.setApellidos(details.getApellidos());
            medicoDAO.save(medico);
            return ResponseEntity.ok(medico);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteMedico(@PathVariable Long id) {
        Medico medico = medicoDAO.findById(id);
        if (medico != null) {
            medico.setActivo(false);
            medicoDAO.save(medico);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
