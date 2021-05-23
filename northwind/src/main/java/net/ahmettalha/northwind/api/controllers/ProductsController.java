package net.ahmettalha.northwind.api.controllers;

import java.util.List;

import net.ahmettalha.northwind.core.utilities.results.DataResult;
import net.ahmettalha.northwind.core.utilities.results.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import net.ahmettalha.northwind.business.abstracts.ProductService;
import net.ahmettalha.northwind.entities.concretes.Product;

@RestController
@RequestMapping("/api/products")
public class ProductsController {

    private ProductService productService;

    @Autowired
    public ProductsController(ProductService productService) {
        super();
        this.productService = productService;
    }


    @GetMapping("/getall")
    public DataResult<List<Product>> getAll() {
        return this.productService.getAll();
    }

    @PostMapping("/add")
    public Result add(@RequestBody Product product){
        return this.productService.add(product);
    }
}
