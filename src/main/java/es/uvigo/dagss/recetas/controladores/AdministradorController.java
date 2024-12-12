package es.uvigo.dagss.recetas.controladores;

import es.uvigo.dagss.recetas.daos.AdministradorDAO;
import es.uvigo.dagss.recetas.entidades.Administrador;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/administradores")
public class AdministradorController {

    @Autowired
    private AdministradorDAO administradorDAO;

    @GetMapping
    public List<Administrador> getAllAdministradores() {
        return administradorDAO.findAll();
    }

    @PostMapping
    public Administrador createAdministrador(@Valid @RequestBody Administrador administrador) {
        return administradorDAO.save(administrador);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateAdministrador(@PathVariable Long id, @Valid @RequestBody Administrador adminDetails) {
        Administrador admin = administradorDAO.findById(id);
        if (admin != null) {
            admin.setNombre(adminDetails.getNombre());
            admin.setEmail(adminDetails.getEmail());
            administradorDAO.save(admin);
            return ResponseEntity.ok(admin);
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteAdministrador(@PathVariable Long id) {
        Administrador admin = administradorDAO.findById(id);
        if (admin != null) {
            admin.setActivo(false);
            administradorDAO.save(admin);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
