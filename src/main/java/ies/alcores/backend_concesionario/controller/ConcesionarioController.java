package ies.alcores.backend_concesionario.controller;

import ies.alcores.backend_concesionario.model.Concesionario;
import ies.alcores.backend_concesionario.service.ConcesionarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/concesionario")
public class ConcesionarioController {

    @Autowired
    private ConcesionarioService concesionarioService;

    @GetMapping
    public ResponseEntity<List<Concesionario>> listar() {
        return ResponseEntity.ok(this.concesionarioService.findAll());
    }
}
