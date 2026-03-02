package ies.alcores.backend_concesionario.repository;

import ies.alcores.backend_concesionario.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {
}