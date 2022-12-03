package es.carlosfunalleras.listacompra.models.service;

import es.carlosfunalleras.listacompra.models.entity.Elemento;
import es.carlosfunalleras.listacompra.models.repository.ElementoRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ElementoServiceImpl implements IElementoService {

    private final ElementoRepository repository;

    public ElementoServiceImpl(ElementoRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Elemento> findAll() {
        return repository.findAll();
    }

    @Override
    public List<Elemento> findByFecha(LocalDate fecha) {
        return repository.findByFecha(fecha);
    }

    @Override
    public List<Elemento> findByProducto(String nombreProducto) {
        return repository.findByProductoNombre(nombreProducto);
    }

    @Override
    public Elemento findByProductoAndFecha(String nombreProducto, LocalDate fecha) {
        return repository.findByProductoNombreAndFecha(nombreProducto, fecha).orElse(null);
    }
}
