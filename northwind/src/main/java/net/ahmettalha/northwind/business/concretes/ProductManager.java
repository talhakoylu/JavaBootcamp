package net.ahmettalha.northwind.business.concretes;

import java.util.List;

import net.ahmettalha.northwind.core.utilities.results.DataResult;
import net.ahmettalha.northwind.core.utilities.results.Result;
import net.ahmettalha.northwind.core.utilities.results.SuccessDataResult;
import net.ahmettalha.northwind.core.utilities.results.SuccessResult;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.ahmettalha.northwind.business.abstracts.ProductService;
import net.ahmettalha.northwind.dataAccess.abstracts.ProductDao;
import net.ahmettalha.northwind.entities.concretes.Product;

@Service
public class ProductManager implements ProductService{

	private ProductDao productDao;
	
	@Autowired	
	public ProductManager(ProductDao productDao) {
		super();
		this.productDao = productDao;
	}



	@Override
	public DataResult<List<Product>> getAll() {
		return new SuccessDataResult<List<Product>>(this.productDao.findAll(), "Data listed successfully");
	}

	@Override
	public Result add(Product product) {
		this.productDao.save(product);
		return new SuccessResult("Product has been added.");
	}

}
