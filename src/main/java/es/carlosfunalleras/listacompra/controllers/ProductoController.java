package es.carlosfunalleras.listacompra.controllers;

import es.carlosfunalleras.listacompra.models.entity.Producto;
import es.carlosfunalleras.listacompra.models.service.IProductoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/productos")
public class ProductoController {

    private final IProductoService productoService;

    public ProductoController(IProductoService productoService) {
        this.productoService = productoService;
    }

    @GetMapping("/lista")
    public List<Producto> listaProductos() {
        return productoService.findAll();
    }

    @GetMapping("/{id}")
    public Producto producto(@PathVariable Long id) {
        return productoService.findById(id);
    }

}
