package ies.alcores.backend_concesionario.controller;

import ies.alcores.backend_concesionario.model.Vehiculo;
import ies.alcores.backend_concesionario.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/vehiculos")
public class VehiculoController {

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping
    public ResponseEntity<List<Vehiculo>> listarTodos() {
        return ResponseEntity.ok(this.vehiculoService.findAll());
    }

    @GetMapping("/{matricula}")
    public ResponseEntity<Vehiculo> buscarPorMatricula(@PathVariable String matricula) {
        return this.vehiculoService.findById(matricula)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Vehiculo> insertarVehiculo(@RequestBody Vehiculo vehiculo) {
        return ResponseEntity.ok(this.vehiculoService.save(vehiculo));
    }

    @DeleteMapping("/{matricula}")
    public ResponseEntity<Void> borrarVehiculo(@PathVariable String matricula) {
        this.vehiculoService.deleteById(matricula);
        return ResponseEntity.noContent().build();
    }
}