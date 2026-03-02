package ies.alcores.backend_concesionario.model;

import jakarta.persistence.*;
import lombok.Data;
import java.math.BigDecimal;


    @Data
    @Entity
    @Table(name = "Vehiculo")
    public class Vehiculo {

        @Id
        @Column(length = 15)
        private String matricula;

        private String marca;

        private String color;

        private Integer potencia;

        private BigDecimal precio;

        // Aquí conectamos con el concesionario
        @ManyToOne(fetch = FetchType.LAZY)
        @JoinColumn(name = "id_concesionario")
        private Concesionario concesionario;

        // Constructores, getters y setters omitidos
    }