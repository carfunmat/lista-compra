package es.carlosfunalleras.listacompra.models.repository;

import es.carlosfunalleras.listacompra.models.entity.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
