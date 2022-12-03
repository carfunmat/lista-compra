package es.carlosfunalleras.listacompra.models.repository;

import es.carlosfunalleras.listacompra.models.entity.Elemento;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;
import java.util.Optional;

public interface ElementoRepository extends JpaRepository<Elemento, Long> {

    List<Elemento> findByFecha(LocalDate fecha);

    List<Elemento> findByProductoNombre(String nombreProducto);

    Optional<Elemento> findByProductoNombreAndFecha(String nombreProducto, LocalDate fecha);

}
