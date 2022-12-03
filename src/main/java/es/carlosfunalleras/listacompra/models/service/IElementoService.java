package es.carlosfunalleras.listacompra.models.service;

import es.carlosfunalleras.listacompra.models.entity.Elemento;

import java.time.LocalDate;
import java.util.List;

public interface IElementoService {

    List<Elemento> findAll();

    List<Elemento> findByFecha(LocalDate fecha);

    List<Elemento> findByProducto(String nombreProducto);

    Elemento findByProductoAndFecha(String nombreProducto, LocalDate fecha);

}
