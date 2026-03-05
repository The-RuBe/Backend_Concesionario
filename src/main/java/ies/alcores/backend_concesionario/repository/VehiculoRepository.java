package ies.alcores.backend_concesionario.repository;

import ies.alcores.backend_concesionario.model.Vehiculo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;
import java.util.List;
import java.util.Optional;

public interface VehiculoRepository extends JpaRepository<Vehiculo, String> {

    @Query("SELECT v FROM Vehiculo v")
    List<Vehiculo> listarTodos();

    @Query("SELECT v FROM Vehiculo v WHERE v.matricula = ?1")
    Optional<Vehiculo> buscarPorMatricula(String matricula);

    @Modifying
    @Transactional
    @Query(value = "INSERT INTO Vehiculo (matricula, marca, color, potencia, precio) VALUES (?1, ?2, ?3, ?4, ?5)", nativeQuery = true)
    void insertar(String matricula, String marca, String color, Integer potencia, BigDecimal precio);

    @Modifying
    @Transactional
    @Query("DELETE FROM Vehiculo v WHERE v.matricula = ?1")
    void borrar(String matricula);
}