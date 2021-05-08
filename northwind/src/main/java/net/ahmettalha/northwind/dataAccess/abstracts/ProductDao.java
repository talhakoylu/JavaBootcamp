package net.ahmettalha.northwind.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import net.ahmettalha.northwind.entities.concretes.Product;

public interface ProductDao extends JpaRepository<Product, Integer>{
	
}
