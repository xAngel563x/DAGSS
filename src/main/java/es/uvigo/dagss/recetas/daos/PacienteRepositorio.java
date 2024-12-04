package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Paciente;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface PacienteRepositorio extends JpaRepository<Paciente, Integer> {
    // De momento tanto este repositorio como el de farmacia no tienen métodos, ya que en las historias de usuario y los requerimientos
    // no hay funcionalidades específicas, pero están creados en caso de necesitar crear métodos más adelante

    @Query("SELECT p FROM Paciente p WHERE p.nombre = :nombre AND p.apellidos = :apellidos")
    List<Paciente> buscarPorNombreOApellido(String nombre, String apellidos);
}
