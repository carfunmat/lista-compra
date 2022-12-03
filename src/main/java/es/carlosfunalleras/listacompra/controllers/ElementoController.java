package es.carlosfunalleras.listacompra.controllers;

import es.carlosfunalleras.listacompra.models.entity.Elemento;
import es.carlosfunalleras.listacompra.models.service.IElementoService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("/elementos-lista")
public class ElementoController {

    private final IElementoService elementoService;

    public ElementoController(IElementoService elementoService) {
        this.elementoService = elementoService;
    }

    @GetMapping("/lista")
    public List<Elemento> listaElementos() {
        return elementoService.findAll();
    }

    //TODO agregar endpoints ElementoService
    @GetMapping("/fecha")
    public List<Elemento> getElementosByFecha(LocalDate fecha) {
        return elementoService.findByFecha(fecha);
    }

}
