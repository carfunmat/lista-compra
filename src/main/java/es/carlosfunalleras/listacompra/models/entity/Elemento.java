package es.carlosfunalleras.listacompra.models.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

import java.time.LocalDate;

@Entity
@Table(name = "elementos")
@Getter
@Setter
public class Elemento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "producto_id")
    @NonNull
    private Producto producto;

    private Integer cantidad;

    @Temporal(TemporalType.DATE)
    private LocalDate fecha;

}
