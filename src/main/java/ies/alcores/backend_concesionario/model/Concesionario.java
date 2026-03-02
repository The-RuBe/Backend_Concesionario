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
        private Integer id;

        @Column(unique = true, nullable = false, length = 15)
        private String cif;

        @Column(nullable = false, length = 100)
        private String nombre;

        private String ubicacion;

        @Column(name = "numero_vehiculos")
        private Integer numeroVehiculos;

        // La clave de la relación uno a muchos
        @OneToMany(mappedBy = "concesionario", cascade = CascadeType.ALL)
        private List<Vehiculo> vehiculos;

        // Constructores, getters y setters omitidos para mantener el código limpio
    }
