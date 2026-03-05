package ies.alcores.backend_concesionario.service;

import ies.alcores.backend_concesionario.model.Concesionario;
import ies.alcores.backend_concesionario.repository.ConcesionarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ConcesionarioService {

    @Autowired
    private ConcesionarioRepository concesionarioRepository;

    public List<Concesionario> findAll() {
        return this.concesionarioRepository.listarTodos();
    }
}