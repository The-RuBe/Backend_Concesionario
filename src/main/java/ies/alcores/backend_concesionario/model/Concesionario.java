package ies.alcores.backend_concesionario.model;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
import java.util.List;

    @Data
    @Entity
    @Table(name = "Concesionario")
    public class Concesionario {

        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        private Long id;

        @Column(unique = true, nullable = false, length = 15)
        private String cif;

        @Column(nullable = false, length = 100)
        private String nombre;

        private String ubicacion;

        private Integer numeroVehiculos;

        @OneToMany(mappedBy = "concesionario", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
        private List<Vehiculo> vehiculos;

    }
