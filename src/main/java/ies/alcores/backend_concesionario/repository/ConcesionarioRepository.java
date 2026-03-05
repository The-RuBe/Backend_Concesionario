package ies.alcores.backend_concesionario.repository;

import ies.alcores.backend_concesionario.model.Concesionario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ConcesionarioRepository extends JpaRepository<Concesionario, Integer> {

    @Query("SELECT c FROM Concesionario c")
    List<Concesionario> listarTodos();
}