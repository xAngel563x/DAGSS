package es.uvigo.dagss.recetas.controladores;

import es.uvigo.dagss.recetas.entidades.Usuario;
import es.uvigo.dagss.recetas.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/auth")
@CrossOrigin(origins = "*")
public class AuthController {

    @Autowired
    private UsuarioServicio usuarioServicio;

    @PostMapping("/login")
    public ResponseEntity<String> login(@RequestBody Usuario usuario) {
        Usuario authenticated = usuarioServicio.autenticarUsuario(usuario.getLogin(), usuario.getPassword());;
        if (authenticated != null) {
            return ResponseEntity.ok("Login exitoso");
        }
        return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Credenciales inválidas");
    }

    @PostMapping("/logout")
    public ResponseEntity<String> logout() {
        // Implementar lógica de logout si es necesario
        return ResponseEntity.ok("Sesión cerrada exitosamente");
    }
}
