package es.carlosfunalleras.listacompra.models.service;

import es.carlosfunalleras.listacompra.models.entity.Producto;

import java.util.List;

public interface IProductoService {

    List<Producto> findAll();
    Producto findById(Long id);

}
