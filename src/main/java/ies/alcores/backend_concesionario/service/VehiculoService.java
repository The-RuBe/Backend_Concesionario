package ies.alcores.backend_concesionario.service;

import ies.alcores.backend_concesionario.model.Vehiculo;
import ies.alcores.backend_concesionario.repository.VehiculoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class VehiculoService {

    @Autowired
    private VehiculoRepository vehiculoRepository;

    public List<Vehiculo> findAll() {
        return this.vehiculoRepository.listarTodos();
    }

    public Optional<Vehiculo> findById(String matricula) {
        return this.vehiculoRepository.buscarPorMatricula(matricula);
    }

    public void insertarVehiculo(Vehiculo v) {
        this.vehiculoRepository.insertar(v.getMatricula(), v.getMarca(), v.getColor(), v.getPotencia(), v.getPrecio());
    }

    public void borrarVehiculo(String matricula) {
        this.vehiculoRepository.borrar(matricula);
    }
}