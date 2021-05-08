package net.ahmettalha.northwind.business.abstracts;

import java.util.List;

import net.ahmettalha.northwind.entities.concretes.Product;

public interface ProductService {
	List<Product> getAll();
}
