package com.example.demo.interfaces;

import com.example.demo.modelo.ModeloProduct;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.List;
import java.util.Optional;


public interface InterfaceProduct extends MongoRepository <ModeloProduct, Integer> {

    Optional<ModeloProduct> findByReference(String reference);

    public List<ModeloProduct> findByPriceLessThanEqual(double precio);
    public List<ModeloProduct> findByDescriptionLike(String description);

}