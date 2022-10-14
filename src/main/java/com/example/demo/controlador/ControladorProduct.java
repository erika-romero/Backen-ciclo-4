package com.example.demo.controlador;
import com.example.demo.modelo.ModeloProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;
import com.example.demo.servicio.ServiciosProduct;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/api/product")
@CrossOrigin("*")
public class ControladorProduct {
    @Autowired
    private ServiciosProduct ProductService;

    @GetMapping("/all")
    public List<ModeloProduct> getAll() {
        return ProductService.getAll();
    }

    @GetMapping("/{reference}")
    public Optional<ModeloProduct> getReference(@PathVariable("reference") String reference) {
        return ProductService.getReference(reference);
    }

    @PostMapping("/new")
    @ResponseStatus(HttpStatus.CREATED)
    public ModeloProduct create(@RequestBody ModeloProduct producto) {
        return ProductService.create(producto);
    }

    @PutMapping("/update")
    @ResponseStatus(HttpStatus.CREATED)
    public ModeloProduct update(@RequestBody ModeloProduct producto) {
        return ProductService.update(producto);
    }

    @DeleteMapping("/{reference}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public boolean delete(@PathVariable("reference") String reference) {
        return ProductService.delete(reference);
    }

    @GetMapping("/name/{name}")
    public List<ModeloProduct> gadgetsByName(@PathVariable("name") double nombre) {
        return ProductService.productByPrice(nombre);
    }
    @GetMapping("/price/{price}")
    public List<ModeloProduct> gadgetsByPrice(@PathVariable("price") double precio) {
        return ProductService.productByPrice(precio);
    }

    @GetMapping("/description/{description}")
    public List<ModeloProduct> findByDescriptionLike(@PathVariable("description") String description) {
        return ProductService.findByDescriptionLike(description);
    }
}
