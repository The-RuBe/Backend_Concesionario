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
        return this.vehiculoRepository.findAll();
    }

    public Optional<Vehiculo> findById(String matricula) {
        return this.vehiculoRepository.findById(matricula);
    }

    public Vehiculo save(Vehiculo vehiculo) {
        return this.vehiculoRepository.save(vehiculo);
    }

    public void deleteById(String matricula) {
        this.vehiculoRepository.deleteById(matricula);
    }
}