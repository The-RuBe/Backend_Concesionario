package ies.alcores.backend_concesionario.service;

import ies.alcores.api_productos.model.Categoria;
import ies.alcores.api_productos.repository.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VehiculoService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    public List<Categoria> findAll() {
        return this.categoriaRepository.findAll();
    }
}
