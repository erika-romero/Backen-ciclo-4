package com.example.demo.repositorio;

import com.example.demo.interfaces.InterfaceProduct;
import com.example.demo.modelo.ModeloProduct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
@Repository
public class RepositorioProduct {
    @Autowired
    private InterfaceProduct ProductCRUDRepository;

    public List<ModeloProduct> getAll() {
        return ProductCRUDRepository.findAll();
    }

    public Optional<ModeloProduct> getReference(Integer id) {
        return ProductCRUDRepository.findById(id);
    }

    public Optional<ModeloProduct> getReference(String reference) {
        return ProductCRUDRepository.findByReference(reference);
    }

    public ModeloProduct create(ModeloProduct reference) {
        return ProductCRUDRepository.save(reference);
    }

    public void update(ModeloProduct reference) {
        ProductCRUDRepository.save(reference);
    }

    public void delete(ModeloProduct reference) {
        ProductCRUDRepository.delete(reference);
    }

    //Reto 5
    public List<ModeloProduct> productByPrice(double precio) {
        return ProductCRUDRepository.findByPriceLessThanEqual(precio);
    }

    public List<ModeloProduct> findByDescriptionLike(String description) {
        return ProductCRUDRepository.findByDescriptionLike(description);
    }
}
