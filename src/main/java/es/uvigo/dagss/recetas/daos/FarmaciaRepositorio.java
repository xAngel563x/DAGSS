package es.uvigo.dagss.recetas.daos;

import es.uvigo.dagss.recetas.entidades.Farmacia;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface FarmaciaRepositorio extends JpaRepository<Farmacia, Integer> {
    // De momento tanto este repositorio como el de farmacia no tienen métodos, ya que en las historias de usuario y los requerimientos
    // no hay funcionalidades específicas, pero están creados en caso de necesitar crear métodos más adelante

    @Query("SELECT f FROM Farmacia f WHERE f.nombreEstabl = :nombre AND f.direccion = :direccion")
    List<Farmacia> buscarPorNombreOUbicacion(String nombre,String direccion);
}

