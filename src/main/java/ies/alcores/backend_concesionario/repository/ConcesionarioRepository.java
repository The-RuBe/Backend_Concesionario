package ies.alcores.backend_concesionario.repository;


import ies.alcores.backend_concesionario.model.Concesionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ConcesionarioRepository extends JpaRepository<Concesionario, Long> {
}
