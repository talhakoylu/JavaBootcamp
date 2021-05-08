package nLayeredDemo.business.concretes;

import java.util.List;

import nLayeredDemo.business.abstracts.ProductService;
import nLayeredDemo.core.LoggerService;
import nLayeredDemo.dataAccess.abstracts.ProductDao;
import nLayeredDemo.entities.concretes.Product;

public class ProductManager implements ProductService{

	private ProductDao dao;
	private LoggerService loggerService;
	
	public ProductManager(ProductDao dao, LoggerService loggerService) {
		this.dao = dao;
		this.loggerService = loggerService;
	}

	@Override
	public void add(Product product) {
		if (product.getCategoryId() == 1) {
			System.out.println("Bu kategoride ürün kabul edilmiyor.");
			return;
		}
		
		this.dao.add(product);		
		this.loggerService.logToSystem("Ürün eklendi");
	}

	@Override
	public List<Product> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
