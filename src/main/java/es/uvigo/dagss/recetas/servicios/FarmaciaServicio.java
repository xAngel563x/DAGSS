package es.uvigo.dagss.recetas.servicios;

import es.uvigo.dagss.recetas.entidades.Farmacia;
import es.uvigo.dagss.recetas.daos.FarmaciaRepositorio;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FarmaciaServicio {

    @Autowired
    private FarmaciaRepositorio farmaciaRepositorio;

    public List<Farmacia> buscarPorNombreOUbicacion(String nombre, String direccion) {
        return farmaciaRepositorio.buscarPorNombreOUbicacion(nombre, direccion);
    }

    public Farmacia crearFarmacia(Farmacia farmacia) {
        return farmaciaRepositorio.save(farmacia);
    }
}
