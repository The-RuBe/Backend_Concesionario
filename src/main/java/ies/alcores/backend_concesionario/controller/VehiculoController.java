package ies.alcores.backend_concesionario.controller;

import ies.alcores.backend_concesionario.model.Vehiculo;
import ies.alcores.backend_concesionario.service.VehiculoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class VehiculoController {

    //Esto es un controlador

    @Autowired
    private VehiculoService vehiculoService;

    @GetMapping("")
    public ResponseEntity<List<Vehiculo>> findAll(){
        return ResponseEntity.ok(this.vehiculoService.findAll());
    }

    @GetMapping("categoria/{nombreCat}")
    public ResponseEntity<List<Vehiculo>> findByCategoria(@PathVariable String nombreCat){
        return ResponseEntity.ok(this.vehiculoService.findByConcesionario(nombreCat));
    }
}