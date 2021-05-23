package net.ahmettalha.northwind.business.abstracts;

import java.util.List;

import net.ahmettalha.northwind.core.utilities.results.DataResult;
import net.ahmettalha.northwind.core.utilities.results.Result;
import net.ahmettalha.northwind.entities.concretes.Product;

public interface ProductService {
	DataResult<List<Product>> getAll();
	Result add(Product product);
}
