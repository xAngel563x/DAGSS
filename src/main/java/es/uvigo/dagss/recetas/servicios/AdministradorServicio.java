package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Administrador;
import java.util.List;

public interface AdministradorServicio {
    List<Administrador> listarTodos();
    Administrador buscarPorId(Long id);
    Administrador guardarAdministrador(Administrador administrador);
    void eliminarAdministrador(Long id);
}
